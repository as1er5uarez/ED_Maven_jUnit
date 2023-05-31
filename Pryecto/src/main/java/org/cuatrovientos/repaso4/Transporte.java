package org.cuatrovientos.repaso4;
/**
 * Esta interfaz muestra las acciones que hara cualquier transporte
 * @author asuar
 *
 */
public interface Transporte {
	/**
	 * El metodo incluirPaquete agregar un nuevo paqute al transporte
	 * @param p Paquete que vamos a agregar al conjunto de paqutes que va a llevar
	 */
	public void incluirPaquete(Paquete p);
	/**
	 * Este metodo suma el peso total de cada paquete
	 * @return Devuelve el peso total de todos los paquetes que lleva un transporte
	 */
	public float pesoTotal();
	/**
	 * Suma el recorrido total que va a hacer el transporte de manera aleatoria
	 * @return Devuelve el numero generado de manera aleatoria
	 */
	public int recorrerDistancia();
}	
