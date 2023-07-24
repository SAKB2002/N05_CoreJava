package org.tnsif.looping;
import java.util.*;
public class DoWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		
		do {
			System.out.println("value of n is: "+n);
			n++;
		}while(n<14);

	}

}
