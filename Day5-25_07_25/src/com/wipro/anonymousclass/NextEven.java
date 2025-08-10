package com.wipro.anonymousclass;

import java.util.function.Consumer;

public class NextEven {
	public static void main(String[] args) {
		
		Consumer<Integer> c=(eNum)->{int num=(eNum % 2 == 0) ? eNum + 2 : eNum + 1;
		System.out.println(num);
			
		};
		c.accept(7);
		
	}

}
