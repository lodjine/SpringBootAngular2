package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class IdQuantite implements Serializable{	
	private static final long serialVersionUID = 1L;
	private Long idProduit;
	private Long idLocalite;
	
	public IdQuantite() {		
	}
	
	public IdQuantite(Long idProduit, Long idLocalite) {		
		this.idProduit = idProduit;
		this.idLocalite = idLocalite;
	}

	public Long getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}

	public Long getIdLocalite() {
		return idLocalite;
	}

	public void setIdLocalite(Long idLocalite) {
		this.idLocalite = idLocalite;
	}
}
