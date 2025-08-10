package com.wipro.threads;

import java.util.List;

public class ConsonantThread implements Runnable {

	List<String>names;
	
	
	
	public ConsonantThread(List<String> names) {
		super();
		this.names = names;
	}
	


	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<names.size();i++) {
			String name=names.get(i);
			if(!startWithConsonant(name)) {
				names.set(i, name.toLowerCase());
				
			}
		}
		
	}


	private boolean startWithConsonant(String name) {
		char c = Character.toLowerCase(name.charAt(0));
	    switch (c) {
	        case 'a':
	        case 'e':
	        case 'i':
	        case 'o':
	        case 'u':
	            return true;
	        default:
	            return false;
		
		
	}

}
}
