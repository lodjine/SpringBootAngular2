package fr.adaming.springbootangular.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table
public class Quantite implements Serializable{	
	private static final long serialVersionUID = 1L;
	private IdQuantite idQuantite;
	private Integer quantite;
	private Date dateModification;
	private Produit produit;
	private Localite localite;
	
	public Quantite() {		
	}

	public Quantite(Integer quantite, Date dateModification, Produit produit, Localite localite) {	
		this.idQuantite = new IdQuantite(produit.getIdProduit(), localite.getIdLocalite());
		this.quantite = quantite;
		this.dateModification = dateModification;
		this.produit = produit;
		this.localite = localite;
	}

	@EmbeddedId
	public IdQuantite getIdQuantite() {
		return idQuantite;
	}

	public void setIdQuantite(IdQuantite idQuantite) {
		this.idQuantite = idQuantite;
	}

	@Column
	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Temporal(TemporalType.DATE)
	public Date getDateModification() {
		return dateModification;
	}

	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}

	@ManyToOne
	@JoinColumn(name="produitId", referencedColumnName="id_produit", insertable = false, updatable = false)
	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	@ManyToOne
	@JoinColumn(name="localiteId", referencedColumnName="idLocalite", insertable = false, updatable = false)
	public Localite getLocalite() {
		return localite;
	}

	public void setLocalite(Localite localite) {
		this.localite = localite;
	}

	@Override
	public String toString() {
		return "Quantite [quantite=" + quantite + ", dateModification=" + dateModification + "]";
	}
	
	

}
