package com.wipro.threads;

public class ThreadsDemo {
	
	public static void main(String[] args) {
		NumberThread num=new NumberThread();
		AlphabetThread alpha=new AlphabetThread();
		
		num.start();
		alpha.start();
	}

}
