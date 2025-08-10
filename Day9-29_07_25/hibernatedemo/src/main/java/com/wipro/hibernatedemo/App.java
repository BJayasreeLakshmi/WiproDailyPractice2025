package com.wipro.hibernatedemo;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.wipro.hibernatedemo.entity.Pan;
import com.wipro.hibernatedemo.repo.PanRepo;
import com.wipro.hibernatedemo.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        Session session= HibernateUtil.getSessionFactory().getCurrentSession();
//    	Transaction transaction=session.beginTransaction();
//    	Pan m= new Pan("Jayasree","CGIPJ151");   
//    	session.persist(m);
//    	transaction.commit(); 
    	int choice=0;
    	do {
    	System.out.println("--Menu---");
    	System.out.println("1.--Create PAN---");
    	System.out.println("2.--Findby ID PAN ---");
    	System.out.println("3.--Update PAN---");
    	System.out.println("4.--Delete by  id---");
    	System.out.println("5.--Find All PAN MEMBERS---");
    	System.out.println("6.--Find All PAN MemberNames---");
    	System.out.println("7.--Find By PAN Number---");
    	System.out.println("9.--Exit---");
    	Scanner sc= new Scanner(System.in);    	
    	  choice= sc.nextInt();
    	  
    	
	    	switch(choice)
	    	{
	    		case 1:
	    			PanRepo.createPan();
	    		break;
	    		case 2:
	    			System.out.println("Please enter Pan id:");
	    			int id= sc.nextInt();
	    			Pan p=PanRepo.findById(id);
	    			System.out.println(p);
	    			
	    		case 3:
	    			PanRepo.updateMovie();
	    			break;
	    			
	    		case 4:
	    			 
	    			System.out.println("Please enter Pan id:");
	    			int id1= sc.nextInt();
	    			PanRepo.deleteById(id1);
	    			break;
	    			
	    		case 5:
	    			List<Pan> list=PanRepo.findAll();
	    			System.out.println(list);
	    			break;
	    		case 6:
	    			List<String> PanNameList=PanRepo.findAllPanMembers();
	    			System.out.println(PanNameList);
	    			break;
	    		case 7:
//	    			System.out.println("Please PanNumber");
//	    			String language=sc.next();
//	    			List<Pan> listMovies= PanRepo.find(language);
	    			//System.out.println(listMovies);
	    			break;
	    		case 9:
	    			return;
	    		
	    		default:
	    			System.out.println("Invalid option please try again");
	    			break;
	    	
	    	 }
    
        	 
    	}while(choice!=9);
    }
    	
    	
    }


