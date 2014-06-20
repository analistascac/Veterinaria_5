package datos;

public class Mascota {

	private int id;
	private int idEspecie;
	private String nombreCientifico;
	private String nombreVulgar;
	private String descripcion;
	private String cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIdEspecie(int idEspecie) {
		this.idEspecie = idEspecie;
	}

	public int getIdEspecie() {
		return idEspecie;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public String getNombreVulgar() {
		return nombreVulgar;
	}

	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Id: " + id + "\nNombre Cientifico: " + nombreCientifico
				+ "\nNombre Vulgar: " + nombreVulgar + "\nDescripcion: "
				+ descripcion + "\nDueño: " + cliente + "\n";
	}

}
