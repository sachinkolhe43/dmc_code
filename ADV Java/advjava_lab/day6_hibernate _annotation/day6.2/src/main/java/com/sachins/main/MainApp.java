package com.sachins.main;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.main.model.CustomDate;
import com.sachin.main.model.Player;

public class MainApp {

	public static void main(String[] args) {
		
		Player p1=new Player(1,"Damini", new CustomDate(13,12,2000));
		Player p2=new Player(2,"Sachin", new CustomDate(13,12,2000));
		Player p3=new Player(3,"Damini", new CustomDate(13,12,2000));
		
		Session ses=new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = ses.beginTransaction();
		
		ses.save(p1);
		ses.save(p2);

		ses.save(p3);
		
		tr.commit();
		ses.close();

		
		
		
	}

}
