package org.company;

import org.client.Client;

public class Company extends Client {
public void companyName() 
{
System.out.println("This is my company name.....");	

}
public static void main(String[] args) 
{
	Company c = new Company();
	c.companyName();
	c.clientName();
}
}
