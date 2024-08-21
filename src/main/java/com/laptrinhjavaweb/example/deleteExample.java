package com.laptrinhjavaweb.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.SelectionQuery;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

public class deleteExample {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			session.beginTransaction();
			
//			Account account = new Account();
//			account.setAccount_ID("1");
			
			Account account = session.get(Account.class,"4");
			
//			SelectionQuery<Account> query = session.createSelectionQuery("from Account where username = :username", Account.class);
//			query.setParameter("username", "letrungphong");
//			List<Account> listAccount = query.list();
//			for(Account act : listAccount) {
//				session.remove(act);
//			}
			
//			Query query = session.createQuery("from Account where username = :username", Account.class);
//			query.setParameter("username", "letrungphong");
//			List<Account> listAccount = query.list();
//			for(Account act : listAccount) {
//				session.remove(act);
//			}
			
			session.remove(account);
		//  session.delete(account);
			session.getTransaction().commit();
			session.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
