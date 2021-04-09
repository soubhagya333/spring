package com.xworkz.spring.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.spring.entity.FoodItemEntity;

public class FoodItemRepositaryImpl implements FoodItemRepositary {

	private SessionFactory factory;
	public FoodItemRepositaryImpl(SessionFactory factory) {
		System.out.println(this.getClass().getSimpleName());
		this.factory=factory;
	}
	@Override
	public void save(FoodItemEntity entity) {
		// TODO Auto-generated method stub
		
		System.out.println("Invoked save "+entity);
		
		Configuration cfg=new Configuration();
		cfg.configure();
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		session.beginTransaction();
		session.save(entity);
		session.getTransaction().commit();
		session.close();
		factory.close();
	}
 

}
