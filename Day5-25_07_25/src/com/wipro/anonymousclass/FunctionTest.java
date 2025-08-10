package com.wipro.anonymousclass;


import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {
        Function<Double, Double> fraction = fr -> {
            double fractionres = fr - Math.floor(fr);
            
            return Math.round(fractionres * 100.0) / 100.0;
        };

        double number = 123.45;
        double result = fraction.apply(number);

        System.out.println("Fraction of " + number + " is " + result);
    }
}
