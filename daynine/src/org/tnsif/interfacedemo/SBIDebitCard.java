package org.tnsif.interfacedemo;

public class SBIDebitCard implements DebitCard{

	@Override
	public void displayCardDetails() {
		System.out.println("Card No is" +cardno);
		
	}
	

}
