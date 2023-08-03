package org.tnsif.accessspecifier;
public class Bank {
	public String bankName;
	private int pinNo;
    long accountNo=245798631458L;
    
    public void displayPublic()
    {
    	System.out.println("Bank Name is:" +bankName);
    	
    }
    private void displayPrivate() {
    	System.out.println("Pin No. is:"+pinNo);
    }
    void display() {
    	System.out.println("Account No.is:" +accountNo); 
    }

}
