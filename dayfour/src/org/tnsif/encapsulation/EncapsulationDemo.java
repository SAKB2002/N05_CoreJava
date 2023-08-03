package org.tnsif.encapsulation;
public class EncapsulationDemo {

	public static void main(String[] args) {
		HDFC h= new HDFC();
		h.setAccountNo(498854223222121L);
		h.setAccountTyoe("current Account");
		h.setCvvNo(233);
		h.setPinNO(1221);
		//System.out.println(h.getAccountNo());
		//System.out.println(h.getAccountTyoe());
		//System.out.println(h.getCvvNo());
		//System.out.println(h.getPinNO());
		System.out.println(h);

	}

}
