package datos;

public class MascotaEnVenta extends Mascota {

	private Double precioCosto;
	private Double precioVenta;

	public Double getPrecioCosto() {
		return precioCosto;
	}

	public void setPrecioCosto(Double precioCosto) {
		this.precioCosto = precioCosto;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	@Override
	public String toString() {
		return "Id: " + getId() + "\nNombre Cientifico: "
				+ getNombreCientifico() + "\nNombre Vulgar: "
				+ getNombreVulgar() + "\nDescripcion: " + getDescripcion()
				+ "\nPrecio de Costo: " + precioCosto + "\nPrecio de Venta: "
				+ precioVenta + "\n";
	}

}
