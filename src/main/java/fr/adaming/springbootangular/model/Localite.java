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
	private Long idLocalite;
	
	@Column(name = "nom")
	private String nom;
	
	@Column(name = "adresse")
	private String adresse;
	
	@OneToMany(mappedBy="localite")
	private List<Quantite> listQuantites;

	
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


	public List<Quantite> getQuantite() {
		return listQuantites;
	}


	public void setQuantite(List<Quantite> quantite) {
		this.listQuantites = quantite;
	}


	
	public Localite() {
		super();
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


	@Override
	public String toString() {
		return "Localite [idLocalite=" + idLocalite + ", nom=" + nom + ", adresse=" + adresse + ", listQuantites="
				+ listQuantites + ", typeLocalite=" + typeLocalite + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((idLocalite == null) ? 0 : idLocalite.hashCode());
		result = prime * result + ((listQuantites == null) ? 0 : listQuantites.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((typeLocalite == null) ? 0 : typeLocalite.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Localite other = (Localite) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (idLocalite == null) {
			if (other.idLocalite != null)
				return false;
		} else if (!idLocalite.equals(other.idLocalite))
			return false;
		if (listQuantites == null) {
			if (other.listQuantites != null)
				return false;
		} else if (!listQuantites.equals(other.listQuantites))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (typeLocalite == null) {
			if (other.typeLocalite != null)
				return false;
		} else if (!typeLocalite.equals(other.typeLocalite))
			return false;
		return true;
	}


	
	
	
	
	
}
