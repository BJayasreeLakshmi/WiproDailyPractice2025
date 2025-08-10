package com.wipro.exception;

public class InvalidMonthExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkMonth(0);
		}catch(InvalidMonthException e) {
			e.printStackTrace();
		}

	}

	private static void checkMonth(int month)throws InvalidMonthException {
		// TODO Auto-generated method stub
		if(month<1 ||month>12) {
			throw new InvalidMonthException("Invalid Month");
		}
		else {
			System.out.println("Given month is Valid");
			
		}
	}

}
