/**
 * 
 */
package fr.alma.middleware1314.api.bean;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@SuppressWarnings("serial")
@Entity
public class User implements Serializable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String password;
	private List<Feed> feeds;
	
	
	public User() {
		this.userName = "default";
		this.password = "default";
	}


	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}


	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the feeds
	 */
	public List<Feed> getFeeds() {
		return feeds;
	}


	/**
	 * @param feeds the feeds to set
	 */
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}
	
}
