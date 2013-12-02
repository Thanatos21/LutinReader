/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.alma.middleware1314.services.bean.remote.UserRemote;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Entity
@Table(name="USER")
public class User implements Serializable, UserRemote {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	
	@Basic()
	private String userName;

	@Basic()
	private String password;

	@Basic()
	@OneToMany
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
	@Override
	public Long getUserId() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.remote.UserRemote#setUserId(java.lang.Long)
	 */
	@Override
	public void setUserId(Long userId) {
		// TODO Auto-generated method stub
		
	}
	

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getUserName()
	 */
	@Override
	public String getUserName() {
		return userName;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setUserName(java.lang.String)
	 */
	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getPassword()
	 */
	@Override
	public String getPassword() {
		return password;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		this.password = password;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#getFeeds()
	 */
	@Override
	public List<Feed> getFeeds() {
		return feeds;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.UserRemote#setFeeds(java.util.List)
	 */
	@Override
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

}
