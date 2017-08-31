package fr.adaming.springbootangular.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Type_Localité")
public class Type_localite implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1863864389357244902L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idType;
	
	@Column(name = "type")
	private String type;

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

	@Override
	public String toString() {
		return "Type_localite [idType=" + idType + ", type=" + type + "]";
	}
	
	

}
