package org.cuatroviento.repaso2;
public class Producto {
	private String nombre;
	private float precio;
	private int cantidad;
	public Producto(String nombre, float precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		return this.precio *this.cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	

}
