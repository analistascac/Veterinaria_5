package datos;


public class Articulo {

	private String nombre;
	private String medida;
	private String nombre_cientifico;
	private String nombre_vulgar;
	private String descripcion;
	private Float precio_venta;
	private int cantidad;
	
	public String getNombre() {
		return nombre;
	}
	public String getMedida() {
		return medida;
	}
	public String getNombreCientifico() {
		return nombre_cientifico;
	}
	public String getNombreVulgar() {
		return nombre_vulgar;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setMedida(String medida) {
		this.medida = medida;
	}
	public void setNombreCientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}
	public void setNombreVulgar(String nombre_vulgar) {
		this.nombre_vulgar = nombre_vulgar;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Float getPrecioVenta() {
		return precio_venta;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setPrecioVenta(Float precio_venta) {
		this.precio_venta = precio_venta;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
}
