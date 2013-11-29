package fr.alma.middleware1314.services.bean.remote;

import java.net.URL;
import java.util.Date;

public interface ContentRemote {

	/**
	 * @return the contentTitle
	 */
	public String getContentTitle();

	/**
	 * @param contentTitle the contentTitle to set
	 */
	public void setContentTitle(String contentTitle);

	/**
	 * @return the link
	 */
	public URL getLink();

	/**
	 * @param link the link to set
	 */
	public void setLink(URL link);

	/**
	 * @return the pubDate
	 */
	public Date getPubDate();

	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(Date pubDate);

	/**
	 * @return the description
	 */
	public String getDescription();

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description);

	/**
	 * @return the guid
	 */
	public int getGuid();

	/**
	 * @param guid the guid to set
	 */
	public void setGuid(int guid);

	/**
	 * @return the author
	 */
	public String getAuthor();

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author);

	/**
	 * @return the category
	 */
	public String getCategory();

	/**
	 * @param category the category to set
	 */
	public void setCategory(String category);

	/**
	 * @return the comments
	 */
	public String getComments();

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments);

}