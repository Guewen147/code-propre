package ex3;

import java.util.List;

public class Zoo {

	private String nom;
	
	private List<Animal> animaux;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		animaux.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (int i = 0; i<animaux.size(); i++ ) {
			System.out.println(animaux.get(i));
		}
	}
	
	public int taille() {
		return animaux.size();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
