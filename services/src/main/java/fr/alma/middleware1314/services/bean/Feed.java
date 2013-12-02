/**
 * 
 */
package fr.alma.middleware1314.services.bean;

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

import fr.alma.middleware1314.services.bean.remote.FeedRemote;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
@Entity
@Table(name="FEED")
public class Feed implements FeedRemote {

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
	@Override
	public String getFeedTitle() {
		return feedTitle;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setFeedTitle(java.lang.String)
	 */
	@Override
	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getDescription()
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setDescription(java.lang.String)
	 */
	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLink()
	 */
	@Override
	public URL getLink() {
		return link;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLink(java.net.URL)
	 */
	@Override
	public void setLink(URL link) {
		this.link = link;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getPubDate()
	 */
	@Override
	public Date getPubDate() {
		return pubDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setPubDate(java.util.Date)
	 */
	@Override
	public void setPubDate(Date pubDate) {
		this.pubDate = pubDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLastBuildDate()
	 */
	@Override
	public Date getLastBuildDate() {
		return lastBuildDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLastBuildDate(java.util.Date)
	 */
	@Override
	public void setLastBuildDate(Date lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getImage()
	 */
	@Override
	public String getImage() {
		return image;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setImage(java.lang.String)
	 */
	@Override
	public void setImage(String image) {
		this.image = image;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getLanguage()
	 */
	@Override
	public String getLanguage() {
		return language;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setLanguage(java.lang.String)
	 */
	@Override
	public void setLanguage(String language) {
		this.language = language;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getEnclosure()
	 */
	@Override
	public String getEnclosure() {
		return enclosure;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setEnclosure(java.lang.String)
	 */
	@Override
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#getContents()
	 */
	@Override
	public List<Content> getContents() {
		return contents;
	}

	/* (non-Javadoc)
	 * @see fr.alma.middleware1314.services.bean.FeedRemote#setContents(java.util.List)
	 */
	@Override
	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	
	
}
