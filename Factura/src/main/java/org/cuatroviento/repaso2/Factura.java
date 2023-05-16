
package org.cuatroviento.repaso2;
import java.util.ArrayList;
public class Factura {
	private ArrayList<Producto> productos;

	public Factura() {
		this.productos = new ArrayList();
	}
	
	public void meterProducto(Producto p) {
		productos.add(p);
	}
	
	public float totalFactura() {
		int total = 0;
		for (Producto producto : productos) {
			total += producto.precioTotal();
		}
		return total;
	}
	
	public float aplicarIva(int iva) {
		return (float) (this.totalFactura() / iva);
	}
}
