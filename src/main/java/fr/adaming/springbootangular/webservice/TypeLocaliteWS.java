package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.ITypeDao;
import fr.adaming.springbootangular.model.Type_localite;

@RestController
public class TypeLocaliteWS {

	@Autowired
	private ITypeDao typeDao;

	@RequestMapping(value = "/types", method = RequestMethod.POST)
	public Type_localite saveType(@RequestBody Type_localite type) {
		typeDao.save(type);
		return type;
	}

	@RequestMapping(value = "/types", method = RequestMethod.PUT)
	public Type_localite updateType(@RequestBody Type_localite type) {
		typeDao.save(type);
		return type;
	}

	@RequestMapping(value = "/types", method = RequestMethod.GET)
	public List<Type_localite> getTypes() {
		return typeDao.findAll();
	}

	@RequestMapping(value = "/types/{id}", method = RequestMethod.GET)
	public Type_localite getTypeById(@PathVariable Long id) {
		return typeDao.findOne(id);
	}

	@RequestMapping(value = "/types/{id}", method = RequestMethod.DELETE)
	public boolean deleteType(@PathVariable Long id) {
		typeDao.delete(id);
		return true;
	}

}
