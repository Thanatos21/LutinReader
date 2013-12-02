package fr.alma.middleware1314.services.bean;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

import fr.alma.middleware1314.api.interfaces.IUserManagement;

@Stateless
@Remote(IUserManagement.class)
public class UserManagement implements IUserManagement {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public int register(String userName, String password) {
		System.out.println("Registering user " + userName + " with password " + password);
		User u = new User(userName, password);
		em.persist(u);
		System.out.println(em.contains(u));
		return 0;
	}

	@Override
	public int unregister(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int connect(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int disconnect(String userName, String password) {
		// TODO Auto-generated method stub
		return 0;
	}

}
