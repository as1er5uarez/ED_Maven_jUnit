package org.cuatrovientos.repaso4;


/*
 * Esta es una clase con muestra las caracteristicas de un paquete como su el peso o donde va a ser entregado el paquete
 */
public class Paquete {
	private String destino;
	private float peso;
	public Paquete(String destino, float peso) {
		super();
		this.destino = destino;
		this.peso = peso;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	@Override
	public String toString() {
		return "Paquete [destino=" + destino + ", peso=" + peso + "]";
	}
	
	
}
