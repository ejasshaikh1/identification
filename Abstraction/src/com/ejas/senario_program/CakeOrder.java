package com.ejas.senario_program;

public class CakeOrder
{
	public static void main(String[] args)
	{
		OrderedCake o = new OrderedCake();
		System.out.println(o);
		
		OrderedCake p = new OrderedCake("Round","Chocolate",4);
		System.out.println(p);
		
		OrderedCake q = new OrderedCake("Square","Pineapple",3," Happy Birthday");
		System.out.println(q);
		
	}

}
