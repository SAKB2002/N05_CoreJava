package org.tnsif.interfacedemo;

public class InterfaceExecutor {

	

	public static void main(String[] args) {
		SBIDebitCard s = new SBIDebitCard();
		s.displayCardDetails();
		s.display();
//print is static method
	DebitCard.print();
	CheesePopcorn c= new ChessePopcorn();
     c.displayReceipe();
     
	}

}
