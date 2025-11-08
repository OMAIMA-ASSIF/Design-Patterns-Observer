
public interface Subject {
	public void enregisterObservateur(Observateur o);
	public void supprimerObservateur(Observateur o);
	public void notifierObservateurs();

}
