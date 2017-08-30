package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="produit")
public class Produit implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6873096478481561949L;
	private Long idProduit;
	private String intitule;
	private Boolean frais;
	private Boolean perissable;
//	private List<Quantite> listQuantites; 
//	private List<Fournisseur> listFournisseurs;
	
	
	
	public Produit(){}
	
	

//	public Produit(Long idProduit, String intitule, Boolean frais, Boolean perissable, List<Quantite> listQuantites,
//			List<Fournisseur> listFournisseurs) {
//		
//		this.idProduit = idProduit;
//		this.intitule = intitule;
//		this.frais = frais;
//		this.perissable = perissable;
//		this.listQuantites = listQuantites;
//		this.listFournisseurs = listFournisseurs;
//	}


	@Id
	@Column(name="id_produit")
	@GeneratedValue(strategy=GenerationType.IDENTITY)

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	@Column(name="intitule")
	public String getIntitule() {
		return intitule;
	}

	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	@Column(name="frais")
	public Boolean getFrais() {
		return frais;
	}

	public void setFrais(Boolean frais) {
		this.frais = frais;
	}

	@Column(name="perissable")
	public Boolean getPerissable() {
		return perissable;
	}

	public void setPerissable(Boolean perissable) {
		this.perissable = perissable;
	}
	
//	@OneToMany(mappedBy="produit")
//	public List<Quantite> getListQuantites() {
//		return listQuantites;
//	}

//	public void setListQuantites(List<Quantite> listQuantites) {
//		this.listQuantites = listQuantites;
//	}

//	@ManyToMany
//	public List<Fournisseur> getListFournisseurs() {
//		return listFournisseurs;
//	}



//	public void setListFournisseurs(List<Fournisseur> listFournisseurs) {
//		this.listFournisseurs = listFournisseurs;
//	}

	@Override
	public String toString() {
		return "Produit [idProduit=" + idProduit + ", intitule=" + intitule + ", frais=" + frais + ", perissable="
				+ perissable + "]";
	}
	
	
	
}
