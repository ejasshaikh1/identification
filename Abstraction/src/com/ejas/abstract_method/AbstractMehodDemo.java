package com.ejas.abstract_method;

abstract class ATM
{
	public abstract void withdraw(double amount);
	public abstract void deposet(double amount);
public abstract void pinChange();
}

class SBIATM extends ATM
{

	@Override
	public void withdraw(double amount) 
	{
		System.out.println("Making a withdrew of "+amount+" through SBI ATM");
		
	}

	@Override
	public void deposet(double amount)
	{
		System.out.println("Making a deposit of "+amount+" through SBI ATM");		
	}

	@Override
	public void pinChange()
	{
		System.out.println("PIN Changed Successfull!!!!");
		
	}
	
}
public class AbstractMehodDemo 
{
	public static void main(String[] args)
	{
		ATM atm = new SBIATM();
		atm.deposet(20000);
		atm.withdraw(12000);
		atm.pinChange();
	}

}
