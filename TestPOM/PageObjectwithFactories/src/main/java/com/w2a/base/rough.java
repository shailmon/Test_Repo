package com.w2a.base;

public class rough {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * int n1=0,n2=1,n3,i,count=10; System.out.print(n1+" "+n2);//printing 0 and 1
		 * 
		 * for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
		 * { n3=n1+n2; System.out.print(" "+n3); n1=n2; n2=n3;
		 * 
		 */
//	}

		/*
		 * //proime int a =19; boolean flag = true; for(int i =2 ;i<a;i++) {
		 * 
		 * if(a%i==0) {
		 * 
		 * //System.out.println(i); flag = false; break; }
		 * 
		 * 
		 * } if(flag) System.out.println("prime"); else System.out.println("not prime");
		 */

		// reverse

		/*
		 * int numb = 6789; int sum =0 ; int temp = 0; while(numb>0) {
		 * 
		 * sum = numb % 10 + sum; numb = numb / 10;
		 * 
		 * 
		 * 
		 * } System.out.println(sum);
		 */

		/*
		 * //factorial int a =5; int fact=1; for(int i =1;i<=a;i++) {
		 * 
		 * fact = fact*i+fact;
		 * 
		 * 
		 * 
		 * 
		 * } System.out.println(fact);
		 */

		int[] arr = new int[] { 2, 8, 3, 2, 2, 2, 5, 69 };

		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					arr[j] = 0;

				}

			}

		}
		for(int i =0;i<arr.length;i++) {
			
			
			if(arr[i] != 0) {
			System.out.println(arr[i]);}
		}

		/*
		 * int first = arr[0]; for(int i =0;i<arr.length-1;i++) {
		 * 
		 * //first=arr[0]; arr[i]= arr[i+1];
		 * 
		 * 
		 * } arr[arr.length-1]=first;
		 * 
		 * for(int i =0;i<arr.length;i++) {
		 * 
		 * System.out.println(arr[i]);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * int freq[] = new int[arr.length]; int count = 1; for(int i
		 * =0;i<arr.length;i++) {
		 * 
		 * freq[i] = 1; for(int j =i+1;j<arr.length;j++) {
		 * 
		 * 
		 * if(arr[i]==arr[j]) {//1 --> 2
		 * 
		 * freq[i] = freq[i] + 1; arr[j] = 0;
		 * 
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 * }
		 * 
		 * }
		 * 
		 * 
		 * for(int i =0;i< arr.length;i++) {
		 * 
		 * if(arr[i]!=0) { System.out.println(arr[i]+" -->"+freq[i]); }
		 * 
		 * }
		 * 
		 * 
		 * 
		 * 
		 */
	}
}
