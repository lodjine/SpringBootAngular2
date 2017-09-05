package fr.adaming.springbootangular.dao;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.adaming.springbootangular.model.Quantite;

public interface IQuantiteDao extends JpaRepository<Quantite, Serializable>{
	
	@Query("Select q from Quantite q where q.localite like :id")
	public List<Quantite> quantiteByLocalite(@Param ("id") Long id);

}
