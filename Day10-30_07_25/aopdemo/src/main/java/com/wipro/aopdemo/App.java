package com.wipro.aopdemo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wipro.aopdemo.service.AirTravel;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        AirTravel process = context.getBean("airTravelProcess", AirTravel.class);

        try {
            process.checkIn(false); 
            process.collectBoardingPass();
            process.doSecurityCheck();
            process.doBoarding();
        } catch (Exception e) {
            
            System.out.println(e.getMessage());
        }
        
        
    }
}
