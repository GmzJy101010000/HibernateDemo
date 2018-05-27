package main;

import java.util.Date; 



import org.hibernate.Session;  
import org.hibernate.SessionFactory;  
import org.hibernate.cfg.Configuration;  

import entity.Student;
import entity.user;
  
public class testhibernate {  
    public static void main(String[] args) {  
        //读取配置文件  
        Configuration cfg = new Configuration().configure();  
          
        SessionFactory factory = cfg.buildSessionFactory();  
          
        Session session = null;  
        try{  
            session = factory.openSession();  
            //开启事务  
            session.beginTransaction();  
              
          /* user u=new user();
            u.setUsername("ada");  
            u.setPassword("123");  
            u.setCreateTime(new Date());  
            u.setExpireTime(new Date());  
              
            session.save(u); */
         Student st=(Student) session.get(Student.class, 3);
         
         System.out.println(st.getSex());
            //提交事务  
            session.getTransaction().commit();  
              
        }catch(Exception e){  
            e.printStackTrace();  
            //回滚事务  
            session.getTransaction().rollback();  
        }finally{  
            if(session != null){  
                if(session.isOpen()){  
                    //关闭session  
                    session.close();  
                }  
            }  
        }  
    }  
}  