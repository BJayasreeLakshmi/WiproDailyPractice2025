package com.wipro.anonymousclass;

public class GreetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GreetFun greet=()->{System.out.println("Hello Lambda Expression");};
		greet.sayhello();

	}
	

}
