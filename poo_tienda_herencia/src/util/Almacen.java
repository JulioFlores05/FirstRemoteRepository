package util;

import java.util.ArrayList;

public class Almacen {
	private ArrayList<Producto> productos=new ArrayList();
	public void add(Producto p) {
		productos.add(p);
	}
	public void list() {
		for (Producto producto : productos) {
			producto.imprimir();
		}
	}
	
	public boolean existeProducto(int idProducto) {
		for (Producto producto : productos) {
			if (idProducto == producto.id_producto ) {
				return true;
			}
		}
		return false;
	}
	
	public void list(String categoria) {
		for (Producto producto : productos) {
			if (categoria.equals(producto.categoria)) {
				producto.imprimir();
			}
		}
	}

}
