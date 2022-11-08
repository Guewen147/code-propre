package ex3;


public class Animal {
	private String nom;
	private Types type;
	private Comportement comportement;
	/**
	 * @param nom
	 * @param type
	 * @param comportement
	 */
	public Animal(String nom, Types type, Comportement comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the type
	 */
	public Types getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(Types type) {
		this.type = type;
	}
	/**
	 * @return the comportement
	 */
	public Comportement getComportement() {
		return comportement;
	}
	/**
	 * @param comportement the comportement to set
	 */
	public void setComportement(Comportement comportement) {
		this.comportement = comportement;
	}
	
	
}
