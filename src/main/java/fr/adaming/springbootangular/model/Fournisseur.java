package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class Fournisseur implements Serializable {

	private Long idFournisseur;
	private String nomFournisseur;
	private String adresse;
	private String email;
	private String telephone;
	private List<Produit> listProduits;

	public Fournisseur() {

	}

	public Fournisseur(Long idFournisseur, String nomFournisseur, String adresse, String email, String telephone) {
		this.idFournisseur = idFournisseur;
		this.nomFournisseur = nomFournisseur;
		this.adresse = adresse;
		this.email = email;
		this.telephone = telephone;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdFournisseur() {
		return idFournisseur;
	}

	public void setIdFournisseur(Long idFournisseur) {
		this.idFournisseur = idFournisseur;
	}

	@Column
	public String getNomFournisseur() {
		return nomFournisseur;
	}

	public void setNomFournisseur(String nomFournisseur) {
		this.nomFournisseur = nomFournisseur;
	}

	@Column
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	@Column
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column
	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "Fournisseur [idFournisseur=" + idFournisseur + ", nomFournisseur=" + nomFournisseur + "]";
	}

	@ManyToMany(mappedBy = "listFournisseurs", fetch = FetchType.EAGER)
	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idFournisseur == null) ? 0 : idFournisseur.hashCode());
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
		Fournisseur other = (Fournisseur) obj;
		if (idFournisseur == null) {
			if (other.idFournisseur != null)
				return false;
		} else if (!idFournisseur.equals(other.idFournisseur))
			return false;
		return true;
	}

}
