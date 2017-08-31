package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IQuantiteDao;
import fr.adaming.springbootangular.model.Quantite;

@RestController
public class QuantiteWS {
	@Autowired
	private IQuantiteDao quantiteDao;

	@RequestMapping(value="/quantites", method = RequestMethod.POST)
	public Quantite saveQuantite(@RequestBody Quantite quantite) {
		quantiteDao.save(quantite);		
		return quantite;
	}
	
	@RequestMapping(value="/quantites", method = RequestMethod.PUT)
	public Quantite updateQuantite(@RequestBody Quantite quantite) {
		quantiteDao.save(quantite);
		return quantite;
	}

	@RequestMapping(value="/quantites", method = RequestMethod.GET)
	public List<Quantite> getQuantites() {
		return quantiteDao.findAll();
	}
	
	@RequestMapping(value="/quantites/{id}", method = RequestMethod.GET)
	public Quantite getQuantiteById(@PathVariable Long id){
		return quantiteDao.findOne(id);
	}
	
	@RequestMapping(value="/quantites/{id}", method = RequestMethod.DELETE)
	public boolean deleteQuantite(@PathVariable Long id){
		quantiteDao.delete(id);			
		return true;
	}
	

}
