package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IdQuantite implements Serializable{	
	private static final long serialVersionUID = 1L;
	private Long id_produit;
	private Long id_localite;
	
	public IdQuantite() {		
	}
	
	public IdQuantite(Long idProduit, Long idLocalite) {		
		this.id_produit = idProduit;
		this.id_localite = idLocalite;
	}

	public Long getId_produit() {
		return id_produit;
	}

	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}

	public Long getId_localite() {
		return id_localite;
	}

	public void setId_localite(Long id_localite) {
		this.id_localite = id_localite;
	}

	
}
