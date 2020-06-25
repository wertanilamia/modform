package org.sid.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "FicheBesoins")

public class FicheBesoins implements Serializable {
	@Id
	@GeneratedValue
    private int id ;
	private int matricule;
	private String nom ;
	private String prenom ;
	private String emploi ;
	private String filiere ;
	private String tachePrincipale ;
	private String directionAeroport ;
	private String division ;
	private String service ;
	private int comptenceActuelleNA ;
	private int competenceActuelleNR;
	private int nouvellecompetenceNA ;
	private int nouvellecompetenceNR;
	private String theme ;
	private String niveaudemande ;
	private String typeformation ;
	private String periode ;
	private String domaine;
	private String date ;
	private String organismeformateur ;
	private String depenseprevisionnelle ;
	private int dureeJ;
	private int dureeH;
	private boolean validate=false;
	private String anneeplan;
	@ManyToOne
	@JoinColumn(name = "idbilan")
	private Bilan bilan;
	
	

	public FicheBesoins(int matricule, String nom, String prenom, String emploi, String filiere, String tachePrincipale,
			String directionAeroport, String division, String service, int comptenceActuelleNA,
			int competenceActuelleNR, int nouvellecompetenceNA, int nouvellecompetenceNR, String theme,
			String niveaudemande, String typeformation, String periode, String domaine, String date,
			String organismeformateur, String depenseprevisionnelle, int dureeJ, int dureeH, boolean validate,
			String anneeplan, Bilan bilan) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.emploi = emploi;
		this.filiere = filiere;
		this.tachePrincipale = tachePrincipale;
		this.directionAeroport = directionAeroport;
		this.division = division;
		this.service = service;
		this.comptenceActuelleNA = comptenceActuelleNA;
		this.competenceActuelleNR = competenceActuelleNR;
		this.nouvellecompetenceNA = nouvellecompetenceNA;
		this.nouvellecompetenceNR = nouvellecompetenceNR;
		this.theme = theme;
		this.niveaudemande = niveaudemande;
		this.typeformation = typeformation;
		this.periode = periode;
		this.domaine = domaine;
		this.date = date;
		this.organismeformateur = organismeformateur;
		this.depenseprevisionnelle = depenseprevisionnelle;
		this.dureeJ = dureeJ;
		this.dureeH = dureeH;
		this.validate = validate;
		this.anneeplan = anneeplan;
		this.bilan = bilan;
	}
	
	
	public FicheBesoins(int matricule, String nom, String prenom, String emploi, String filiere,
			String tachePrincipale, String directionAeroport, String division, String service, int comptenceActuelleNA,
			int competenceActuelleNR, int nouvellecompetenceNA, int nouvellecompetenceNR, String theme,
			String niveaudemande, String typeformation, String periode, String domaine, String date,
			String organismeformateur, String depenseprevisionnelle, int dureeJ, int dureeH, boolean validate,
			String anneeplan) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.emploi = emploi;
		this.filiere = filiere;
		this.tachePrincipale = tachePrincipale;
		this.directionAeroport = directionAeroport;
		this.division = division;
		this.service = service;
		this.comptenceActuelleNA = comptenceActuelleNA;
		this.competenceActuelleNR = competenceActuelleNR;
		this.nouvellecompetenceNA = nouvellecompetenceNA;
		this.nouvellecompetenceNR = nouvellecompetenceNR;
		this.theme = theme;
		this.niveaudemande = niveaudemande;
		this.typeformation = typeformation;
		this.periode = periode;
		this.domaine = domaine;
		this.date = date;
		this.organismeformateur = organismeformateur;
		this.depenseprevisionnelle = depenseprevisionnelle;
		this.dureeJ = dureeJ;
		this.dureeH = dureeH;
		this.validate = validate;
		this.anneeplan = anneeplan;
	}
	public FicheBesoins() {
		super();
	}
	public String getDirectionAeroport() {
		return directionAeroport;
	}
	public void setDirectionAeroport(String directionAeroport) {
		this.directionAeroport = directionAeroport;
	}
	public boolean isValidate() {
		return validate;
	}
	public void setValidate(boolean validate) {
		this.validate = validate;
	}
	public String getAnneeplan() {
		return anneeplan;
	}
	public void setAnneeplan(String anneeplanString) {
		this.anneeplan = anneeplanString;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public Bilan getBilan() {
		return bilan;
	}
	public void setBilan(Bilan bilan) {
		this.bilan = bilan;
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

	public String getEmploi() {
		return emploi;
	}

	public void setEmploi(String emploi) {
		this.emploi = emploi;
	}

	public String getFiliere() {
		return filiere;
	}

	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}

	public String getTachePrincipale() {
		return tachePrincipale;
	}

	public void setTachePrincipale(String tachePrincipale) {
		this.tachePrincipale = tachePrincipale;
	}


	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public int getComptenceActuelleNA() {
		return comptenceActuelleNA;
	}

	public void setComptenceActuelleNA(int comptenceActuelleNA) {
		this.comptenceActuelleNA = comptenceActuelleNA;
	}

	public int getCompetenceActuelleNR() {
		return competenceActuelleNR;
	}

	public void setCompetenceActuelleNR(int competenceActuelleNR) {
		this.competenceActuelleNR = competenceActuelleNR;
	}

	public int getNouvellecompetenceNA() {
		return nouvellecompetenceNA;
	}

	public void setNouvellecompetenceNA(int nouvellecompetenceNA) {
		this.nouvellecompetenceNA = nouvellecompetenceNA;
	}

	public int getNouvellecompetenceNR() {
		return nouvellecompetenceNR;
	}

	public void setNouvellecompetenceNR(int nouvellecompetenceNR) {
		this.nouvellecompetenceNR = nouvellecompetenceNR;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNiveaudemande() {
		return niveaudemande;
	}

	public void setNiveaudemande(String niveaudemande) {
		this.niveaudemande = niveaudemande;
	}

	public String getTypeformation() {
		return typeformation;
	}

	public void setTypeformation(String typeformation) {
		this.typeformation = typeformation;
	}

	public String getPeriode() {
		return periode;
	}

	public void setPeriode(String periode) {
		this.periode = periode;
	}

	public String getDomaine() {
		return domaine;
	}

	public void setDomaine(String domaine) {
		this.domaine = domaine;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrganismeformateur() {
		return organismeformateur;
	}

	public void setOrganismeformateur(String organismeformateur) {
		this.organismeformateur = organismeformateur;
	}

	public String getDepenseprevisionnelle() {
		return depenseprevisionnelle;
	}

	public void setDepenseprevisionnelle(String depenseprevisionnelle) {
		this.depenseprevisionnelle = depenseprevisionnelle;
	}

	public int getDureeJ() {
		return dureeJ;
	}

	public void setDureeJ(int dureeJ) {
		this.dureeJ = dureeJ;
	}

	public int getDureeH() {
		return dureeH;
	}

	public void setDureeH(int dureeH) {
		this.dureeH = dureeH;
	}
	
	
}
