package fr.adaming.springbootangular.dao;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.adaming.springbootangular.model.Type_localite;



public interface ITypeDao extends JpaRepository<Type_localite , Serializable>{

}
