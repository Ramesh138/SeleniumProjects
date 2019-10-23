package com.programs.javaprograms;

public class sumofnaturalnumbers {

	public static void main(String[] args) {

		int i = 10;

		int sum = 0;

		/*
		 * for ( i = 0; i <= 10;i++) {
		 * 
		 * sum=sum+i; }
		 */
		

		while (i>10) {
			sum = sum + i;
			
			i++;
		}

		System.out.println("Sum value " + sum);

	}

}
