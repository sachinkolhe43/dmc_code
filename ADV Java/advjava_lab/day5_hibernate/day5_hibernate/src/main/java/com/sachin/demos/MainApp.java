package com.sachin.demos;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.model.Player;

public class MainApp {

	public static void main(String[] args) {
		
		Player p1=new Player(1,"Rudrakshi Padole", 6);
		Configuration cfg=new Configuration();
		cfg.configure("config.xml");
		SessionFactory factory= cfg.buildSessionFactory();
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
//		ses.save(p1);
		p1.setPlayerName("Rutuja");
		ses.update(p1);
		tr.commit();
		ses.close();
		
	}

}
