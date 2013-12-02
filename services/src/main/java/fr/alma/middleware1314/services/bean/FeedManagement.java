/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.net.URL;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.alma.middleware1314.api.interfaces.IFeedManagement;

/**
 * @author Julien
 *
 */
@Stateless
@Remote(IFeedManagement.class)
public class FeedManagement implements IFeedManagement {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public int subscribe(String userName, String password, URL link) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int unsubscribe(String userName, String password, URL link) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Feed> retrieveFeeds(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
