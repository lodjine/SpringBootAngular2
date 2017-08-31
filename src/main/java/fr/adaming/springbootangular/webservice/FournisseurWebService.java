package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IFournisseurDao;
import fr.adaming.springbootangular.model.Fournisseur;

@RestController
public class FournisseurWebService {

	@Autowired
	private IFournisseurDao fournisseurDao;

	@RequestMapping(value = "/fournisseurs", method = RequestMethod.POST)
	public Fournisseur save(@RequestBody Fournisseur fournisseur) {
		fournisseurDao.save(fournisseur);
		return fournisseur;
	}

	@RequestMapping(value = "/fournisseurs", method = RequestMethod.PUT)
	public Fournisseur updateFournisseur(@RequestBody Fournisseur fournisseur) {
		fournisseurDao.save(fournisseur);
		return fournisseur;
	}

	@RequestMapping(value = "/fournisseurs", method = RequestMethod.GET)
	public List<Fournisseur> getFournisseurs() {
		return fournisseurDao.findAll();
	}

	@RequestMapping(value = "/fournisseurs/(id)", method = RequestMethod.GET)
	public Fournisseur getFournisseurById(@PathVariable Long id) {
		return fournisseurDao.findOne(id);
	}

	@RequestMapping(value = "/fournisseurs/(id)", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable Long id) {
		fournisseurDao.delete(id);
		return true;
	}
}
