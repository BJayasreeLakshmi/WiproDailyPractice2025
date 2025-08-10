package com.wipro.threads;

public class AlphabetThread extends Thread{
	
	public void run() {
		for(char c='A';c<='J';c++) {
			System.out.println(c);
			try {
				Thread.sleep(100);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

}
