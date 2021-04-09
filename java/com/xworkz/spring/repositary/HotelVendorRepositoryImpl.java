package com.xworkz.spring.repositary;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.xworkz.spring.entity.HotelVendorEntity;

public class HotelVendorRepositoryImpl implements HotelVendorRepositary {

	private SessionFactory factory;
	public HotelVendorRepositoryImpl(SessionFactory factory) {
		// TODO Auto-generated constructor stub
		System.out.println("created "+this.getClass().getSimpleName());
		this.factory=factory;
	}
	@Override
	public void save(HotelVendorEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("Invoked save");
		
	
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
