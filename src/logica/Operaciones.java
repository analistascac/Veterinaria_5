package logica;

import java.util.ArrayList;
import java.util.Iterator;

import datos.*;

public final class Operaciones extends KeyboardReader implements Informes {

	private Datos datos;
	private Especies especies;

	public Operaciones() {

		datos = new Datos();
		especies = new Especies();

	}

	// Ingresos:

	public void addCliente() throws Exception {

		System.out.println("\nAlta de clientes:\n");

		Cliente cliente = new Cliente();

		cliente.setId(datos.cantClientes());

		cliente.setNombre(readStringLine("Nombre:"));

		cliente.setApellido(readStringLine("Apellido:"));

		cliente.setTipoDocumento(readStringLine("Tipo de documento:"));

		cliente.setDocumento(readStringLine("Documento:"));

		cliente.setFechaNacimiento(readDateLine("Fecha de nacimiento"));

		cliente.setDireccionCompleta(readStringLine("Direccion:"));

		cliente.setTelefono(readStringLine("Telefono:"));

		cliente.setDireccionMail(readMail("E-Mail:"));

		cliente.setTipoCuenta(readStringLine("Tipo de cuenta"));

		cliente.setOcupacion(readStringLine("Ocupacion:"));

		datos.getCliente().add(cliente);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ cliente);
	}

	public void addMascota() throws Exception {

		int temp;
		String strTemp;

		System.out.println("\nAlta de mascotas:\n");

		Mascota mascota = new Mascota();

		mascota.setIdEspecie(readIntLine("Nombre cientifico:",
				especies.getEspecies()));

		// el nombre cientifico y el vulgar se agrega automaticamente
		// usando el id de la especie
		mascota.setNombreCientifico(especies.getEspecies().get(
				mascota.getIdEspecie()));

		mascota.setNombreVulgar(especies.getNombresVulgares().get(
				mascota.getIdEspecie()));

		mascota.setDescripcion(readStringLine("Descripcion:"));

		temp = readIntLine("Id del dueño:");

		// comprobación de que el dueño existe.
		// si no existe lo puede agregar

		while (temp >= datos.cantClientes()) {
			System.out
					.println("La cliente no existe, presione 'A' para dar de alta el cliente o cualquier otra tecla para continuar\n");
			strTemp = readStringLine();
			if (strTemp.toUpperCase().equals("A")) {
				addCliente();
				;
				temp = datos.cantClientes() - 1;
			} else {
				temp = readIntLine("Id del dueño:");
			}
		}

		mascota.setId(datos.cantMascotas());

		datos.getMascotas().add(mascota);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ mascota);
	}

	public void addMascotaEnVenta() throws Exception {

		System.out.println("\nAlta de mascotas a la venta:\n");

		MascotaEnVenta mascotaEnVenta = new MascotaEnVenta();

		mascotaEnVenta.setIdEspecie(readIntLine("Nombre cientifico:",
				especies.getEspecies()));

		mascotaEnVenta.setNombreCientifico(especies.getEspecies().get(
				mascotaEnVenta.getIdEspecie()));

		// el nombre cientifico y el vulgar se agrega automaticamente
		// usando el id de la especie

		mascotaEnVenta.setNombreVulgar(especies.getNombresVulgares().get(
				mascotaEnVenta.getIdEspecie()));

		mascotaEnVenta.setDescripcion(readStringLine("Descripcion:"));

		mascotaEnVenta.setPrecioCosto(readDoubleLine("Precio Costo x U:"));

		mascotaEnVenta.setPrecioVenta(readDoubleLine("Precio Venta x U):"));

		mascotaEnVenta.setId(datos.cantMascotasEnVenta());

		datos.getMascotaEnVenta().add(mascotaEnVenta);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ mascotaEnVenta);
	}

	public void addEmpleado() throws Exception {

		System.out.println("\nAlta de empleados:\n");

		Empleado empleado = new Empleado();

		empleado.setId(datos.cantEmpleados());

		empleado.setNombre(readStringLine("Nombre:"));

		empleado.setApellido(readStringLine("Apellido:"));

		empleado.setTipoDocumento(readStringLine("Tipo de documento:"));

		empleado.setDocumento(readStringLine("Documento:"));

		empleado.setFechaNacimiento(readDateLine("Fecha de nacimiento"));

		empleado.setDireccionCompleta(readStringLine("Dirección:"));

		empleado.setTelefono(readStringLine("Telefono:"));

		empleado.setDireccionMail(readMail("E-Mail:"));

		datos.getEmpleados().add(empleado);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ empleado);
	}

	public void addVeterinario() throws Exception {

		System.out.println("\nAlta de veterinarios:\n");

		Veterinario veterinario = new Veterinario();

		veterinario.setId(datos.cantVeterinarios());

		veterinario.setNombre(readStringLine("Nombre:"));

		veterinario.setApellido(readStringLine("Apellido:"));

		veterinario.setTipoDocumento(readStringLine("Tipo de documento:"));

		veterinario.setDocumento(readStringLine("Documento:"));

		veterinario.setFechaNacimiento(readDateLine("Fecha de nacimiento"));

		veterinario.setDireccionCompleta(readStringLine("Dirección:"));

		veterinario.setTelefono(readStringLine("Telefono:"));

		veterinario.setDireccionMail(readMail("E-Mail:"));

		veterinario.setMatricula(readStringLine("Matricula:"));

		datos.getVeterinarios().add(veterinario);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ veterinario);

	}

	public void addAtencion() throws Exception {

		System.out.println("\nCarga de atenciones:\n");
		int temp;
		String strTemp;

		Atencion atencion = new Atencion();

		temp = readIntLine("Ingrese el id de la mascota:");

		while (temp >= datos.cantMascotas()) {
			System.out
					.println("La mascota no existe, presione 'A' para dar de alta la mascota o cualquier otra tecla para continuar\n");
			strTemp = readStringLine();
			if (strTemp.toUpperCase().equals("A")) {
				addMascota();
				temp = datos.cantMascotas() - 1;
			} else {
				temp = readIntLine("Ingrese el id de la mascota:");
			}
		}

		atencion.setIdMascota(temp);

		// carga el dueño utilizando el id de la mascota
		atencion.setIdCliente(datos.getCliente().get(temp).getId());

		temp = readIntLine("Ingrese el id del veterinario:");

		while (temp >= datos.cantVeterinarios()) {
			System.out
					.println("El veterinario no existe, presione 'A' para dar de alta el veterinario o cualquier otra tecla para continuar\n");
			strTemp = readStringLine();
			if (strTemp.toUpperCase().equals("A")) {
				addVeterinario();
				temp = datos.cantVeterinarios() - 1;
			} else {
				temp = readIntLine("Ingrese el id del veterinario:");
			}
		}

		atencion.setIdVeterinario(temp);

		atencion.setDescripcion(readStringLine("Descripcion:"));

		atencion.setId(datos.cantAtenciones());

		datos.getAtencion().add(atencion);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ atencion);

	}

	public void addVenta() throws Exception {

		System.out.println("\nCarga de ventas:\n");
		Ventas venta = new Ventas();

		venta.setId(datos.cantVentas());
		venta.setId_vendedor(readIntLine("Vendedor:"));
		venta.setId_cliente(readIntLine("Cliente:"));
		venta.setImporte(readIntLine("Importe:"));
		venta.setFecha(readDateLine("Fecha: "));
		venta.setAbonado(true);

		datos.getVentas().add(venta);

		System.out
				.println("\nOperacion exitosa. Los datos ingresados son: \n\n"
						+ venta);
	}

	// ====================== Informes ====================== //

	public void clienteMasAtendido() {

		System.out.println("\nCliente más con más atenciones:\n");

		ArrayList<Integer> atencionesPorCliente = new ArrayList<Integer>();
		int i, temp, cmejor = -1, mejor = -1;

		// inicializamos el arreglo
		for (i = 0; i < datos.cantAtenciones(); i++) {
			atencionesPorCliente.add(0);
		}
		// comenzamos a contar
		for (i = 0; i < datos.cantAtenciones(); i++) {
			temp = atencionesPorCliente.get(datos.getAtencion().get(i)
					.getIdCliente());
			atencionesPorCliente.set(datos.getAtencion().get(i).getIdCliente(),
					++temp);
		}

		// informamos
		for (i = 0; i < datos.cantAtenciones(); i++) {
			if (atencionesPorCliente.get(i) > cmejor) {
				cmejor = atencionesPorCliente.get(i);
				mejor = i;
			}
		}
		System.out.println("El cliente mas atendido, tiene ID " + mejor
				+ " con " + cmejor + " atenciones");

	}

	public void animalesPorRaza() {

		System.out.println("\nAnimales por raza en la veterinaria:\n");

		int qty = 0;
		ArrayList<String> al_esp = especies.getEspecies();
		MascotaEnVenta tmp = null;

		try {

			for (String id : al_esp) {

				Iterator<MascotaEnVenta> it = datos.getMascotaEnVenta()
						.iterator();
				qty = 0;

				while (it.hasNext()) {

					tmp = it.next();

					if (tmp.getNombreCientifico() == id) {
						qty += 1;
					}
				}

				System.out.println("\nAnimales Raza " + id + ": " + qty);
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}

	}

	public void mascotasAtendidasPorVeterinario() {

		System.out
				.println("\nMascotas atendidas por un veterinario específico:\n");

		// Iterator<Atencion> it = atencion.iterator();
		Iterator<Atencion> it = datos.getAtencion().iterator();

		int qty = 0;
		boolean existe = false;
		int id = 0;

		try {

			String DNI = readStringLine("Ingrese DNI:");

			Iterator<Veterinario> it_v = datos.getVeterinarios().iterator();

			while (it_v.hasNext() && !existe) {

				Veterinario tmp_v = it_v.next();

				if (DNI.equals(tmp_v.getDocumento())) {
					existe = true;
					id = tmp_v.getId();
				}
			}

			if (existe) {

				while (it.hasNext()) {

					Atencion tmp = it.next();

					if (tmp.getIdVeterinario() == id) {
						qty++;
					}
				}

				System.out.println("\nEl veterinario con DNI: " + DNI
						+ " atendio " + qty + " animal/es");

			} else {
				System.out.println("\nEl veterinario con DNI: " + DNI
						+ " NO ESTA REGISTRADO");
			}

		} catch (Exception e) {
			System.out.println("Exception: " + e);
		}
	}

	public void mejorVendedor() {

		System.out.println("\nMejor vendedor:\n");
		ArrayList<Integer> mejorVendedor = new ArrayList<Integer>();
		int i, temp, cmejor = -1, mejor = -1;

		// inicializamos el arreglo
		for (i = 0; i < datos.getVentas().size(); i++) {
			mejorVendedor.add(0);
		}

		// comenzamos a contar
		for (i = 0; i < datos.cantVentas(); i++) {
			temp = mejorVendedor.get(datos.getVentas().get(i).getId_vendedor());
			mejorVendedor
					.set(datos.getVentas().get(i).getId_vendedor(), ++temp);
		}

		// informamos
		for (i = 0; i < datos.cantVentas(); i++) {
			if (mejorVendedor.get(i) > cmejor) {
				cmejor = mejorVendedor.get(i);
				mejor = i;
			}
		}
		System.out.println("El mejor vendedor tiene ID " + mejor + " con "
				+ cmejor + " ventas");

	}

	public void mostrarDatos() {

		System.out.println("\nLos datos cargados son:\n");
		int i;

		System.out.println("\nDatos de los empleados:\n");

		for (i = 0; i < datos.getEmpleados().size(); i++) {
			System.out.println(datos.getEmpleados().get(i) + "\n");
		}

		System.out.println("\nDatos de los veterinarios:\n");

		for (i = 0; i < datos.getVeterinarios().size(); i++) {
			System.out.println(datos.getVeterinarios().get(i) + "\n");
		}

		System.out.println("\nDatos de los clientes:\n");

		for (i = 0; i < datos.getCliente().size(); i++) {
			System.out.println(datos.getCliente().get(i) + "\n");
		}

		System.out.println("\nDatos de las mascotas:\n");

		for (i = 0; i < datos.getMascotas().size(); i++) {
			System.out.println(datos.getMascotas().get(i) + "\n");
		}

		System.out.println("\nDatos de las mascotas en venta:\n");

		for (i = 0; i < datos.getMascotaEnVenta().size(); i++) {
			System.out.println(datos.getMascotaEnVenta().get(i) + "\n");
		}
		
		System.out.println("\nDatos de atenciones:\n");

		for (i = 0; i < datos.getAtencion().size(); i++) {
			System.out.println(datos.getAtencion().get(i) + "\n");
		}

	}

}
