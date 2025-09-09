package com.ejas.inner_class;

class Super
{
	public void display()
	{
		System.out.println("Super class display method");
	}
}
public class AnonymousInnerClassDemo1 
{
	public static void main(String[] args) 
	{
	Super sub = new Super()
	{
     @Override
     public void display()
     {
    	 System.out.println("Sub class display method");
     }
	};
	
	sub.display();

}
}