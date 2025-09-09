package com.ejas.abstract_method;

abstract class Car
{
	protected int speed = 120;
	
	public Car()
	{
		System.out.println("Car class constructor");
	}
	
	public void geCarDetails()
	{
		System.out.println("It has four wheels and one engine!!!");
	}
	
	public abstract void run();
}

class Honda extends Car
{

	@Override
	public void run()
	{
		System.out.println("Honda Car is Running!!!");
		
	}
	
}
public class AbstractDemo
{
	public static void main(String[] args)
	{
		Car car = new Honda(); 
		
		System.out.println("Speed of the Car is :"+car.speed);
		car.geCarDetails();
		car.run();

	}

}
