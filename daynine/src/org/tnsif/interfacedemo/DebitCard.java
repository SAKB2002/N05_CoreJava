package org.tnsif.interfacedemo;

public interface DebitCard {
	long cardno=354584545652L;
	//we cannot use concrete method in interface
	void displayCardDetails();
	// default and static method re new features of java8 which can use inside 
	default void display()
	{
		System.out.println("Deafault Method");
	}
	static void print()
	{
		System.out.println("Static method");
	}
	

}
