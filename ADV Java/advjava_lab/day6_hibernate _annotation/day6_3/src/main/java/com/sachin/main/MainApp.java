package com.sachin.main;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sachin.main.model.CustomDate;
import com.sachin.main.model.Player;
import com.sachin.main.model.Team;


public class MainApp {

	public static void main(String[] args) {

		List<Player> batterList=new ArrayList();
		Team t1=new Team(1, "Mumbai",batterList);
		
		Player p1= new Player(1, "Sachin Kolhe", new CustomDate(13,10,1999),t1);
		Player p2= new Player(2, "Nikhil Kolhe", new CustomDate(8,11,2002),t1);
		
		batterList.add(p1);
		batterList.add(p2);
		
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		
		Transaction tr= session.beginTransaction();
		
		session.save(t1);
		
		tr.commit();
		session.close();
	
	}

}
