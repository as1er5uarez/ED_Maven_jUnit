package conversor;

public class EurosConversor {
	private static final double EUROS_PESETA_CAMBIO = 166.386;
	
	public EurosConversor() {
		
	}
	
	public double euros2Pesetas(double euros) {
		return euros * EUROS_PESETA_CAMBIO;
	}
	
	public double pesetas2Euros(double euros) {
		return euros / EUROS_PESETA_CAMBIO;
	}
	
}
