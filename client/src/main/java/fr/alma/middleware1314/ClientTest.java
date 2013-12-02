package fr.alma.middleware1314;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import fr.alma.middleware1314.api.interfaces.IUserManagement;

public class ClientTest {

	public static void main(String[] args) throws NamingException {
		Hashtable jndiProperties = new Hashtable();
        jndiProperties.put(Context.URL_PKG_PREFIXES, "org.jboss.ejb.client.naming"); 
        Context context = new InitialContext(jndiProperties);

        IUserManagement um = (IUserManagement) context.lookup("ejb:/reader-services-0.1-SNAPSHOT/UserManagement!fr.alma.middleware1314.api.interfaces.IUserManagement");
        int result = um.register("Plop", "Lol");
        System.out.println(result);
	}

}
