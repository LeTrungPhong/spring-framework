package com.laptrinhjavaweb.example;

import org.hibernate.Session;
import org.hibernate.query.MutationQuery;

import com.laptrinhjavaweb.util.HibernateUtils;

public class updateExample {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			session.beginTransaction();
			
			
//			Account account = session.get(Account.class, "1");
//			account.setUsername("letrungphong");
//			session.merge(account);
			 
			System.out.println("1");
			MutationQuery query = session.createMutationQuery("UPDATE Account SET username = :username WHERE account_ID = :account_ID");
			query.setParameter("username", "nguyenthanhtrung");
			query.setParameter("account_ID","1");
			System.out.println("2");
			
			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
