package datos;
public class Atencion {
	private int id;
	private int idMascota;
	private int idCliente;
	private int idVeterinario;
	private String descripcion;

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdMascota() {
		return idMascota;
	}
	
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public int getIdVeterinario() {
		return idVeterinario;
	}
	
	public void setIdVeterinario(int idVeterinario) {
		this.idVeterinario = idVeterinario;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Id de la operacion: " + id + "\nId de la Mascota: " + idMascota
				+ "\nId del Cliente: " + idCliente + "\nId del Veterinario: "
				+ idVeterinario + "\nDescripcion: " + descripcion + "\n";
	}		
	
	
}
