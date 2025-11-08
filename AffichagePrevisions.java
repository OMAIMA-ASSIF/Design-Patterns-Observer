
public class AffichagePrevisions implements Observateur, Affichage{
	
	private Subject donneesMeteo;
	
	public AffichagePrevisions(Subject donneesMeteo) {
		this.donneesMeteo = donneesMeteo;
		donneesMeteo.enregisterObservateur(this);
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualiser(float temp, float humidite, float pression) {
		// TODO Auto-generated method stub
		
	}

}
