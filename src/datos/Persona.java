package datos;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Persona {
	
	private int id;
	private String nombre;
	private String apellido;
	private String tipoDocumento;
	private String documento;
	private Date fechaNacimiento;
	private String direccionCompleta;
	private String telefono;
	private String direccionMail;

	public Persona() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public Date getFechaNacimiento() {

		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getDireccionCompleta() {
		return direccionCompleta;
	}

	public void setDireccionCompleta(String direccionCompleta) {
		this.direccionCompleta = direccionCompleta;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String string) {
		this.telefono = string;
	}

	public String getDireccionMail() {
		return direccionMail;
	}

	public void setDireccionMail(String direccionMail) {
		this.direccionMail = direccionMail;
	}

	@Override
	public String toString() {
		
		SimpleDateFormat formateador = new SimpleDateFormat("dd-MM-yyyy");
		
		return "Id: " + id + "\nNombre: " + nombre + "\nApellido=" + apellido
				+ "\nTipo Documento: " + tipoDocumento + "\nDocumento: "
				+ documento + "\nFecha de Nacimiento: " + formateador.format(fechaNacimiento)
				+ "\nDireccion Completa: " + direccionCompleta + "\nTelefono: "
				+ telefono + "\nE-Mail: " + direccionMail + "\n"; 
	}

}
