package com.wipro.hibernatedemo.repo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Transaction;

import org.hibernate.Session;

import com.wipro.hibernatedemo.entity.Pan;
import com.wipro.hibernatedemo.util.HibernateUtil;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class PanRepo {
	
	public static void updateMovie()
    {
    	
    	Scanner sc= new Scanner(System.in); 
    	
    	System.out.println("Please enter  id");
    	int id= sc.nextInt();
    	System.out.println("Please enter PAN Holder name");
    	String panHolderName= sc.next();
    	System.out.println("Please enter PAN Number");
    	String panNumber= sc.next();
    	
    	Double movieRating= sc.nextDouble();
    	Pan m= new Pan(id,panHolderName,panNumber);
    	save1(m);
    }
	 public static void createPan()
	    {
	    	Scanner sc= new Scanner(System.in); 
	    	
	    	System.out.println("Please enter PAN Holder Name");
	    	String panHolderName= sc.next();
	    	System.out.println("Please enter PAN Number");
	    	String panNumber= sc.next();
	    	Pan m= new Pan(panHolderName,panNumber);
	    	save1(m);
	    	
	    	
	    }
	//insert and update
	public static void save1(Pan p)
		  {
		    Session session= HibernateUtil.getSessionFactory().getCurrentSession();
		    Transaction transaction=session.beginTransaction();
		    	
		    if(p.getId()!=0)//update
		    {
		    	Pan p1=findById(p.getId());
		    	p1.setPanHolderName(p.getPanHolderName());
		    	p1.setPanNumber(p.getPanNumber());
		
		    	session.persist(p1);
		    	}
		    	else {//insert
		    	   	session.persist(p);
		    	}
		    	transaction.commit();     	
		    	
		   }
	
	public static Pan findById(int id)
    {
     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	Pan p=session.find(Pan.class, id);
    	return p;
    	
    }
	
	public static Pan deleteById(int id)
    {
     	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	Pan m=session.find(Pan.class, id);
    	session.remove(m);
    	transaction.commit();
    	return m;
    	
    }
	
	public static List<Pan> findAll()
    {
    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	//sql=>db tables
    	//hql->java entities
    	String hqlQuery="from pan";//select * from pan
    	Query query=session.createQuery(hqlQuery);
    	List<Pan> list=query.list();
    	return list;
    	
    	
    	
    }
	public static List<String> findAllPanMembers()
    {
    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
    	Transaction transaction=session.beginTransaction();
    	//sql=>db tables
    	//hql->java entities
    	String hqlQuery="SELECT panHolderName from pan";//select panholdername from pan
    	Query query=session.createQuery(hqlQuery);
    	List<String> list=query.list();
    	return list;   	
    	
    	
    }
//	public static List<Pan> findByPanNumber(String panNumber)
//    {
//    	Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//    	Transaction transaction=session.beginTransaction();
//    	//sql=>db tables
//    	//hql->java entities
//    	String hqlQuery="from pan where panNumber=:pNumber";//select *  from movie where movie_language=''
//    	Query query=session.createQuery(hqlQuery,pan.class);
//    	query.setParameter("pNumber",panNumber);
//    	List<Pan> list=query.list();
//    	return list;   	
//    	
//    	
//    }
	
	 

}
