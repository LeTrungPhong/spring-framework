package com.laptrinhjavaweb.example;

import org.hibernate.Session;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

public class HibernateExample1 {
	public static void main(String[] args) {
		System.out.println("1");
		try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            // Begin a unit of work
            session.beginTransaction();
 
            // Insert user
//            Date currentDate = new Date();
//            User user1 = new User();
//            user1.setFullname("Hibernate Example");
//            user1.setUsername("gpcoder");
//            user1.setPassword("123456"); // Should encode password
//            user1.setCreatedAt(currentDate);
//            user1.setModifiedAt(currentDate);
            
            Account account = new Account();
            account.setAccount_ID("4");
            account.setUsername("nguyenminhphuc");
            account.setPassword("phuc123");
            session.save(account);
            
//            Long userId = (Long) session.save(account);
//            System.out.println("User id = " + userId); 
             
            // Count user from database
//            Long numberOfUser = session.createQuery("SELECT COUNT(account_ID) FROM Account", Long.class).uniqueResult();
//            System.out.println("Number of user in database: " + numberOfUser);
             
            // Get user by id
//            User savedUser = session.find(User.class, userId);
//            System.out.println("savedUser: " + savedUser);
             
            // Update user
//            savedUser.setFullname("GP Coder");
//            session.update(savedUser);
 
            // Get users
//            List<User> users = session.createQuery("FROM User", User.class).list();
//            users.forEach(System.out::println);
             
            // Delete user
//            session.delete(savedUser);
             
            // Commit the current resource transaction, writing any unflushed changes to the database.
            session.getTransaction().commit();
            System.out.println("2");
        } catch(Exception e){
        	e.printStackTrace();
        }
		System.out.println("3");
	}
}
