package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private String nom;
	private String prenom;
	private List<Jeu> listJeu= new ArrayList();
	public Client(String nom, String prenom, List<Jeu> listJeu) {
		this.nom = nom;
		this.prenom = prenom;
		this.listJeu = listJeu;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public List<Jeu> getListJeu() {
		return listJeu;
	}
	public void setListJeu(List<Jeu> listJeu) {
		this.listJeu = listJeu;
	}
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listJeu=" + listJeu + "]";
	}
	
	
}
