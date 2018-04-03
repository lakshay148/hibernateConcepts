package org.lakshay.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.lakshay.hibernate.dto.User;

public class HibernateTest {

	public static void main(String[] args) {
		User user = new User();
		user.setUserId(2);
		user.setUserName("lakshay");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}
}
