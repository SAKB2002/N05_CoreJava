package org.tnsif.desicionmaking;
import java.util.Scanner;

public class IfElseExecutor {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int age = s.nextInt();
		int weight = s.nextInt();
		if(age>18 && weight>50) {
			System.out.println("eligible");
		} else {
			System.out.println("not eligible");
		}

	}

}
