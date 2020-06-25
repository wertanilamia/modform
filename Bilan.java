package org.sid.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Table(name = "Bilan")
@Entity
public class Bilan implements Serializable {
@Id
@GeneratedValue
private int idbilan;
private int numCINformateur;
private String nomprenomformateur;
private int numEnregis;
private int cadreH;
private int cadreF;
private int agentH;
private int agentF;
private long depenseHTVApersonne;
private long depenseHTVAaction;
private long depenseTTCaction;
@OneToMany(mappedBy = "bilan",fetch = FetchType.LAZY)
private Collection<FicheBesoins> fiches;

public Collection<FicheBesoins> getFiches() {
	return fiches;
}
public void setFiches(Collection<FicheBesoins> fiches) {
	this.fiches = fiches;
}
public int getIdbilan() {
	return idbilan;
}
public void setIdbilan(int idbilan) {
	this.idbilan = idbilan;
}
public int getNumCINformateur() {
	return numCINformateur;
}
public void setNumCINformateur(int numCINformateur) {
	this.numCINformateur = numCINformateur;
}
public String getNomprenomformateur() {
	return nomprenomformateur;
}
public void setNomprenomformateur(String nomprenomformateur) {
	this.nomprenomformateur = nomprenomformateur;
}
public int getNumEnregis() {
	return numEnregis;
}
public void setNumEnregis(int numEnregis) {
	this.numEnregis = numEnregis;
}
public int getCadreH() {
	return cadreH;
}
public void setCadreH(int cadreH) {
	this.cadreH = cadreH;
}
public int getCadreF() {
	return cadreF;
}
public void setCadreF(int cadreF) {
	this.cadreF = cadreF;
}
public int getAgentH() {
	return agentH;
}
public void setAgentH(int agentH) {
	this.agentH = agentH;
}
public int getAgentF() {
	return agentF;
}
public void setAgentF(int agentF) {
	this.agentF = agentF;
}
public long getDepenseHTVApersonne() {
	return depenseHTVApersonne;
}
public void setDepenseHTVApersonne(long depenseHTVApersonne) {
	this.depenseHTVApersonne = depenseHTVApersonne;
}
public long getDepenseHTVAaction() {
	return depenseHTVAaction;
}
public void setDepenseHTVAaction(long depenseHTVAaction) {
	this.depenseHTVAaction = depenseHTVAaction;
}
public long getDepenseTTCaction() {
	return depenseTTCaction;
}
public void setDepenseTTCaction(long depenseTTCaction) {
	this.depenseTTCaction = depenseTTCaction;
}
public Bilan(int numCINformateur, String nomprenomformateur, int numEnregis, int cadreH, int cadreF, int agentH,
		int agentF, long depenseHTVApersonne, long depenseHTVAaction, long depenseTTCaction) {
	super();
	this.numCINformateur = numCINformateur;
	this.nomprenomformateur = nomprenomformateur;
	this.numEnregis = numEnregis;
	this.cadreH = cadreH;
	this.cadreF = cadreF;
	this.agentH = agentH;
	this.agentF = agentF;
	this.depenseHTVApersonne = depenseHTVApersonne;
	this.depenseHTVAaction = depenseHTVAaction;
	this.depenseTTCaction = depenseTTCaction;
}
public Bilan() {
	super();
}


}
