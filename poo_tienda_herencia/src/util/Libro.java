package util;

public class Libro extends Producto{
	public String isbn;
	public String autor;
		
	public Libro(int id_producto, String categoria, String descripcion, double precio, int stock, String isbn,
			String autor) {
		super(id_producto, categoria, descripcion, precio, stock);
		this.isbn = isbn;
		this.autor = autor;
	}

	public void imprimir() {
		super.imprimir();
		System.out.println(" ISBN: "+this.isbn +" | Autor: " + this.autor);
	}
}
