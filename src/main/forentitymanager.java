package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entity.Student;
import tools.entitymanager_1;

public class forentitymanager {
    static  EntityTransaction et=null;
    static  EntityManager em=null;
	public  static  void main(String a[]){
		em=entitymanager_1.getet();
		et=em.getTransaction();
		et.begin();
		add();
		et.commit();
		em.close();
		
	}
	public  static void  add(){
		Student s=new Student();
		s.setAge(29);
		s.setName("zgm");
		s.setSex("woman");
		em.persist(s);
		
	}
	
}
