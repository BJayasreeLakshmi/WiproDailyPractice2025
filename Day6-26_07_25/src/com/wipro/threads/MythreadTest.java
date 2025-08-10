package com.wipro.threads;

public class MythreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Counter counter=new Counter();
		
		MyThread t1=new MyThread(counter);
		MyThread t2=new MyThread(counter);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(counter.count);

	}

}
