package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.ILocaliteDao;
import fr.adaming.springbootangular.model.Localite;

@RestController
public class LocaliteWS {

	@Autowired
	private ILocaliteDao localiteDao;

	@RequestMapping(value = "/localites", method = RequestMethod.POST)
	public Localite saveLocalite(@RequestBody Localite localite) {
		localiteDao.save(localite);
		return localite;
	}

	@RequestMapping(value = "/localites", method = RequestMethod.PUT)
	public Localite updateLocalite(@RequestBody Localite localite) {
		localiteDao.save(localite);
		return localite;
	}

	@RequestMapping(value = "/localites", method = RequestMethod.GET)
	public List<Localite> getLocalites() {
		return localiteDao.findAll();
	}

	@RequestMapping(value = "/localites/{id}", method = RequestMethod.GET)
	public Localite getLocaliteById(@PathVariable Long id) {
		return localiteDao.findOne(id);
	}

	@RequestMapping(value = "/localites/{id}", method = RequestMethod.DELETE)
	public boolean deleteLocalite(@PathVariable Long id) {
		localiteDao.delete(id);
		return true;
	}

}
