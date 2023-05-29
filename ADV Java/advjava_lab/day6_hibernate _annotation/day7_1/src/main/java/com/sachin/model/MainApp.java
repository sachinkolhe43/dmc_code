package com.sachin.model;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		
		Player p1=new Player(1, "Sachin Kolhe", 12);
		Player p2=new CappedPlayer(2, "Tushar Managale", 3, "12 jan 2020");
		Player p3= new ExPlayer(3, "Ruda", 12, "23 May 2023");
		
		Session session= new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(p1);
		session.save(p2);
		session.save(p3);
		
		tr.commit();
		session.close();
	}

}
