package org.tnsif.encapsulation;
public class HDFC {
	private long accountNo;
	private int cvvNo;
	private String accountTyoe;
	private int pinNO;
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public int getCvvNo() {
		return cvvNo;
	}
	public void setCvvNo(int cvvNo) {
		this.cvvNo = cvvNo;
	}
	public String getAccountTyoe() {
		return accountTyoe;
	}
	public void setAccountTyoe(String accountTyoe) {
		this.accountTyoe = accountTyoe;
	}
	public int getPinNO() {
		return pinNO;
	}
	@Override
	public String toString() {
		return "HDFC [accountNo=" + accountNo + ", cvvNo=" + cvvNo + ", accountTyoe=" + accountTyoe + ", pinNO=" + pinNO
				+ ", getAccountNo()=" + getAccountNo() + ", getCvvNo()=" + getCvvNo() + ", getAccountTyoe()="
				+ getAccountTyoe() + ", getPinNO()=" + getPinNO() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	public void setPinNO(int pinNO) {
		this.pinNO = pinNO;
	}
	
	

}
