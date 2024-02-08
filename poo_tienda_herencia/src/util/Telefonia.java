package util;

public class Telefonia extends Producto {
	public String sistemaoperativo;
	public double almacenamiento;

	public Telefonia(int id_producto, String categoria, String descripcion, double precio, int stock,
			String sistemaoperativo, double almacenamiento) {
		super(id_producto, categoria, descripcion, precio, stock);
		this.sistemaoperativo = sistemaoperativo;
		this.almacenamiento = almacenamiento;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println(
				" | Sistema Operativo: " + this.sistemaoperativo + " | Almacenamiento: " + this.almacenamiento + "GB");
	}

}
