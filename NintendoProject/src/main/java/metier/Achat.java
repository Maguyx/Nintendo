package metier;

public class Achat {


String date;
double prix;
private Jeu jeu;
private Boutique boutique;

public Achat() {
	
}

public Achat(String date, double prix, Jeu jeu, Boutique boutique) {
	super();
	this.date = date;
	this.prix = prix;
	this.jeu = jeu;
	this.boutique = boutique;
}



public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public double getPrix() {
	return prix;
}

public void setPrix(double prix) {
	this.prix = prix;
}

public Jeu getJeu() {
	return jeu;
}

public void setJeu(Jeu jeu) {
	this.jeu = jeu;
}

public Boutique getBoutique() {
	return boutique;
}

public void setBoutique(Boutique boutique) {
	this.boutique = boutique;
}

}
