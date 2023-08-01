package org.tnsif.statickeyword;

public class StaticBlockExecutor {
static float salary;
String companyname;

   static {
	   //companyname="Accenture";
	   salary=56545;
	   
   }
	static void print()
	{
		System.out.println(salary);
	}
	public static void main(String[] args) {
		print();

	}

}
