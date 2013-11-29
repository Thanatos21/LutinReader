package fr.alma.middleware1314.services.bean.remote;

import java.net.URL;
import java.util.Date;
import java.util.List;

import fr.alma.middleware1314.services.bean.Content;

public interface FeedRemote {

	/**
	 * @return the feedTitle
	 */
	public String getFeedTitle();

	/**
	 * @param feedTitle the feedTitle to set
	 */
	public void setFeedTitle(String feedTitle);

	/**
	 * @return the description
	 */
	public String getDescription();

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description);

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
	 * @return the lastBuildDate
	 */
	public Date getLastBuildDate();

	/**
	 * @param lastBuildDate the lastBuildDate to set
	 */
	public void setLastBuildDate(Date lastBuildDate);

	/**
	 * @return the image
	 */
	public String getImage();

	/**
	 * @param image the image to set
	 */
	public void setImage(String image);

	/**
	 * @return the language
	 */
	public String getLanguage();

	/**
	 * @param language the language to set
	 */
	public void setLanguage(String language);

	/**
	 * @return the enclosure
	 */
	public String getEnclosure();

	/**
	 * @param enclosure the enclosure to set
	 */
	public void setEnclosure(String enclosure);

	/**
	 * @return the contents
	 */
	public List<Content> getContents();

	/**
	 * @param contents the contents to set
	 */
	public void setContents(List<Content> contents);

}