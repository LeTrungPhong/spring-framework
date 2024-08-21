package com.laptrinhjavaweb.example;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.SelectionQuery;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

public class listExample {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			SelectionQuery<Account> query = session.createSelectionQuery("from Account",Account.class);
			List<Account> accountList = query.list();
			accountList.forEach(System.out::println);
			session.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
