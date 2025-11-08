import java.util.*;

public class StationMeteo {
	public static void main(String[] args) {
		DonneesMeteo donneesMeteo = new DonneesMeteo();
		
		AffichageConditions affichageConditions = new AffichageConditions(donneesMeteo);
		AffichageStats affichageStats = new AffichageStats(donneesMeteo);
		//AffichagePrevisions affichagePrevisions = new AffichagePrevisions(donneesMeteo);
		
		donneesMeteo.enregisterObservateur(affichageConditions);
		donneesMeteo.enregisterObservateur(affichageStats);
		//donneesMeteo.enregisterObservateur(affichagePrevisions);
		
		donneesMeteo.setMesures(26, 65, 1020);
		donneesMeteo.setMesures(28, 70, 1012);
		donneesMeteo.setMesures(22, 90, 1012);
	}
}
