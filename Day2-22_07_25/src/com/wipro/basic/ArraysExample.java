package com.wipro.basic;

public class ArraysExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,1,2,3,4,4,5};
		//int []arr2= {0,1,1,2,3,4,4,5};
		int count=0;
		int arr3[]=new int[arr.length];
//		int largest=-1;
//		int secondLargest=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>largest) {
//				secondLargest=largest;
//				largest=arr[i];
//				
//			}
//			
//		}
//		System.out.println(secondLargest);
		int n=arr[0];
		int len=1;
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]!=arr[i-1])	{
				count++;
				arr[len++]=arr[i];
				
			}
			
		}
		for(int i=0;i<count;i++) {
			System.out.println(arr[i]);
			
		}
		
		

	}

}
