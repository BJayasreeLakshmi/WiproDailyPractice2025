package com.wipro.aopdemo.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import com.wipro.aopdemo.exception.NoSeatsAvailableException;

@Component
@Aspect
public class AirTravelAspect {
	 @Before("execution(* com.example.airtravel.AirTravelProcess.checkIn(..))")
	    public void showPhotoId() {
	        System.out.println("Please show your Photo ID before check-in.");
	    }

	    @Before("execution(* com.example.airtravel.AirTravelProcess.doSecurityCheck(..)) || execution(* com.example.airtravel.AirTravelProcess.doBoarding(..))")
	    public void showBoardingPass() {
	        System.out.println("Please show your Boarding Pass.");
	    }

	    @AfterThrowing(pointcut = "execution(* com.example.airtravel.AirTravelProcess.checkIn(..))", throwing = "ex")
	    public void handleNoSeatAvailable(NoSeatsAvailableException ex) {
	        System.out.println("Exception occurred during check-in: " + ex.getMessage());
	    }

}
