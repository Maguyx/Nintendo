package metier;

public class Console {

	private String nom;
	private Double prix;
	private String dateSortie;
	

	public Console(String nom) {
		this.nom = nom;
	}

	public Console(String nom, Double prix, String dateSortie) {
		this.nom = nom;
		this.prix = prix;
		this.dateSortie = dateSortie;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Console [nom=" + nom + "]";
	}
	
	
}
