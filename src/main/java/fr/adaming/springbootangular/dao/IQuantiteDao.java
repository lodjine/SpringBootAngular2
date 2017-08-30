package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Quantite;

public interface IQuantiteDao extends JpaRepository<Quantite, Serializable>{

}
