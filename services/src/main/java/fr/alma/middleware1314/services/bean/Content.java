/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.io.Serializable;
import java.net.URL;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Entity
@Table(name="CONTENT")
public class Content implements Serializable{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long contentId;
	
	@Basic()
	private String contentTitle;
	
	@Basic()
	private URL link;
	
	@Basic()
	private Date pubDate;
	
	@Basic()
	private String description;
	
	@Basic()
	private int guid;
	
	@Basic()
	private String author;
	
	@Basic()
	private String category;
	
	@Basic()
	private String comments;
	
	
	/**
	 * 
	 */
	public Content() {
		
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getContentTitle()
	 */
	public String getContentTitle() {
		return contentTitle;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setContentTitle(java.lang.String)
	 */
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getLink()
	 */
	public URL getLink() {
		return link;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setLink(java.net.URL)
	 */
	public void setLink(URL link) {
		this.link = link;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getPubDate()
	 */
	public Date getPubDate() {
		return pubDate;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setPubDate(java.util.Date)
	 */
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getDescription()
	 */
	public String getDescription() {
		return description;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getGuid()
	 */
	public int getGuid() {
		return guid;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setGuid(int)
	 */
	public void setGuid(int guid) {
		this.guid = guid;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getAuthor()
	 */
	public String getAuthor() {
		return author;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setAuthor(java.lang.String)
	 */
	public void setAuthor(String author) {
		this.author = author;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getCategory()
	 */
	public String getCategory() {
		return category;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setCategory(java.lang.String)
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getComments()
	 */
	public String getComments() {
		return comments;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setComments(java.lang.String)
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
