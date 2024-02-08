package util;

public class Ropa extends Producto {
	public String talla;
	public String color;

	public Ropa(int id_producto, String categoria, String descripcion, double precio, int stock, String talla,
			String color) {
		super(id_producto, categoria, descripcion, precio, stock);
		this.talla = talla;
		this.color = color;
	}
	public void imprimir() {
		super.imprimir();
		System.out.println(" | Talla: "+this.talla+" | Color: "+this.color);
	}
}
