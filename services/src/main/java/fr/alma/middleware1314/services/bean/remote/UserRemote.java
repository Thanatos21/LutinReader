package fr.alma.middleware1314.services.bean.remote;

import java.util.List;

import fr.alma.middleware1314.services.bean.Feed;

public interface UserRemote {

	/**
	 * @return the userId
	 */
	public Long getUserId();
	
	/**
	 * @param userId
	 */
	public void setUserId(Long userId);
	
	/**
	 * @return the userName
	 */
	public String getUserName();

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName);

	/**
	 * @return the password
	 */
	public String getPassword();

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password);

	/**
	 * @return the feeds
	 */
	public List<Feed> getFeeds();

	/**
	 * @param feeds the feeds to set
	 */
	public void setFeeds(List<Feed> feeds);

}