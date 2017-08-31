package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorie")
public class Categorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3687220749634218667L;
	private Long idCategorie;
	private String nomCategorie;
	private List<Produit> listProduits;

	public Categorie() {
	}

	public Categorie(Long idCategorie, String nomCategorie, List<Produit> listProduits) {
		this.idCategorie = idCategorie;
		this.nomCategorie = nomCategorie;
		this.listProduits = listProduits;
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

	@OneToMany(mappedBy="categorie")
	public List<Produit> getListProduits() {
		return listProduits;
	}

	public void setListProduits(List<Produit> listProduits) {
		this.listProduits = listProduits;
	}

	@Override
	public String toString() {
		return "Categorie [idCategorie=" + idCategorie + ", nomCategorie=" + nomCategorie + ", listProduits="
				+ listProduits + "]";
	}

}
