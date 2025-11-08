
public class AffichageConditions implements Observateur, Affichage{
	
	private float temperature;
	private float humidite;
	
	private Subject donneesMeteo;
	
	public AffichageConditions(Subject donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregisterObservateur(this);
	}
	
	@Override
	public void actualiser(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		afficher();
	}

	@Override
	public void afficher() {
		System.out.println("Conditions actuelles : " + temperature + "degres de C , " +humidite +"% d'humidite ");
		
	}

}
