package fr.adaming.springbootangular.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Localité")
public class Type_localite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idType;
	
	@Column(name = "type")
	String type;

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Type_localite(Long idType, String type) {
		super();
		this.idType = idType;
		this.type = type;
	}

	public Type_localite() {
		super();
	}
	
	

}
