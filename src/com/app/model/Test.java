package com.app.model;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {



		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session	 ses =sf.openSession();
		Transaction tx=ses.beginTransaction();


		Customer c=new Customer();
		c.setCusId(12);
		c.setCusName("dsjhds");
		c.getData().add("A1");
		c.getDatamap().put(23, "m1");

		c.getDatamap().put(34, "m2");

		
		ses.save(c);
		tx.commit();
		ses.close();

	}

}
