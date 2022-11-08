package ex1;

import java.util.Date;

/**
 * Classe qui defini une Entreprise
 * 
 * @author guewe
 *
 */
public class Entreprise {

	/** Siret de l'entreprise */
	public int siret;
	/** Nom de l'entreprise */
	public String nom;
	/** Adresse de l'entreprise */
	public String adresse;
	/** Date de creation de l'entreprise */
	public Date dateCreation;
	/** Capital Amximum de l'entreprise */
	public static final int capitalMax = 3000000;
	
	
	/** Constructeur 
	 * @param siret
	 * @param nom
	 * @param adresse
	 * @param dateCreation
	 */
	public Entreprise(int siret, String nom, String adresse, Date dateCreation) {
		this.siret = siret;
		this.nom = nom;
		this.adresse = adresse;
		this.dateCreation = dateCreation;
	}

	/**
	 * Affiche le statut de l'entreprise
	 * return void
	 */
	public void afficherstatut(){
		
	}

	/**
	 * @return the siret
	 */
	public int getSiret() {
		return siret;
	}

	/**
	 * @param siret the siret to set
	 */
	public void setSiret(int siret) {
		this.siret = siret;
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
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * @param adresse the adresse to set
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	/**
	 * @return the dateCreation
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * @param dateCreation the dateCreation to set
	 */
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	/**
	 * @return the capitalmax
	 */
	public static int getCapitalmax() {
		return capitalMax;
	}
	
	
}
