/**
 * 
 */
package fr.alma.middleware1314.api.interfaces;

import java.net.URL;
import java.util.List;

import fr.alma.middleware1314.services.bean.Feed;
import fr.alma.middleware1314.services.bean.User;



/**
 * @author Julien Bizeul et Éric Chevalier
 * 
 * This interface describe the methods used to manage the RSS Feeds
 *
 */
public interface IFeedManagement {

	
	/**
	 * This method allows a valid {@link User} to subscribe to a {@link Feed}
	 * 
	 * @param userName the name of the {@link User}
	 * @param password the password of the {@link User}
	 * @param link the link of the {@link Feed}
	 * 
	 * @return 1 if the subscription is successful, 0 otherwise
	 */
	int subscribe(String userName, String password, URL link);
	
	/**
	 * This method allows a valid {@link User} to unsubscribe a {@link Feed}
	 * 
	 * @param userName the name of the {@link User}
	 * @param password the password of the {@link User}
	 * @param link the link of the {@link Feed}
	 * 
	 * @return 1 if the unsubscription is successful, 0 otherwise
	 */
	int unsubscribe(String userName, String password, URL link);
	
	/**
	 * This method allows a valid {@link User} to retrieve the {@link List} of {@link Feed} that previously subscribed.
	 * When called, this method will update the {@link Feed} content
	 * 
	 * @param userName the name of the {@link User}
	 * @param password the password of the {@link User}
	 * 
	 * @return The {@link List} of the {@link User} {@link Feed}
	 */
	List<Feed> retrieveFeeds(String userName, String password);
}
