package org.bank;

import org.sample.AxisBank;

public class CityBank extends AxisBank
{
	
public void savings() {
	System.out.println("Savings Interest rate is : 8%");
	//super.savings;
}
public void deposite() {
	System.out.println("Interest rate is : 10%");
}
public void fixed() {
	System.out.println("Fixed interest rate is : 12%");
}
public static void main(String[] args) 
{
	CityBank cb = new CityBank();
	cb.savings();
	cb.deposite();
	cb.fixed();
	
}
}
