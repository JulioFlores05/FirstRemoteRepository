package util;

public class Producto {
	protected int id_producto;
	protected String categoria;
	protected String descripcion;
	protected double precio;
	protected int stock;
	public Producto(int id_producto, String categoria, String descripcion, double precio, int stock) {
		super();
		this.id_producto = id_producto;
		this.categoria = categoria;
		this.descripcion = descripcion;
		this.precio = precio;
		this.stock = stock;
	}
	public void imprimir() {
		System.out.print("ID Producto: "+this.id_producto+" | Stock: "+this.stock+" | Descripción: "+this.descripcion+" | Precio: "+this.precio+"€ | Categoria: "+this.categoria);
	}
}
