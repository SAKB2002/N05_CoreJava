package org.tnsif.desicionmaking;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int key = s.nextInt();
		
		switch(key) {
		case 1:System.out.println("Hello");
		break;
		case 2:System.out.println("Hii");
		break;
		default:System.out.println("Invalid key");
		}
		

	}

}
