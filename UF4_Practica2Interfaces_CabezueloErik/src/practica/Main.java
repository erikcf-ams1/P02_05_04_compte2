package practica;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class CompareNom implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		return o1.getNom().compareTo(o2.getNom());
	}
}

public class Main {
	public static void main(String[] args) {
		ArrayList<Persona> aL = new ArrayList<Persona>(5);
		aL.add(new Persona("Dani", 22, 187));
		aL.add(new Persona("Pol", 52, 173));
		aL.add(new Persona("Manel", 27, 158));
		aL.add(new Persona("David", 25, 164));
		aL.add(new Persona("Pere", 80, 184));
		System.out.println("Persones sense ordenar: ");
		for (Persona p : aL) {
			System.out.println(p.getNom() + " - Alçada: " + p.getAlcada() + " - Edat: " + p.getEdat());
		}
		System.out.println();
		System.out.println("Persones ordenades per alçada: ");
		Collections.sort(aL);
		for (Persona p : aL) {
			System.out.println(p.getNom() + " - Alçada: " + p.getAlcada() + " - Edat: " + p.getEdat());
		}
		System.out.println();
		System.out.println("Persones ordenades per nom: ");
		Collections.sort(aL, new CompareNom());
		for (Persona p : aL) {
			System.out.println(p.getNom() + " - Alçada: " + p.getAlcada() + " - Edat: " + p.getEdat());
		}
	}
}
