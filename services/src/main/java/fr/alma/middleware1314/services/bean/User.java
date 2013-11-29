/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import fr.alma.middleware1314.services.bean.remote.UserRemote;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Stateless
@Remote(UserRemote.class)
@Entity
public class User implements Serializable, UserRemote {
	
	private Long userId;
	private String userName;
	private String password;
	private List<Feed> feeds;
	
	
	public User() {
		this.userName = "default";
		this.password = "default";
		this.feeds = new ArrayList<Feed>();
	}
	
	
	public User(String userName, String password) {
		this.userName = userName;
		this.password = password;
		this.feeds = new ArrayList<Feed>();
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.remote.UserRemote#getUserId()
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.remote.UserRemote#setUserId(java.lang.Long)
	 */
	@Basic
	@Override
	public void setUserId(Long userId) {
		// TODO Auto-generated method stub
		
	}
	

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getUserName()
	 */
	@Basic
	@Override
	public String getUserName() {
		return userName;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setUserName(java.lang.String)
	 */
	@Basic
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getPassword()
	 */
	@Basic
	@Override
	public String getPassword() {
		return password;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setPassword(java.lang.String)
	 */
	@Basic
	@Override
	public void setPassword(String password) {
		this.password = password;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getFeeds()
	 */
	@Basic
	@OneToMany
	@Override
	public List<Feed> getFeeds() {
		return feeds;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setFeeds(java.util.List)
	 */
	@Basic
	@Override
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

}
