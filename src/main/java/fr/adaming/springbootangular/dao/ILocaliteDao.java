package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Localite;

public interface ILocaliteDao extends JpaRepository<Localite , Serializable>{

}
