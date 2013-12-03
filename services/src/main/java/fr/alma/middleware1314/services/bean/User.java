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
import javax.persistence.UniqueConstraint;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Entity
@Table(name="USER", uniqueConstraints = @UniqueConstraint(columnNames = {"userName"}))
public class User implements Serializable {

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


	public Long getUserId() {
		// TODO Auto-generated method stub
		return null;
	}



	public void setUserId(Long userId) {
		// TODO Auto-generated method stub
		
	}
	

	
	public String getUserName() {
		return userName;
	}


	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	
	public String getPassword() {
		return password;
	}


	
	public void setPassword(String password) {
		this.password = password;
	}


	
	public List<Feed> getFeeds() {
		return feeds;
	}


	
	public void setFeeds(List<Feed> feeds) {
		this.feeds = feeds;
	}

}
