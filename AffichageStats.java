
public class AffichageStats implements Observateur, Affichage{
	private int nmbrMesures =0;
	
	//Statistiques temp
	private float moyTemp = 0;
	private float minTemp = Float.MAX_VALUE;
	private float maxTemp = Float.MIN_VALUE;
	private float sommeTemp = 0;

	//Statistiques humidite
	private float moyHum = 0;
	private float minHum = Float.MAX_VALUE;
	private float maxHum = Float.MIN_VALUE;
	private float sommeHum = 0;

	//Statistiques pression
	private float moyPres = 0;
	private float minPres = Float.MAX_VALUE;
	private float maxPres = Float.MIN_VALUE;
	private float sommePres = 0;
	
	private Subject donneesMeteo;
	
	public AffichageStats(Subject donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregisterObservateur(this);
	}
	
	@Override
	public void actualiser(float temperature, float humidite, float pression) {
		nmbrMesures++;
		
		sommeTemp += temperature;
	    moyTemp = sommeTemp / nmbrMesures;
	    if (temperature < minTemp) {
	        minTemp = temperature;
	    }
	    if (temperature > maxTemp) {
	        maxTemp = temperature;
	    }
		
	    sommeHum += humidite;
	    moyHum = sommeHum / nmbrMesures;
	    if (humidite < minHum) {
	        minHum = humidite;
	    }
	    if (humidite > maxHum) {
	        maxHum = humidite;
	    }
		
	    sommePres += pression;
	    moyPres = sommePres / nmbrMesures;
	    if (pression < minPres) {
	        minPres = pression;
	    }
	    if (pression > maxPres) {
	        maxPres = pression;
	    }
	
	}
	@Override
	public void afficher() {
	    System.out.println("=== AFFICHAGE DES STATISTIQUES ===");
	    System.out.println("Nombre de mesures : " + nmbrMesures);
	    System.out.println("-----------------------------------");
	    System.out.printf("Température : Min = %.1f°C, Max = %.1f°C, Moy = %.1f°C\n", minTemp, maxTemp, moyTemp);
	    System.out.printf("Humidité    : Min = %.1f%%, Max = %.1f%%, Moy = %.1f%%\n", minHum, maxHum, moyHum);
	    System.out.printf("Pression    : Min = %.1fhPa, Max = %.1fhPa, Moy = %.1fhPa\n", minPres, maxPres, moyPres);
	    System.out.println("===================================");
	}
	

}
