package com.wipro.aopdemo.service;

import org.springframework.stereotype.Component;

import com.wipro.aopdemo.exception.NoSeatsAvailableException;

@Component
public class AirTravel {
	public void checkIn(Boolean flag) throws NoSeatsAvailableException {
        if (flag) {
            System.out.println("Check-in successful.");
        } else {
            throw new NoSeatsAvailableException("No seat available!");
        }
    }

    public void collectBoardingPass() {
        System.out.println("Boarding pass collected.");
    }

    public void doSecurityCheck() {
        System.out.println("Security check completed.");
    }

    public void doBoarding() {
        System.out.println("Boarding completed.");
    }

}
