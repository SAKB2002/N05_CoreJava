package org.tnsif.polymorphism;

public class MethodOverloading
{
static class Bollywood
{
	String s1,s2,s3;
	static void  display(String s1 , String s2)
	{
		System.out.println(s1+" loves "+s2);
	}
	static void  display(String s1 , String s2,String s3)
	{
		System.out.println(s1+" loves "+s2+ " "+s3);
	}
}


	public static void main(String[] args)
{
Bollywood.display("Salman","Aish");
Bollywood.display("Salman","Aish","Katrina");

}

}