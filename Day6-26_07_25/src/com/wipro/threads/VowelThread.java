package com.wipro.threads;

import java.util.List;

public class VowelThread implements Runnable {
	
	List<String>names;
	
	 

	public VowelThread(List<String> names) {
		super();
		this.names = names;
	}



	@Override
	public void run() {
		
		for(int i=0;i<names.size();i++) {
			String name=names.get(i);
			if(startWithVowel(name)) {
				names.set(i, name.toUpperCase());
				
			}
		}
	}



	private boolean startWithVowel(String name) {
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
