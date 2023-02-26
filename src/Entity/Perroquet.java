
public class Perroquet {
	
	//Constructeur par défaut
	public Perroquet() {}

	/*Méthode qui renvoie la phrase en paramètre
	 * @param phrase : la phrase à renvoyer
	 * @return : la phrase en paramètre
	 */
	public String perroquetParlant(String phrase) {
		return phrase;
	}

	/*
	 * Méthode qui renvoie "Bonjour" suivi du nom en paramètre
	 * @param nom : le nom à renvoyer
	 * @return : "Bonjour" suivi du nom en paramètre
	 */
	public String perroquetBonjour(String nom) {
		return "Bonjour " + nom;
	}
}
