package datos;

import java.text.SimpleDateFormat;

public final class Cliente extends Persona {

	private String tipoCuenta;
	private String ocupacion;

	public Cliente() {
		super();
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
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
				+ getDireccionMail() + "\nCuenta: " + tipoCuenta
				+ "\nOcupacion: " + ocupacion + "\n";
	}

}
