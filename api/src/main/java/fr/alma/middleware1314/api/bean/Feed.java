/**
 * 
 */
package fr.alma.middleware1314.api.bean;

import java.net.URL;
import java.util.Date;
import java.util.List;

/**
 * @author Julien Bizeul et Éric Chevalier
 *
 */
public class Feed {

	private String feedTitle;
	private String description;
	private URL link;
	private Date pubDate;
	private Date lastBuildDate;
	private String image;
	private String language;
	private String enclosure;
	private List<Content> contents;
	
	
	/**
	 * 
	 */
	public Feed() {
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
	}

	/**
	 * @return the feedTitle
	 */
	public String getFeedTitle() {
		return feedTitle;
	}

	/**
	 * @param feedTitle the feedTitle to set
	 */
	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
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
	 * @return the lastBuildDate
	 */
	public Date getLastBuildDate() {
		return lastBuildDate;
	}

	/**
	 * @param lastBuildDate the lastBuildDate to set
	 */
	public void setLastBuildDate(Date lastBuildDate) {
		this.lastBuildDate = lastBuildDate;
	}

	/**
	 * @return the image
	 */
	public String getImage() {
		return image;
	}

	/**
	 * @param image the image to set
	 */
	public void setImage(String image) {
		this.image = image;
	}

	/**
	 * @return the language
	 */
	public String getLanguage() {
		return language;
	}

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language) {
		this.language = language;
	}

	/**
	 * @return the enclosure
	 */
	public String getEnclosure() {
		return enclosure;
	}

	/**
	 * @param enclosure the enclosure to set
	 */
	public void setEnclosure(String enclosure) {
		this.enclosure = enclosure;
	}

	/**
	 * @return the contents
	 */
	public List<Content> getContents() {
		return contents;
	}

	/**
	 * @param contents the contents to set
	 */
	public void setContents(List<Content> contents) {
		this.contents = contents;
	}
	
	
}
