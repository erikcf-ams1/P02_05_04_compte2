package practica;

public class Persona implements Comparable<Persona> {

	public String nom;
	public int edat;
	public int alcada;

	public Persona(String nom, int edat, int alcada) {
		super();
		this.nom = nom;
		this.edat = edat;
		this.alcada = alcada;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getEdat() {
		return edat;
	}

	public void setEdat(int edat) {
		this.edat = edat;
	}

	public int getAlcada() {
		return alcada;
	}

	public void setAlcada(int alcada) {
		this.alcada = alcada;
	}

	public int compareTo(Persona p) {
		return p.alcada - this.alcada;
	}

}


