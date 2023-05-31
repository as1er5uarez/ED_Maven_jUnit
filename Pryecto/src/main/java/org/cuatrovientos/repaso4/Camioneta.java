package org.cuatrovientos.repaso4;

import java.util.ArrayList;
import java.util.Random;
/**
 * Esta clase simula las acciones de un Camion.
 * Implementamos los metodos desde la intefaz Transporte
 * @author asuar
 *
 */
public class Camioneta implements Transporte{
	public ArrayList<Paquete> paquetes;
	
	
	
	public Camioneta() {
		super();
		this.paquetes = new ArrayList();
	}
	
	/**
	 * {@inheritDoc}
	 */

	public void incluirPaquete(Paquete p) {
		// TODO Auto-generated method stub
		paquetes.add(p);
		
	}
	
	/**
	 * {@inheritDoc}
	 */

	public float pesoTotal() {
		// TODO Auto-generated method stub
		float pesoTotal = 0;
		for (Paquete paquete : paquetes) {
			pesoTotal += paquete.getPeso();
		}
		return pesoTotal;
	}
	
	/**
	 * {@inheritDoc}
	 */

	public int recorrerDistancia() {
		// TODO Auto-generated method stub
		Random rd = new Random();
		int numeroAleatorio = rd.nextInt(31)+70;
		return numeroAleatorio;
	}

}
