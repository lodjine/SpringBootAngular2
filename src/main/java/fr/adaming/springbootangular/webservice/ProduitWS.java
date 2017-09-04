package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IProduitDao;
import fr.adaming.springbootangular.model.Produit;

@RestController
public class ProduitWS {
	
	@Autowired
	IProduitDao produitDao;
	
	@RequestMapping(value="/produits", method=RequestMethod.POST)
	public Produit saveProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.PUT)
	public Produit updateProduit(@RequestBody Produit produit){
		produitDao.save(produit);
		return produit;
	}
	
	@RequestMapping(value="/produits", method=RequestMethod.GET)
	public List<Produit> getProduits(){
		return produitDao.findAll();
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.GET)
	public Produit getProduitById(@PathVariable Long id){
		return produitDao.findOne(id);
	}
	
	@RequestMapping(value="/produits/{id}", method=RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id){
		produitDao.delete(id);
		return true;
	}
}
