package fr.adaming.springbootangular.webservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.springbootangular.dao.IUserDao;
import fr.adaming.springbootangular.model.User;

@RestController
public class UserWS {

	@Autowired
	private IUserDao userDao;

	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public User saveUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@RequestMapping(value = "/user", method = RequestMethod.PUT)
	public User updateUser(@RequestBody User user) {
		userDao.save(user);
		return user;
	}

	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public List<User> getUsers() {
		return userDao.findAll();
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public User getUserById(@PathVariable Long idUser) {
		return userDao.findOne(idUser);
	}

	@RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
	public boolean delete(@PathVariable Long idUser) {
		userDao.delete(idUser);
		return true;
	}

}
