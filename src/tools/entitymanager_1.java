package tools;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

public class entitymanager_1 {
   
	  private static final EntityManagerFactory emf=javax.persistence.
			  Persistence.createEntityManagerFactory("my");
	  
	  private static final EntityManager em=emf.createEntityManager();
	  
	  private static final  EntityTransaction et=em.getTransaction();
	  
	  public static EntityManager  getet(){
		  return em==null?emf.createEntityManager():em;
	  }
	  
	  
}
