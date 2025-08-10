package com.wipro.threads;

public class MyThread extends Thread{
	
	Counter counter;

	public MyThread(Counter counter) {
		super();
		this.counter = counter;
	}
	
	public void run() {
		for(int i=1;i<=10;i++) {
			counter.increment();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
