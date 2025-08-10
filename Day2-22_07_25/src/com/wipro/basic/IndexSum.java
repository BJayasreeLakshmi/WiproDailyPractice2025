package com.wipro.basic;

public class IndexSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {2,7,11,15};
		int target=9;
		int []outPut= {0,0};
		for(int i=0;i<arr.length;i++)
		if(((i+1)<=arr.length)&&(arr[i]+arr[i+1]==target)){
			
			outPut[0]=i;
			outPut[1]=i+1;
		}

		System.out.println(outPut[0]+" , "+outPut[1]);
	}

}
