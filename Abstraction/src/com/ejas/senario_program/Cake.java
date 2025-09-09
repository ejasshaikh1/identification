package com.ejas.senario_program;

public abstract class Cake 
{
 private String shape;
 private String flavor;
 private int quantity;
 private double price = 400;
 
 public Cake(String shape, String flavor, int quantity)
 {
	super();
	this.shape = shape;
	this.flavor = flavor;
	this.quantity = quantity;
 }
 
 public String getShape() 
 {
	return shape;
}

 public void setShape(String shape) 
 {
	this.shape = shape;
 }

 public String getFlavor()
 {
	return flavor;
 }

 public void setFlavor(String flavor) 
 {
	this.flavor = flavor;
 }

 public int getQuantity() 
 {
	return quantity;
 }

 public void setQuantity(int quantity) 
 {
	this.quantity = quantity;
 }

 public double getPrice()
 {
	return price;
 }

 public void setPrice(double price)
 {
	this.price = price;
 }

 @Override
 public String toString() 
 {
	 double totalPrice=quantity*price;
	return "A "+this.getShape()+" "+this.getFlavor()+" Cake of "+this.getQuantity()+" KG is Ready @ "+ totalPrice;
 }
 
}
