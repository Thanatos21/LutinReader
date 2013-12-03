/**
 * 
 */
package fr.alma.middleware1314.services.bean;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

import fr.alma.middleware1314.api.interfaces.IFeedManagement;

/**
 * @author Julien
 *
 */
@Stateless
@Remote(IFeedManagement.class)
public class FeedManagement implements IFeedManagement {
	
	@PersistenceContext
	private EntityManager em;
	
//	 URL source = new URL("http://linuxfr.org/news.atom");
//	 SyndFeedInput input = new SyndFeedInput();
//	 SyndFeed feed = input.build(new XmlReader(source));
//	 System.out.println(feed);

	@Override
	public int subscribe(String userName, String password, URL link) {
		if ( link != null ) {
			SyndFeedInput input = new SyndFeedInput();
			SyndFeed feed;
			
			String queryText = "from fr.alma.middleware1314.services.bean.User where userName=:userName and password=:password";
			
			Query query = em.createQuery(queryText);
			query.setParameter("userName", userName);
			query.setParameter("password", password);
			
			List users = query.getResultList();
			
			if ( !users.isEmpty() ) {
				try {
					feed = input.build(new XmlReader(link));
					// System.out.println(feed);
					
					User u = (User) users.get(0);
					
					Feed res = new Feed();
					res.setFeedTitle(feed.getTitle());
					res.setLink(link);
					res.setDescription(feed.getDescription());
					res.setPubDate(feed.getPublishedDate());
					
					//res.setContents(this.syndFeedContentToContent(feed.getEntries()));
					/*
					 *  TODO 
					 *  	- Add the contents as a List<Content>.
					 *  	- Add the Feed to the User's List<Feed>.
					 *  	- Verifications?
					 *  	- Update the user in the database.
					 */
					
				} catch (IllegalArgumentException e) {
					e.printStackTrace();
				} catch (FeedException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
				
				return 1;
			}
			else {
				System.out.println("[FeedManagement] : subscribe - user does not exist or wrong password");
				
				return 0;
			}
			
		}
		else {
			System.out.println("[FeedManagement] : subscribe - link not correct");
			return 0;
		}
	}
	
	public List<Content> syndFeedContentToContent(List<SyndFeed> entries) {
		// TODO
		
		return null;
	}

	@Override
	public int unsubscribe(String userName, String password, URL link) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Feed> retrieveFeeds(String userName, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
