package com.laptrinhjavaweb.example;

import org.hibernate.Session;
import org.hibernate.query.MutationQuery;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

public class updateExample {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			session.beginTransaction();
			
			
//			Account account = session.get(Account.class, "1");
//			account.setUsername("letrungphong");
//			session.merge(account);
			
//			Account account = session.get(Account.class, "1");
//			account.setUsername("letrungphong");
//			session.update(account);
			 
			MutationQuery query = session.createMutationQuery("update Account set username = :username where account_ID = :account_ID");
			query.setParameter("username", "nguyenthanhtrung");
			query.setParameter("account_ID","1");
			query.executeUpdate();
			
//			Query query = session.createQuery("update Account set username = :username where account_ID = :account_ID");
//			query.setParameter("username", "nguyenthanhtrung");
//			query.setParameter("account_ID","1");
//			query.executeUpdate();
			
			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
