package com.ejas.senario_program;

public class OrderedCake extends Cake
{
	 private String message;

	 
	 public OrderedCake()
	 {
		 super("Round","Vanilla",1);
	 }
	 
	 
	 
 public OrderedCake(String shape, String flavor, int quantity)
 {
		super(shape, flavor, quantity);
 }



 public OrderedCake(String shape, String flavor, int quantity,String message)
 {
		super(shape, flavor, quantity);
		this.message=message;
		
 }

 @Override
 public String toString()
 {
	 if(message!=null)
	return "A "+this.getShape()+"  "+this.getFlavor()+" Cake of "+this.getQuantity()+" is Ready with "+this.message+" message @ Rs."+getQuantity()*getPrice();
	 
	 else
		 return super.toString();
 }

 
 
 
}
