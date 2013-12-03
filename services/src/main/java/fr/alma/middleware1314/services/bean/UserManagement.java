package fr.alma.middleware1314.services.bean;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.alma.middleware1314.api.interfaces.IUserManagement;

@Stateless
@Remote(IUserManagement.class)
public class UserManagement implements IUserManagement {

	@PersistenceContext
	private EntityManager em;
	
	private boolean isUserInDatabase(User u) {
		String queryText = "from fr.alma.middleware1314.services.bean.User where userName=:userName and password=:password";
		
		Query query = em.createQuery(queryText);
		query.setParameter("userName", u.getUserName());
		query.setParameter("password", u.getPassword());
		
		List users = query.getResultList();
		
		if ( users.isEmpty() ) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public int register(String userName, String password) {
		System.out.println("[UserManagement] : register - Registering User " + userName + " with password " + password);
		User u = new User(userName, password);
		
		if ( !(this.isUserInDatabase(u)) ) {
			em.persist(u);
			
			System.out.println("[UserManagement] : register - Success! userId : " + u.getUserId());
		
			return 1;
		}
		else {
			System.out.println("[UserManagement] : register - userName already in use");
			return 0;
		}
	}

	@Override
	public int unregister(String userName, String password) {
		System.out.println("[UserManagement] : unregister - Unregistering user " + userName + " with password " + password);
		
		String queryText = "from fr.alma.middleware1314.services.bean.User where userName=:userName and password=:password";
		
		Query query = em.createQuery(queryText);
		query.setParameter("userName", userName);
		query.setParameter("password", password);
		
		List users = query.getResultList();
		
		if ( !users.isEmpty() )
		{
			em.remove(users.get(0));
			
			System.out.println("[UserManagement] : unregister - Success!");
			
			return 1;
		}
		else {
			System.out.println("[UserManagement] : unregister - Not an existing User");
			return 0;
		}
	}

	@Override
	public int connect(String userName, String password) {
		System.out.println("[UserManagement] : connect - Connecting User " + userName + " with password " + password);
		User u = new User(userName, password);
		
		if ( this.isUserInDatabase(u) ) {
			System.out.println("[UserManagement] : connect - Success!");
			return 1;
		}
		else {
			System.out.println("[UserManagement] : connect - Not an existing User");
			return 0;
		}
	}

	@Override
	public int disconnect(String userName, String password) {
		// Nothing to do for now
		return 1;
	}

}
