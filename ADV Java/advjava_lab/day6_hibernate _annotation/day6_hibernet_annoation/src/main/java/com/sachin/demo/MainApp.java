package com.sachin.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.demo.model.CostomDate;
import com.sachin.demo.model.Player;

public class MainApp {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();	
		Session ses=factory.openSession();
		
		Transaction tr=ses.beginTransaction();
		Player p1= new Player(6,"Sachin Kolhe", 5, new CostomDate(13,10,1999));
		
		ses.save(p1);
		tr.commit();
		ses.close();
		
	}

}
