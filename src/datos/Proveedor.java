package datos;

import java.sql.Date;

public class Proveedor {

	private String razon_social;
	private String cuit;
	private String direccion;
	private String telefono;
	private String fax;
	private String email;
	private String fecha_ultima_compra;
	
	public String getRazonSocial() {
		return razon_social;
	}
	public String getCuit() {
		return cuit;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getFax() {
		return fax;
	}
	public String getEmail() {
		return email;
	}
	public String getFechaUltimaCompra() {
		return fecha_ultima_compra;
	}
	public void setRazonSocial(String razon_social) {
		this.razon_social = razon_social;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFechaUltimaCompra(String fecha_ultima_compra) {
		this.fecha_ultima_compra = fecha_ultima_compra;
	}
}
