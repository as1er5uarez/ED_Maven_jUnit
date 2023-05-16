package junit;

import java.util.Random;

public class Generador {
	public int generarNumero(int min, int max) {
		Random rd = new Random();
		return rd.nextInt(min)+max;
	}
	
	public String generarIp() {
		String ip = "";
		int numero = 0;
		for (int i = 1; i <= 4; i++) {
			numero = generarNumero(1, 255);
			if (i == 4) {
				ip += numero+"";
				break;
			}
			ip += numero+".";
		}
		return ip;
	}
	
	
}
