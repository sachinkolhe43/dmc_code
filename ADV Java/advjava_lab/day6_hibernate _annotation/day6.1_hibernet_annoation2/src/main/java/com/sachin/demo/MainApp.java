package com.sachin.demo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.demo.model.CostomDate;
import com.sachin.demo.model.Player;

public class MainApp {

	public static void main(String[] args) {
		
		
		Player p1= new Player(6,"Sachin Kolhe", 5, new CostomDate(13,10,1999));
		Player p2= new Player(1,"Rudra Padole", 6, new CostomDate(17,02,2001));
		Player p3= new Player(6,"Rutuja Choughule", 7, new CostomDate(13,10,1999));
		Player p4= new Player(6,"Jaie Bobade", 1, new CostomDate(13,10,1999));
		
		List<Player> p=new ArrayList<Player>();
		p.add(p1);
		p.add(p2);
		p.add(p3);
		p.add(p4);

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory= cfg.buildSessionFactory();	
		Session ses=factory.openSession();
		Transaction tr=ses.beginTransaction();
		
		
		
		ses.save(p1);
		ses.save(p2);
		ses.save(p3);
		ses.save(p4);


		tr.commit();
		ses.close();
		
	}

}
