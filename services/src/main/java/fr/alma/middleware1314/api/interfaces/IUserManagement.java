/**
 * 
 */
package fr.alma.middleware1314.api.interfaces;

import fr.alma.middleware1314.services.bean.User;


/**
 * @author Julien Bizeul et Éric Chevalier
 * 
 * This interface describe the methods used to manage the {@link User}
 *
 */
public interface IUserManagement {

	/**
	 * This method allows you to register a new {@link User} in the database
	 * @param userName The name of the {@link User}
	 * @param password The password of the {@link User}
	 * 
	 * @return 1 if the registration is successful, 0 otherwise
	 */
	int register(String userName, String password);
	
	/**
	 * This method allows you to unregister an existing {@link User} in the database
	 * @param userName The name of the {@link User}
	 * @param password The password of the {@link User}
	 * 
	 * @return 1 if the unregistration is successful, 0 otherwise
	 */
	int unregister(String userName, String password);
	
	/**
	 * This method allows you to connect an existing {@link User} to the database
	 * @param userName The name of the {@link User}
	 * @param password The password of the {@link User}
	 * 
	 * @return 1 if the connection is successful, 0 otherwise
	 */
	int connect(String userName, String password);
	
	/**
	 * This method allows you to disconnect an existing {@link User} from the database
	 * @param userName The name of the {@link User}
	 * @param password The password of the {@link User}
	 * 
	 * @return 1 if the disconnection is successful, 0 otherwise 
	 */
	int disconnect(String userName, String password);
}
