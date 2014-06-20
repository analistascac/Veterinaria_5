package datos;

import java.util.ArrayList;
import java.util.Date;

public class Datos {
	
	private ArrayList<Empleado> empleados;
	private ArrayList<Veterinario> veterinarios;
	private ArrayList<Cliente> cliente;
	private ArrayList<Mascota> mascotas;
	private ArrayList<MascotaEnVenta> mascotaEnVenta;
	private ArrayList<Atencion> atencion;
	private ArrayList<Ventas> ventas;
	
	public Datos(){
		
		empleados = new ArrayList<Empleado>();
		veterinarios = new ArrayList<Veterinario>();
		cliente = new ArrayList<Cliente>();
		mascotas = new ArrayList<Mascota>();
		mascotaEnVenta = new ArrayList<MascotaEnVenta>();
		atencion = new ArrayList<Atencion>();
		ventas = new ArrayList<Ventas>();
		
		
		try {
			cargarArrays();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	public ArrayList<Veterinario> getVeterinarios() {
		return veterinarios;
	}

	public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
		this.veterinarios = veterinarios;
	}

	public ArrayList<Cliente> getCliente() {
		return cliente;
	}

	public void setCliente(ArrayList<Cliente> cliente) {
		this.cliente = cliente;
	}

	public ArrayList<Mascota> getMascotas() {
		return mascotas;
	}

	public void setMascotas(ArrayList<Mascota> mascotas) {
		this.mascotas = mascotas;
	}

	public ArrayList<MascotaEnVenta> getMascotaEnVenta() {
		return mascotaEnVenta;
	}

	public void setMascotaEnVenta(ArrayList<MascotaEnVenta> mascotaEnVenta) {
		this.mascotaEnVenta = mascotaEnVenta;
	}

	public ArrayList<Atencion> getAtencion() {
		return atencion;
	}

	public void setAtencion(ArrayList<Atencion> atencion) {
		this.atencion = atencion;
	}

	public ArrayList<Ventas> getVentas() {
		return ventas;
	}

	public void setVentas(ArrayList<Ventas> ventas) {
		this.ventas = ventas;
	}
	
	
	// Cantidad

	public int cantClientes() {
		return cliente.size();
	}

	public int cantAtenciones() {
		return atencion.size();
	}

	public int cantMascotasEnVenta() {
		return mascotaEnVenta.size();
	}

	public int cantEmpleados() {
		return empleados.size();
	}

	public int cantVeterinarios() {
		return veterinarios.size();
	}

	public int cantMascotas() {
		return mascotas.size();
	}

	public int cantVentas() {
		return ventas.size();
	}

	
	@SuppressWarnings("deprecation")
	private void cargarArrays() throws Exception {
		
		Especies especies = new Especies();
		
		Cliente cliente0 = new Cliente();
		cliente0.setId(cantClientes());
		cliente0.setNombre("Adrian");
		cliente0.setApellido("Schmidt");
		cliente0.setTipoDocumento("DNI");
		cliente0.setDocumento("99999999");
		cliente0.setFechaNacimiento(new Date("16/09/1988"));
		cliente0.setDireccionCompleta("IP CAC");
		cliente0.setTelefono("1560572244");
		cliente0.setDireccionMail("analistascac@gmail.com");
		cliente0.setTipoCuenta("VIP");
		cliente0.setOcupacion("Analista de Sistemas");
		this.cliente.add(cliente0);

		Cliente cliente1 = new Cliente();
		cliente1.setId(cantClientes());
		cliente1.setNombre("Marcelo");
		cliente1.setApellido("Capossi");
		cliente1.setTipoDocumento("DNI");
		cliente1.setDocumento("99999999");
		cliente1.setFechaNacimiento(new Date("16/09/1988"));
		cliente1.setDireccionCompleta("Los incas 4292");
		cliente1.setTelefono("1560572244");
		cliente1.setDireccionMail("analistascac@gmail.com");
		cliente1.setTipoCuenta("VIP");
		cliente1.setOcupacion("Analista de Sistemas");
		this.cliente.add(cliente1);

		Cliente cliente2 = new Cliente();
		cliente2.setId(cantClientes());
		cliente2.setNombre("Damian");
		cliente2.setApellido("Romero");
		cliente2.setTipoDocumento("DNI");
		cliente2.setDocumento("99999999");
		cliente2.setFechaNacimiento(new Date("16/09/1988"));
		cliente2.setDireccionCompleta("Los incas 4292");
		cliente2.setTelefono("1560572244");
		cliente2.setDireccionMail("analistascac@gmail.com");
		cliente2.setTipoCuenta("VIP");
		cliente2.setOcupacion("Analista de Sistemas");
		this.cliente.add(cliente2);

		Mascota mascota0 = new Mascota();
		mascota0.setIdEspecie(0);
		mascota0.setNombreCientifico(especies.getEspecies().get(mascota0.getIdEspecie()));
		mascota0.setNombreVulgar(especies.getNombresVulgares().get(mascota0.getIdEspecie()));
		mascota0.setDescripcion("Dalmata");
		mascota0.setId(cantMascotas());
		this.mascotas.add(mascota0);

		Mascota mascota1 = new Mascota();
		mascota1.setIdEspecie(0);
		mascota1.setNombreCientifico(especies.getEspecies().get(mascota1.getIdEspecie()));
		mascota1.setNombreVulgar(especies.getNombresVulgares().get(mascota1.getIdEspecie()));
		mascota1.setDescripcion("Pekines");
		mascota1.setId(cantMascotas());
		this.mascotas.add(mascota1);

		Mascota mascota2 = new Mascota();
		mascota2.setIdEspecie(1);
		mascota2.setNombreCientifico(especies.getEspecies().get(mascota2.getIdEspecie()));
		mascota2.setNombreVulgar(especies.getNombresVulgares().get(mascota2.getIdEspecie()));
		mascota2.setDescripcion("Siames");
		mascota2.setId(cantMascotas());
		this.mascotas.add(mascota2);

		Mascota mascota3 = new Mascota();
		mascota3.setIdEspecie(1);
		mascota3.setNombreCientifico(especies.getEspecies().get(mascota3.getIdEspecie()));
		mascota3.setNombreVulgar(especies.getNombresVulgares().get(mascota3.getIdEspecie()));
		mascota3.setDescripcion("Gato pardo");
		mascota3.setId(cantMascotas());
		this.mascotas.add(mascota3);

		Mascota mascota4 = new Mascota();
		mascota4.setIdEspecie(0);
		mascota4.setNombreCientifico(especies.getEspecies().get(mascota4.getIdEspecie()));
		mascota4.setNombreVulgar(especies.getNombresVulgares().get(mascota4.getIdEspecie()));
		mascota4.setDescripcion("Pastor Aleman");
		mascota4.setId(cantMascotas());
		this.mascotas.add(mascota4);

		Mascota mascota5 = new Mascota();
		mascota5.setIdEspecie(0);
		mascota5.setNombreCientifico(especies.getEspecies().get(mascota5.getIdEspecie()));
		mascota5.setNombreVulgar(especies.getNombresVulgares().get(mascota5.getIdEspecie()));
		mascota5.setDescripcion("Pastor Aleman");
		mascota5.setId(cantMascotas());
		this.mascotas.add(mascota5);

		MascotaEnVenta mascotaEnVenta0 = new MascotaEnVenta();
		mascotaEnVenta0.setIdEspecie(0);
		mascotaEnVenta0.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta0
				.getIdEspecie()));
		mascotaEnVenta0.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta0
				.getIdEspecie()));
		mascotaEnVenta0.setDescripcion("Dalmata");
		mascotaEnVenta0.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta0);

		MascotaEnVenta mascotaEnVenta1 = new MascotaEnVenta();
		mascotaEnVenta1.setIdEspecie(0);
		mascotaEnVenta1.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta1
				.getIdEspecie()));
		mascotaEnVenta1.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta1
				.getIdEspecie()));
		mascotaEnVenta1.setDescripcion("Pekines");
		mascotaEnVenta1.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta1);

		MascotaEnVenta mascotaEnVenta2 = new MascotaEnVenta();
		mascotaEnVenta2.setIdEspecie(1);
		mascotaEnVenta2.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta2
				.getIdEspecie()));
		mascotaEnVenta2.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta2
				.getIdEspecie()));
		mascotaEnVenta2.setDescripcion("Siames");
		mascotaEnVenta2.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta2);

		MascotaEnVenta mascotaEnVenta3 = new MascotaEnVenta();
		mascotaEnVenta3.setIdEspecie(1);
		mascotaEnVenta3.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta3
				.getIdEspecie()));
		mascotaEnVenta3.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta3
				.getIdEspecie()));
		mascotaEnVenta3.setDescripcion("Gato pardo");
		mascotaEnVenta3.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta3);

		MascotaEnVenta mascotaEnVenta4 = new MascotaEnVenta();
		mascotaEnVenta4.setIdEspecie(0);
		mascotaEnVenta4.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta4
				.getIdEspecie()));
		mascotaEnVenta4.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta4
				.getIdEspecie()));
		mascotaEnVenta4.setDescripcion("Pastor Aleman");
		mascotaEnVenta4.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta4);

		MascotaEnVenta mascotaEnVenta5 = new MascotaEnVenta();
		mascotaEnVenta5.setIdEspecie(0);
		mascotaEnVenta5.setNombreCientifico(especies.getEspecies().get(mascotaEnVenta5
				.getIdEspecie()));
		mascotaEnVenta5.setNombreVulgar(especies.getNombresVulgares().get(mascotaEnVenta5
				.getIdEspecie()));
		mascotaEnVenta5.setDescripcion("Pastor Aleman");
		mascotaEnVenta5.setId(cantMascotasEnVenta());
		this.mascotaEnVenta.add(mascotaEnVenta5);

		Veterinario veterinario0 = new Veterinario();
		veterinario0.setId(cantVeterinarios());
		veterinario0.setNombre("Roberto");
		veterinario0.setApellido("Estrada");
		veterinario0.setTipoDocumento("DNI");
		veterinario0.setDocumento("28328872");
		veterinario0.setFechaNacimiento(new Date("16/09/1988"));
		veterinario0.setDireccionCompleta("IPCAC");
		veterinario0.setTelefono("99999");
		veterinario0.setDireccionMail("analistascac@gmail.com");
		veterinario0.setMatricula("999999");
		this.veterinarios.add(veterinario0);

		Veterinario veterinario1 = new Veterinario();
		veterinario1.setId(cantVeterinarios());
		veterinario1.setNombre("Matias");
		veterinario1.setApellido("Novas");
		veterinario1.setTipoDocumento("DNI");
		veterinario1.setDocumento("28328873");
		veterinario1.setFechaNacimiento(new Date("16/09/1988"));
		veterinario1.setDireccionCompleta("IPCAC");
		veterinario1.setTelefono("99999");
		veterinario1.setDireccionMail("analistascac@gmail.com");
		veterinario1.setMatricula("999999");
		this.veterinarios.add(veterinario1);

		Veterinario veterinario2 = new Veterinario();
		veterinario2.setId(cantVeterinarios());
		veterinario2.setNombre("Cristian");
		veterinario2.setApellido("Ramirez");
		veterinario2.setTipoDocumento("DNI");
		veterinario2.setDocumento("99999999");
		veterinario2.setFechaNacimiento(new Date("16/09/1988"));
		veterinario2.setDireccionCompleta("IPCAC");
		veterinario2.setTelefono("99999");
		veterinario2.setDireccionMail("analistascac@gmail.com");
		veterinario2.setMatricula("999999");
		this.veterinarios.add(veterinario2);

		Atencion atencion0 = new Atencion();
		atencion0.setIdMascota(0);
		atencion0.setIdCliente(0);
		atencion0.setIdVeterinario(2);
		atencion0.setDescripcion("Desparacitacion");
		atencion0.setId(cantAtenciones());
		this.atencion.add(atencion0);

		Atencion atencion1 = new Atencion();
		atencion1.setIdMascota(0);
		atencion1.setIdCliente(0);
		atencion1.setIdVeterinario(2);
		atencion1.setDescripcion("Desparacitacion");
		atencion1.setId(cantAtenciones());
		this.atencion.add(atencion1);

		Atencion atencion2 = new Atencion();
		atencion2.setIdMascota(1);
		atencion2.setIdCliente(0);
		atencion2.setIdVeterinario(1);
		atencion2.setDescripcion("Desparacitacion");
		atencion2.setId(cantAtenciones());
		this.atencion.add(atencion2);

		Atencion atencion3 = new Atencion();
		atencion3.setIdMascota(2);
		atencion3.setIdCliente(0);
		atencion3.setIdVeterinario(1);
		atencion3.setDescripcion("Desparacitacion");
		atencion3.setId(cantAtenciones());
		this.atencion.add(atencion3);

		Empleado empleado = new Empleado();
		empleado.setId(cantEmpleados());
		empleado.setNombre("Juanito");
		empleado.setApellido("Perez");
		empleado.setTipoDocumento("DNI");
		empleado.setDocumento("38383338");
		empleado.setFechaNacimiento(new Date("16/09/1988"));
		empleado.setDireccionCompleta("Calle Delcool 199");
		empleado.setTelefono("42194219");
		empleado.setDireccionMail("miemail@mail.com");
		this.empleados.add(empleado);

		Empleado empleado2 = new Empleado();
		empleado2.setId(cantEmpleados());
		empleado2.setNombre("Juanito");
		empleado2.setApellido("Perez");
		empleado2.setTipoDocumento("DNI");
		empleado2.setDocumento("38383338");
		empleado2.setFechaNacimiento(new Date("16/09/1988"));
		empleado2.setDireccionCompleta("Calle Delcool 199");
		empleado2.setTelefono("42194219");
		empleado2.setDireccionMail("miemail@mail.com");
		this.empleados.add(empleado2);

		Ventas venta = new Ventas();
		venta.setId(cantVentas());
		venta.setId_vendedor(0);
		venta.setId_cliente(0);
		venta.setImporte(100);
		venta.setFecha(new Date("16/09/1988"));
		venta.setAbonado(true);
		this.ventas.add(venta);

		Ventas venta2 = new Ventas();
		venta2.setId(cantVentas());
		venta2.setId_vendedor(1);
		venta2.setId_cliente(0);
		venta2.setImporte(100);
		venta2.setFecha(new Date("16/09/1988"));
		venta2.setAbonado(true);
		this.ventas.add(venta2);

		Ventas venta3 = new Ventas();
		venta3.setId(cantVentas());
		venta3.setId_vendedor(1);
		venta3.setId_cliente(0);
		venta3.setImporte(100);
		venta3.setFecha(new Date("16/09/1988"));
		venta3.setAbonado(true);
		this.ventas.add(venta3);

		Ventas venta4 = new Ventas();
		venta4.setId(cantVentas());
		venta4.setId_vendedor(1);
		venta4.setId_cliente(0);
		venta4.setImporte(100);
		venta4.setFecha(new Date("16/09/1988"));
		venta4.setAbonado(true);
		this.ventas.add(venta4);
	}
	

	
	

}
