/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Entity
@Table(name="FEED")
public class Feed implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long feedId;
	
	@Basic()
	private String feedTitle;

	@Basic()
	private String description;

	@Basic()
	private URL link;

	@Basic()
	private Date pubDate;

	@Basic()
	private Date lastBuildDate;

	@Basic()
	private String image;

	@Basic()
	private String language;

	@Basic()
	private String enclosure;

	@Basic()
	@OneToMany
	private List<Content> contents;
	
	
	/**
	 * 
	 */
	public Feed() {
		this.contents = new ArrayList<Content>();
	}
	
	/**
	 * @param feedTitle
	 * @param description
	 * @param link
	 * @param pubDate
	 * @param lastBuildDate
	 * @param image
	 * @param language
	 * @param enclosure
	 */
	public Feed(String feedTitle, String description, URL link, Date pubDate,
			Date lastBuildDate, String image, String language, String enclosure) {
		this.feedTitle = feedTitle;
		this.description = description;
		this.link = link;
		this.pubDate = pubDate;
		this.lastBuildDate = lastBuildDate;
		this.image = image;
		this.language = language;
		this.enclosure = enclosure;
		this.contents = new ArrayList<Content>();
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getFeedTitle()
	 */
	public String getFeedTitle() {
		return feedTitle;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setFeedTitle(java.lang.String)
	 */
	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getDescription()
	 */
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setDescription(java.lang.String)
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLink()
	 */
	public URL getLink() {
		return link;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLink(java.net.URL)
	 */
	public void setLink(URL link) {
		this.link = link;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getPubDate()
	 */
	public Date getPubDate() {
		return pubDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setPubDate(java.util.Date)
	 */
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLastBuildDate()
	 */
	public Date getLastBuildDate() {
		return lastBuildDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLastBuildDate(java.util.Date)
	 */
	public void setLastBuildDate(Date lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getImage()
	 */
	public String getImage() {
		return image;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setImage(java.lang.String)
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLanguage()
	 */
	public String getLanguage() {
		return language;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLanguage(java.lang.String)
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getEnclosure()
	 */
	public String getEnclosure() {
		return enclosure;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setEnclosure(java.lang.String)
	 */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getContents()
	 */
	public List<Content> getContents() {
		return contents;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setContents(java.util.List)
	 */
	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	
	
}
