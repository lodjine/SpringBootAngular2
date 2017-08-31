package fr.adaming.springbootangular.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "Localisation")
public class Localite {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idLocalite;
	
	@Column(name = "nom")
	String nom;
	
	@Column(name = "adresse")
	String adresse;
	
	
	List<Quantite> quantites;


	public Long getIdLocalite() {
		return idLocalite;
	}


	public void setIdLocalite(Long idLocalite) {
		this.idLocalite = idLocalite;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getAdresse() {
		return adresse;
	}


	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}


	public List<Quantite> getQuantite() {
		return quantites;
	}


	public void setQuantite(List<Quantite> quantite) {
		this.quantites = quantite;
	}


	public Localite(Long idLocalite, String nom, String adresse, List<Quantite> quantite) {
		super();
		this.idLocalite = idLocalite;
		this.nom = nom;
		this.adresse = adresse;
		this.quantites = quantite;
	}


	public Localite() {
		super();
	}
	
	
	
	
}
