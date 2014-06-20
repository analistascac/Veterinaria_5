package logica;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class KeyboardReader {

	final private static String ERROR_MSG = "Ingreso un valor incorrecto, vuelva a intentarlo";

	private static String str;

	private boolean isInteger(String number) {
		boolean prueba;

		try {
			Integer.parseInt(number);
			prueba = true;
		} catch (Exception e) {
			prueba = false;
		}
		return prueba;
	}

	private boolean isDouble(String number) {
		boolean prueba;

		try {
			Double.parseDouble(number);
			prueba = true;
		} catch (Exception e) {
			prueba = false;
		}
		return prueba;
	}

	private boolean isDate(String fecha) {
		try {
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy",
					Locale.getDefault());
			formatoFecha.setLenient(false);
			formatoFecha.parse(fecha);
		} catch (ParseException e) {
			return false;
		}
		return true;
	}

	private boolean validateEmail(String email) {

		// Establecer el patron
		Pattern p = Pattern.compile("[-\\w\\.]+@[\\.\\w]+\\.\\w+");

		// Asociar el string al patron
		Matcher m = p.matcher(email);

		// Comprobar si encaja
		return m.matches();

	}

	private void read() throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		str = br.readLine();

		while ((str.length() == 0) || (str.substring(0, 1).equals(" "))) {

			System.out.println(ERROR_MSG);
			str = br.readLine();
		}
	}

	private void read(String msg) throws Exception {
		System.out.println(msg);
		read();
	}

	protected int readIntLine() throws Exception {
		read();
		while (!isInteger(str)) {
			System.out.println(ERROR_MSG);
			read();

		}
		return Integer.parseInt(str);
	}

	protected int readIntLine(String msg) throws Exception {
		read(msg);
		while (!isInteger(str)) {
			System.out.println(ERROR_MSG);
			read();
		}
		return Integer.parseInt(str);
	}

	// Este metodo recibe por parametros un mensaje y una lista para seleccionar
	// un item. Devuelve un entero que es la posicion del arreglo de la lista.
	protected int readIntLine(String msg, ArrayList<String> items)
			throws Exception {
		int i, j;

		System.out.println(msg + "\n");
		System.out.println("Seleccione una opcion: \n");
		for (i = 0; i < items.size(); i++) {
			j = i + 1; // se usa esta variable para q los items empiezen desde 1
			System.out.println(j + ". " + items.get(i));
		}

		read();
		while (!isInteger(str) || Integer.parseInt(str) < 1
				|| Integer.parseInt(str) > items.size()) {
			System.out.println(ERROR_MSG);
			System.out.println("Seleccione una opcion: \n");
			for (i = 1; i < items.size(); i++) {
				j = i + 1;
				System.out.println(j + ". " + items.get(i));
			}

			read();
		}
		return Integer.parseInt(str) - 1; // es menos uno porque se selecciono
											// j, que era + 1
	}

	protected double readDoubleLine() throws Exception {
		read();
		while (!isDouble(str)) {
			System.out.println(ERROR_MSG);
			read();
		}
		return Double.parseDouble(str);
	}

	protected double readDoubleLine(String msg) throws Exception {
		read(msg);
		while (!isDouble(str)) {
			System.out.println(ERROR_MSG);
			read();
		}
		return Double.parseDouble(str);
	}

	protected String readStringLine() throws Exception {
		read();
		return str;
	}

	protected String readStringLine(String msg) throws Exception {
		read(msg);
		return str;
	}

	protected Date readDateLine() throws Exception {

		SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("(Formato dd/mm/yyyy):");
		read();
		while (!isDate(str)) {
			System.out.println(ERROR_MSG);
			read();
		}

		return formateador.parse(str);

	}

	protected Date readDateLine(String msg) throws Exception {
		System.out.println(msg);
		return readDateLine();

	}

	protected String readMail() throws Exception {
		read();
		while (!validateEmail(str)) {
			System.out.println(ERROR_MSG);
			read();

		}
		return str;

	}

	protected String readMail(String msg) throws Exception {
		System.out.println(msg);
		return readMail();
	}

	protected boolean readBooleanLine() throws Exception {
		System.out.println("'Y' o 'N':");
		read();
		while (str != "y" && str != "Y" && str != "n" && str != "N") {
			System.out.println(ERROR_MSG);
			read();
		}
		return str == "y" || str == "Y";
	}

	protected boolean readBooleanLine(String msg) throws Exception {
		System.out.println(msg);
		return readBooleanLine();
	}

}
