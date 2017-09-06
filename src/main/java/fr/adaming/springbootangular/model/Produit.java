package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6873096478481561949L;
	private Long idProduit;
	private String intitule;
	private Boolean frais;
	private Boolean perissable;
	private List<Fournisseur> listFournisseurs;
	private Categorie categorie;

	public Produit() {
	}

	public Produit(Long idProduit, String intitule, Boolean frais, Boolean perissable,
			List<Fournisseur> listFournisseurs, Categorie categorie) {
		super();
		this.idProduit = idProduit;
		this.intitule = intitule;
		this.frais = frais;
		this.perissable = perissable;

		this.listFournisseurs = listFournisseurs;
		this.categorie = categorie;
	}

	@Id
	@Column(name = "id_produit")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	@Column(name = "intitule")
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@Column(name = "frais")
	public Boolean getFrais() {
		return frais;
	}

	public void setFrais(Boolean frais) {
		this.frais = frais;
	}

	@Column(name = "perissable")
	public Boolean getPerissable() {
		return perissable;
	}

	public void setPerissable(Boolean perissable) {
		this.perissable = perissable;
	}

	@ManyToMany
	public List<Fournisseur> getListFournisseurs() {
		return listFournisseurs;
	}

	public void setListFournisseurs(List<Fournisseur> listFournisseurs) {
		this.listFournisseurs = listFournisseurs;
	}

	@ManyToOne
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", intitule=" + intitule + ", frais=" + frais + ", perissable="
				+ perissable + ", categorie=" + categorie + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categorie == null) ? 0 : categorie.hashCode());
		result = prime * result + ((frais == null) ? 0 : frais.hashCode());
		result = prime * result + ((idProduit == null) ? 0 : idProduit.hashCode());
		result = prime * result + ((intitule == null) ? 0 : intitule.hashCode());
		result = prime * result + ((listFournisseurs == null) ? 0 : listFournisseurs.hashCode());
		result = prime * result + ((perissable == null) ? 0 : perissable.hashCode());
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
		Produit other = (Produit) obj;
		if (categorie == null) {
			if (other.categorie != null)
				return false;
		} else if (!categorie.equals(other.categorie))
			return false;
		if (frais == null) {
			if (other.frais != null)
				return false;
		} else if (!frais.equals(other.frais))
			return false;
		if (idProduit == null) {
			if (other.idProduit != null)
				return false;
		} else if (!idProduit.equals(other.idProduit))
			return false;
		if (intitule == null) {
			if (other.intitule != null)
				return false;
		} else if (!intitule.equals(other.intitule))
			return false;
		if (listFournisseurs == null) {
			if (other.listFournisseurs != null)
				return false;
		} else if (!listFournisseurs.equals(other.listFournisseurs))
			return false;
		if (perissable == null) {
			if (other.perissable != null)
				return false;
		} else if (!perissable.equals(other.perissable))
			return false;
		return true;
	}

}
