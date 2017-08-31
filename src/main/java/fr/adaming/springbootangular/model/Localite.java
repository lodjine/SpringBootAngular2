package fr.adaming.springbootangular.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "Localisation")
public class Localite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLocalite;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "adresse")
	private String adresse;
	
	@OneToMany(mappedBy="localite")
	private List<Quantite> listQuantites;

	
	@ManyToOne
	private Type_localite typeLocalite;
	
	
	
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
		return listQuantites;
	}


	public void setQuantite(List<Quantite> quantite) {
		this.listQuantites = quantite;
	}


	public Localite(Long idLocalite, String nom, String adresse, List<Quantite> quantite) {
		super();
		this.idLocalite = idLocalite;
		this.nom = nom;
		this.adresse = adresse;
		this.listQuantites = quantite;
	}


	public Localite() {
		super();
	}


	@Override
	public String toString() {
		return "Localite [idLocalite=" + idLocalite + ", nom=" + nom + ", adresse=" + adresse + ", quantites="
				+ listQuantites + "]";
	}


	public List<Quantite> getListQuantites() {
		return listQuantites;
	}


	public void setListQuantites(List<Quantite> listQuantites) {
		this.listQuantites = listQuantites;
	}


	public Type_localite getTypeLocalite() {
		return typeLocalite;
	}


	public void setTypeLocalite(Type_localite typeLocalite) {
		this.typeLocalite = typeLocalite;
	}


	public Localite(Long idLocalite, String nom, String adresse, List<Quantite> listQuantites,
			Type_localite typeLocalite) {
		super();
		this.idLocalite = idLocalite;
		this.nom = nom;
		this.adresse = adresse;
		this.listQuantites = listQuantites;
		this.typeLocalite = typeLocalite;
	}
	
	
	
	
}
