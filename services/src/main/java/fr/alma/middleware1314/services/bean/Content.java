/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.net.URL;
import java.util.Date;

import javax.ejb.Remote;
import javax.ejb.Stateless;

import fr.alma.middleware1314.services.bean.remote.ContentRemote;
import fr.alma.middleware1314.services.bean.remote.UserRemote;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Stateless
@Remote(UserRemote.class)
public class Content implements ContentRemote {

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


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getContentTitle()
	 */
	@Override
	public String getContentTitle() {
		return contentTitle;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setContentTitle(java.lang.String)
	 */
	@Override
	public void setContentTitle(String contentTitle) {
		this.contentTitle = contentTitle;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getLink()
	 */
	@Override
	public URL getLink() {
		return link;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setLink(java.net.URL)
	 */
	@Override
	public void setLink(URL link) {
		this.link = link;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getPubDate()
	 */
	@Override
	public Date getPubDate() {
		return pubDate;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setPubDate(java.util.Date)
	 */
	@Override
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getGuid()
	 */
	@Override
	public int getGuid() {
		return guid;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setGuid(int)
	 */
	@Override
	public void setGuid(int guid) {
		this.guid = guid;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setAuthor(java.lang.String)
	 */
	@Override
	public void setAuthor(String author) {
		this.author = author;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getCategory()
	 */
	@Override
	public String getCategory() {
		return category;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setCategory(java.lang.String)
	 */
	@Override
	public void setCategory(String category) {
		this.category = category;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#getComments()
	 */
	@Override
	public String getComments() {
		return comments;
	}


	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.ContentRemote#setComments(java.lang.String)
	 */
	@Override
	public void setComments(String comments) {
		this.comments = comments;
	}
	
}
