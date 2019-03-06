package Tragaperras;
import java.util.Arrays;
public class Premio {
	private double dPremio;
	private Fruta[] combinacion;
	
	
	
		
	public Premio(Fruta[] combinacion, double dPremio) {
		this.dPremio = dPremio;
		this.combinacion = Arrays.copyOf(combinacion,3);
	}
	public double getdPremio() {
		return dPremio;
	}
	public Fruta[] getCombinacion() {
		return combinacion;
	}
	public void mostrarPremio(){
		System.out.println(getdPremio());
		System.out.println(getCombinacion()[2]);
	}
	}
	