package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@SuppressWarnings("serial")
@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {
	/**
	 * 
	 */
	
	private Long idCategorie;
	private String nomCategorie;
	

	public Categorie() {
	}

	public Categorie(Long idCategorie, String nomCategorie) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_categorie")
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
	}

	@Column(name="nom_categorie")
	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}
	
	

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCategorie == null) ? 0 : idCategorie.hashCode());
		result = prime * result + ((nomCategorie == null) ? 0 : nomCategorie.hashCode());
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
		Categorie other = (Categorie) obj;
		if (idCategorie == null) {
			if (other.idCategorie != null)
				return false;
		} else if (!idCategorie.equals(other.idCategorie))
			return false;
		if (nomCategorie == null) {
			if (other.nomCategorie != null)
				return false;
		} else if (!nomCategorie.equals(other.nomCategorie))
			return false;
		return true;
	}

	
}
