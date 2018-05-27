package main;

import java.util.Date; 



import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  

import entity.Student;
import entity.user;
  
public class testhibernate {  
    public static void main(String[] args) {  
        //��ȡ�����ļ�  
        Configuration cfg = new Configuration().configure();  
          
        SessionFactory factory = cfg.buildSessionFactory();  
          
        Session session = null;  
        try{  
            session = factory.openSession();  
            //��������  
            session.beginTransaction();  
              
          /* user u=new user();
            u.setUsername("ada");  
            u.setPassword("123");  
            u.setCreateTime(new Date());  
            u.setExpireTime(new Date());  
              
            session.save(u); */
         Student st=(Student) session.get(Student.class, 3);
         
         System.out.println(st.getSex());
            //�ύ����  
            session.getTransaction().commit();  
              
        }catch(Exception e){  
            e.printStackTrace();  
            //�ع�����  
            session.getTransaction().rollback();  
        }finally{  
            if(session != null){  
                if(session.isOpen()){  
                    //�ر�session  
                    session.close();  
                }  
            }  
        }  
    }  
}  