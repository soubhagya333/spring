package com.xworkz.spring.repositary;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import com.xworkz.spring.entity.CustomerEntity;

public class CustomerRepositaryImpl implements CustomerRepository {
	
	private SessionFactory factory;
	public CustomerRepositaryImpl(SessionFactory factory) {
		// TODO Auto-generated constructor stub
		System.out.println("created "+this.getClass().getSimpleName());
		this.factory=factory;
	}
	
	@Override
	public void save(CustomerEntity entity) {
		// TODO Auto-generated method stub
		System.out.println("invoked save" + entity);
		
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
