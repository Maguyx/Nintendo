package metier;

import java.util.ArrayList;
import java.util.List;

public class Client {
	
	private String nom;
	private String prenom;
	private List<Jeu> listDeJeu= new ArrayList();
	
	
	
	public Client() {
	}
	
	public Client(String nom, String prenom, List<Jeu> listDeJeu) {
		this.nom = nom;
		this.prenom = prenom;
		this.listDeJeu = listDeJeu;
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
	public List<Jeu> getListDeJeu() {
		return listDeJeu;
	}
	public void setListDeJeu(List<Jeu> listDeJeu) {
		this.listDeJeu = listDeJeu;
	}
	
	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", listDeJeu=" + listDeJeu + "]";
	}
	
	
}
