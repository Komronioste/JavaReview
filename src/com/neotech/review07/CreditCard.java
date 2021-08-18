package com.neotech.review07;

public class CreditCard {
	
	double balance, interest;
	
	public CreditCard (double balance)
	{
		this.balance = balance;
		
	}
	
	
	public void calculateInterest()
	{
		interest = 25;
		System.out.println("The interest rate is: " + interest + "%");
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void main(String[] args) {
		
		
		CreditCard cc1 = new CreditCard(12000);
		
		cc1.calculateInterest();
		
		CreditCard cc2 = new Visa(12000);
		
		cc2.calculateInterest();
		
		CreditCard cc3 = new AX(12000);
		
		cc3.calculateInterest();
		
		
		//////////array of credit cards / objects
		CreditCard[] cc = new CreditCard[3];
		cc [0] = new CreditCard(6000);
		cc [1] = new Visa(6000);
		cc [2] = new AX(6000);
		
		for (CreditCard card : cc)
		{
			card.calculateInterest();
		}
	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

}

class Visa extends CreditCard {

	public Visa(double balance) {
		super(balance);
		
	}
	
	@Override
	public void calculateInterest()
	{
		if ( balance > 10000)
			interest = 15;
		else 
			interest = 30;
		
		System.out.println("The interest rate is: " + interest + "%");
	}
	
}

class AX extends CreditCard {
	public AX(double balance) {
		super(balance);
	}
	
	@Override
	public void calculateInterest()
	{
		if ( balance > 5000)
			interest = 10;
		else 
			interest = 20;
		
		System.out.println("The interest rate is: " + interest + "%");
	}
}

