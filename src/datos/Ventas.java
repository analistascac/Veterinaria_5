package datos;

import java.util.Date;

public class Ventas {

	private int id;
	private int id_cliente;
	private int id_vendedor;
	private int importe;
	private boolean abonado;
	private Date fecha;

	public Ventas() {
		super();
		this.id = 0;
		this.id_cliente = 0;
		this.importe = 0;
		this.abonado = true;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getImporte() {
		return importe;
	}

	public void setImporte(int importe) {
		this.importe = importe;
	}

	public boolean isAbonado() {
		return abonado;
	}

	public void setAbonado(boolean abonado) {
		this.abonado = abonado;
	}

	public int getId_vendedor() {
		return id_vendedor;
	}

	public void setId_vendedor(int id_vendedor) {
		this.id_vendedor = id_vendedor;
	}

	@Override
	public String toString() {
		return "Ventas [id=" + id + ", id_cliente=" + id_cliente
				+ ", id_vendedor=" + id_vendedor + ", importe=" + importe
				+ ", abonado=" + abonado + ", fecha=" + fecha + "]";
	}

}
