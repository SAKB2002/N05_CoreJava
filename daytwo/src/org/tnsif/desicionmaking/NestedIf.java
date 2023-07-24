package org.tnsif.desicionmaking;
import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age =s.nextInt();
		int weight = s.nextInt();
		if(age>=12) {
		  if (weight>=40) {
			  System.out.println("Eligible");
			  if(weight>110) {
				  System.out.println("Extra Ropes");
			  }
		  } else {
			  System.out.println("Not Eligible");
		  }
		}

	}

}
