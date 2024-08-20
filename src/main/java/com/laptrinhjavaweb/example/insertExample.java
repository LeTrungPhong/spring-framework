package com.laptrinhjavaweb.example;

import org.hibernate.Session;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

public class insertExample {
	public static void main(String[] args) {
		try (Session session = HibernateUtils.getSessionFactory().openSession();) {
            session.beginTransaction();
            Account account = new Account();
            account.setAccount_ID("1");
            account.setUsername("letrungphong");
            account.setPassword("phong123");
            session.persist(account);
        //  session.save(account);
            session.getTransaction().commit();
            session.close();
        } catch(Exception e){
        	e.printStackTrace();
        }
	}
}
