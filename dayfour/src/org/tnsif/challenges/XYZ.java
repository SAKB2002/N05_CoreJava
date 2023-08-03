//Their are n people standing in circle waiting to be executed.
//The counting out begins at some point in the circle and proceed around the circle in the fixed circle.ssss
//in each step a certain no. of people are skipped and the next person is executed.
//the elimination proceeds around the circle (which is becoming smaller and smaller as executed people are removed);
//until only the last person remains,who is given freedom.
//given the total no. of person n and no. k which indicates that k-1 person are skipped and k person is killed in circle.
//task is to choose the person  in initial circle that survive.
package org.tnsif.challenges;

import java.util.Scanner;

public class XYZ {
static int survive(int n,int k) {
	if(n==1)
		return 1;
		else
			return(survive(n-1,k)+k+1)%n+1;
}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		System.out.println(survive(n,k));
	

	}

}
