package com.ejas.inner_class;

abstract class Loan
{
	public abstract void applyLoan();
}
public class AnonymousInnerClassDemo 
{
	public static void main(String[] args) 
	{
		Loan carLoan = new Loan()
		{

			@Override
			public void applyLoan() 
			{
				System.out.println("Apply for Car loan");
				
			}
			
		};
		
		Loan bikeLoan = new Loan()
	    {

			@Override
			public void applyLoan() 
			{
				
				System.out.println("Apply for Bike loan");
			}		

	    };
	    
	    carLoan.applyLoan();
	    bikeLoan.applyLoan();

}
}
