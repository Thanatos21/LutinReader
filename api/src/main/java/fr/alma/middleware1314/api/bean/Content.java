/**
 * 
 */
package fr.alma.middleware1314.api.bean;

import java.net.URL;
import java.util.Date;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
public class Content {

	private String contentTitle;
	private URL link;
	private Date pubDate;
	private String description;
	private int guid;
	private String author;
	private String category;
	private String comments;
	
	
	/**
	 * 
	 */
	public Content() {
	}


	/**
	 * @return the contentTitle
	 */
	public String getContentTitle() {
		return contentTitle;
	}


	/**
	 * @param contentTitle the contentTitle to set
	 */
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}


	/**
	 * @return the link
	 */
	public URL getLink() {
		return link;
	}


	/**
	 * @param link the link to set
	 */
	public void setLink(URL link) {
		this.link = link;
	}


	/**
	 * @return the pubDate
	 */
	public Date getPubDate() {
		return pubDate;
	}


	/**
	 * @param pubDate the pubDate to set
	 */
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/**
	 * @return the guid
	 */
	public int getGuid() {
		return guid;
	}


	/**
	 * @param guid the guid to set
	 */
	public void setGuid(int guid) {
		this.guid = guid;
	}


	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}


	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}


	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
