package cadenas;

public class Cadenas {
	public static String VOCALES = "aeiou";
	public Cadenas() {
		
	}
	
	public int longitud(String cadena) {
		return cadena.length();
	}
	
	public int vocales(String cadena) {
		int numVocal = 0;
		char letra;
		for (int i = 0; i <= cadena.length() - 1; i++) {
			for (int j = 0; j <= VOCALES.length() - 1; j++) {
				letra = cadena.charAt(i);
				if (VOCALES.charAt(j) == letra){
					numVocal += 1;
				}
			}
			
		}
		return numVocal;
	}
	
	public String invertir(String cadena) {
		String cadenaInvertida = "";
		for (int i = cadena.length()- 1; i < 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		return cadenaInvertida;
	}
	
	public int contarLetra(String cadena, char caracter) {
		int contar = 0;
		for (int i = 0; i < cadena.length() - 1; i++) {
			if (cadena.charAt(i)==caracter) {
				contar += 1;
			}
		}
		return contar;
	}
}
