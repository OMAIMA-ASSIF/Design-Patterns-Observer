import java.util.ArrayList;

public class DonneesMeteo implements Subject{
	private ArrayList observateurs;
	
	private float temperature;
	private float humidite;
	private float pression;
	
	public DonneesMeteo() {
		observateurs = new ArrayList();
	}
	@Override
	public void enregisterObservateur(Observateur o) {
		observateurs.add(o);
		
	}
	@Override
	public void supprimerObservateur(Observateur o) {
		int i = observateurs.indexOf(o);
		if (i>=0) observateurs.remove(i);
		
	}
	@Override
	public void notifierObservateurs() {
		for (int i=0; i<observateurs.size() ;i++) {
			Observateur o = (Observateur) observateurs.get(i);
			o.actualiser(temperature, humidite, pression);
		}
		
	}
	
	//Nous notifions les observateurs quand nous recevons de la station Meteo des mesures mises a jour
	public void actualiserMesures() {
		notifierObservateurs();
	}
	
	public void setMesures(float temperature, float humidite, float pression) {
		this.temperature = temperature;
		this.humidite = humidite;
		this.pression = pression;
		actualiserMesures();
	}

}
