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
import javax.persistence.FetchType;

@Entity
@Table(name = "Localisation")
public class Localite implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_localite")
	private Long idLocalite;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "adresse")
	private String adresse;
	
	
	
	@ManyToOne(fetch=FetchType.EAGER)
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


	

	
	public Localite() {
		super();
	}



	


	public Type_localite getTypeLocalite() {
		return typeLocalite;
	}


	public void setTypeLocalite(Type_localite typeLocalite) {
		this.typeLocalite = typeLocalite;
	}


	
	
	
	
	
	
}
