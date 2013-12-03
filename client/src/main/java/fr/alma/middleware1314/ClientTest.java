package fr.alma.middleware1314;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import fr.alma.middleware1314.api.interfaces.IFeedManagement;
import fr.alma.middleware1314.api.interfaces.IUserManagement;

public class ClientTest {

	public static void main(String[] args) throws NamingException, MalformedURLException {
		Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming"); 
        Context context = new InitialContext(jndiProperties);

        IUserManagement um = (IUserManagement) context.lookup("ejb:/reader-services-0.1-SNAPSHOT/UserManagement!fr.alma.middleware1314.api.interfaces.IUserManagement");
        int result = um.register("Plop", "Lol");
        System.out.println(result);
        
        int result2 = um.connect("Plop", "Lol");
        System.out.println(result2);
        
//        int result3 = um.unregister("Plop", "Lol");
//        System.out.println(result3);
//        
//        int result4 = um.connect("Plop", "Lol");
//        System.out.println(result4);
        
        //------------------------------------------------------------------------------
        
        IFeedManagement fd = (IFeedManagement) context.lookup("ejb:/reader-services-0.1-SNAPSHOT/FeedManagement!fr.alma.middleware1314.api.interfaces.IFeedManagement");
        int res1 = fd.subscribe("Plop", "Lol", new URL("http://linuxfr.org/news.atom"));
        System.out.println(res1);
	}

}
