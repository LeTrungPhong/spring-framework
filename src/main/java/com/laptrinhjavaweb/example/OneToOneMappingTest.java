package com.laptrinhjavaweb.example;

import org.hibernate.Session;

import com.laptrinhjavaweb.util.HibernateUtils;

public class OneToOneMappingTest {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			session.beginTransaction();
			
		}
	}
}
