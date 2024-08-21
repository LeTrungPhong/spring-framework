package com.laptrinhjavaweb.example;

import java.util.List;

import org.hibernate.Session;

import com.laptrinhjavaweb.model.Account;
import com.laptrinhjavaweb.util.HibernateUtils;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class criteriaDemo {
	public static void main(String[] args) {
		try(Session session = HibernateUtils.getSessionFactory().openSession();){
			CriteriaBuilder cb = session.getCriteriaBuilder();
			CriteriaQuery<Account> cr = cb.createQuery(Account.class);
			Root<Account> root = cr.from(Account.class);
			cr.select(root);
			Query query = session.createQuery(cr);
			List<Account> listAccount = query.getResultList();
			listAccount.forEach(System.out::println);
			session.close();
		}
	}
}

// Hibernate Criteria Query

// query.select(root); // SELECT
// query.where(builder.equal(root.get("id"), 1)); // WHERE u.id = 1
// query.where(builder.and(builder.ge(root.get("id"), 1), builder.le(root.get("id"), 1000))); // WHERE id >= 1 AND id <= 1000
// query.orderBy(builder.desc(root.get("createdAt")), builder.desc(root.asc("fullname"))); // ORDER BY createdAt DESC, fullname ASC
// query.select(root.get("fullname")); // SELECT fullname
// query.multiselect(root.get("fullname"), root.get("username")); // SELECT fullname, username

// cr.select(root).where(cb.like(root.get("empName"),"%R%"));
// cr.select(root).where(cb.like(root.get("empName"),"__R%%"));

// (Selecting a wrapper)
// (Aggregate Functions)
// Join<User, UserProfile> userJoin = root.join("userProfile", JoinType.LEFT);
