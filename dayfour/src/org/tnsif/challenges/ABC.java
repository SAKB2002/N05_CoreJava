package org.tnsif.challenges;

import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of n and t");
int n = sc.nextInt();
int t = sc.nextInt();
ismangotree(n, t);
	}
	
	static void ismangotree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=1)
			System.out.println("Mango Tree");
		else
			System.out.println("Not a mango tree");
	}

}

	

		
	