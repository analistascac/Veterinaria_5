package datos;

import java.text.SimpleDateFormat;

public final class Veterinario extends Persona {

	// la matrícula es un String porque puede ser 125214MP o 25001MN.
	private String matricula;

	public Veterinario() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {

		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");

		return "Id: " + getId() + "\nNombre: " + getNombre() + "\nApellido: "
				+ getApellido() + "\nTipo de Documento: " + getTipoDocumento()
				+ "\nNumero de Documento: " + getDocumento()
				+ "\nFecha de Nacimiento: "
				+ formateador.format(getFechaNacimiento())
				+ "\nDireccion Completa: " + getDireccionCompleta()
				+ "\nTelefono: " + getTelefono() + "\nE-Mail: "
				+ getDireccionMail() + "\nMatricula " + matricula + "\n";
	}

}
