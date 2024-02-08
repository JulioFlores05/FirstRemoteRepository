package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import util.Almacen;
import util.Libro;
import util.Ropa;
import util.Telefonia;

public class Test_Menu {

	public static void main(String[] args) {
		boolean seguir = true;
		Scanner sc = new Scanner(System.in);
		Almacen almacen = new Almacen();
		while (seguir) {
			System.out.println("***********************************");
			System.out.println("opcion 1-carga de productos");
			System.out.println("opcion 2-imprimir todos los productos");
			System.out.println("opcion 3-imprimir productos poir categoria");
			System.out.println("opcion 99-salir");
			System.out.println("***********************************");

			int opcion = sc.nextInt();
			int opcionAux;
			switch (opcion) {
			case 1:
				System.out.println("Introduzca el nombre del Fichero");
				String nombreDeFichero = sc.next();
				String nombreFichero = "C://Users/Usuario/Desktop/Working on/Ejercicios Clase/poo_tienda_herencia/"
						+ nombreDeFichero + ".txt";
				BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(nombreFichero));
					String linea;
					while ((linea = br.readLine()) != null) {
						String[] datos = linea.split("=");

						// Imprimir las propiedades de cada línea
						for (String dato : datos) {
							System.out.print(dato + " ");
						}
						System.out.println();

						if (!almacen.existeProducto(Integer.parseInt(datos[0]))) {
							if (datos[1].equals("R")) {
								Ropa ropa = new Ropa(Integer.parseInt(datos[0]), datos[1], datos[2],
										Double.parseDouble(datos[3]), Integer.parseInt(datos[4]), datos[5], datos[6]);
								almacen.add(ropa);
							} else if (datos[1].equals("L")) {
								Libro libro = new Libro(Integer.parseInt(datos[0]), datos[1], datos[2],
										Double.parseDouble(datos[3]), Integer.parseInt(datos[4]), datos[5], datos[6]);
								almacen.add(libro);
							} else if (datos[1].equals("T")) {
								Telefonia telefonia = new Telefonia(Integer.parseInt(datos[0]), datos[1], datos[2],
										Double.parseDouble(datos[3]), Integer.parseInt(datos[4]), datos[5],
										Double.parseDouble(datos[6]));
								almacen.add(telefonia);
							}
						} else {
							System.out.println("No se ha podido añadir el producto " + datos[0] + " " + datos[1] + " "
									+ datos[2] + " debido a que ya existe un próducto con dicho id");
						}

					}

				} catch (FileNotFoundException ex) {
					System.out.println("Error: Fichero no encontrado");
					ex.printStackTrace();
				} catch (IOException ex) {
					System.out.println("Error de lectura del fichero");
					ex.printStackTrace();
				} finally {
					try {
						if (br != null) {
							br.close();
						}
					} catch (IOException ex) {
						System.out.println("Error al cerrar el fichero");
						ex.printStackTrace();
					}
				}
				break;
			case 2:
				almacen.list();
				break;
			case 3:
				String categoria;
				do {
					System.out.println("-----IMPRIMIR POR CATEGORIA-----");
					System.out.println("(1) Ropa");
					System.out.println("(2) Telefonía");
					System.out.println("(3) Libros");
					System.out.print("Introduzca la opción deseada: ");
					opcionAux = sc.nextInt();
					switch (opcionAux) {
					case 1:
						categoria = "R";
						break;
					case 2:
						categoria = "T";
						break;
					case 3:
						categoria = "L";
						break;
					default:
						categoria = " ";
						break;
					}
				} while ((opcionAux < 1) || (opcionAux > 3));
				almacen.list(categoria);
				
				
				
				
				break;
			case 99: {
				seguir = false;
				System.out.println("fin programa");
				break;
			}
			default:
				System.out.println("opcion erronea");
			}
		}
	}
}
