package logica;

public final class Menu extends KeyboardReader {

	private String msg;
	private String msgError;
	private String[] menuPrincipal;
	private String[] menuAltas;
	private String[] menuInformes;

	public Menu() {

		msg = "Seleccione una operacion:\n";
		msgError = "Ingreso un valor incorrecto, vuelva a intentarlo\n";

		menuPrincipal = new String[] { "1. Altas", "2. Ventas",
				"3. Atenciones", "4. Informes", "0. Terminar\n" };

		menuAltas = new String[] { "1. Alta de cliente",
				"2. Alta de mascota cliente", "3. Alta de mascota a la venta",
				"4. Alta de empleado", "5. Alta de veterinario",
				"0. Regresar\n" };

		menuInformes = new String[] {
				"1. Cliente que mas veces fue atendido por la veterinaria",
				"2. Animales por raza existen en la veterinaria",
				"3. Mascotas atendidas por veterinario",
				"4. Vendedor con mayor cantidad de ventas realizadas",
				"5. Ver datos cargados", "0. Regresar\n" };

	}

	private int menuPrincipal() throws Exception {
		int i, operacion;

		System.out.println("\nMenu Principal\n" + msg);
		for (i = 0; i <= 4; i++) {
			System.out.println(menuPrincipal[i]);
		}

		operacion = readIntLine();

		while (operacion < 0 || operacion > 4) {
			System.out.println(msgError);
			operacion = readIntLine();
		}

		return operacion;

	}

	private int menuAltas() throws Exception {
		int i, operacion;

		System.out.println("\nMenu de Altas\n" + msg);
		for (i = 0; i <= 5; i++) {
			System.out.println(menuAltas[i]);
		}

		operacion = readIntLine();

		while (operacion < 0 || operacion > 5) {
			System.out.println(msgError);
			operacion = readIntLine();
		}

		return operacion;

	}

	private int menuInformes() throws Exception {
		int i, operacion;

		System.out.println("\nMenu de Informes\n" + msg);
		for (i = 0; i <= 5; i++) {
			System.out.println(menuInformes[i]);
		}

		operacion = readIntLine();

		while (operacion < 0 || operacion > 5) {
			System.out.println(msgError);
			operacion = readIntLine();
		}

		return operacion;

	}

	public void ejecutarMenu() {

		int menuPrincipal, menuAltas, menuInformes;
		// Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();

		try {

			menuPrincipal = menuPrincipal();
			while (menuPrincipal != 0) {

				// "1. Altas", "2. Venta", " 3. Atención", "4. Informes"

				switch (menuPrincipal) {
				case 1:

					// Altas
					// "1. Alta de cliente", "2. Alta de mascota cliente",
					// "3. Alta de mascota a la venta", "4. Alta de empleado",
					// "5. Alta de veterinario"
					menuAltas = menuAltas();
					while (menuAltas != 0) {
						switch (menuAltas) {
						case 1:
							operaciones.addCliente();
							break;
						case 2:
							operaciones.addMascota();
							break;
						case 3:
							operaciones.addMascotaEnVenta();
							break;
						case 4:
							operaciones.addEmpleado();
							break;
						case 5:
							operaciones.addVeterinario();
							break;
						}

						menuAltas = menuAltas();

					}

					break;
				case 2:
					operaciones.addVenta();
					break;
				case 3:
					operaciones.addAtencion();
					break;
				case 4:

					menuInformes = menuInformes();

					while (menuInformes != 0) {

						switch (menuInformes) {
						case 1:
							operaciones.clienteMasAtendido();
							break;

						case 2:
							operaciones.animalesPorRaza();
							break;
						case 3:
							operaciones.mascotasAtendidasPorVeterinario();
							break;
						case 4:
							operaciones.mejorVendedor();
							break;
						case 5:
							operaciones.mostrarDatos();
							break;
						}

						menuInformes = menuInformes();
					}
					
					break;

				}

				menuPrincipal = menuPrincipal();

			}

		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
