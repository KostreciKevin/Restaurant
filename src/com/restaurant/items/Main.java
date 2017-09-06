package com.restaurant.items;

import com.restaurant.menu.*;
import com.restaurant.orders.*;
import com.restaurant.items.vegitems.*;
import com.restaurant.items.nonvegitems.*;

// Testing some values for the Restaurant
public class Main {

	public static void main(String[] args) {
		Item newItem = new Coffee();
		Item newItem2 = new Juices();
		Item newItem3 = new Tea();
		Item newItem4 = new VegSandwich();
		Item newItem5 = new NonVegSandwich();
		
		Menu menu = new Menu();
		
		menu.addItem(newItem);
		menu.addItem(newItem2);
		menu.addItem(newItem3);
		menu.addItem(newItem4);
		menu.addItem(newItem5);
		
		menu.displayItems();
		
		PlaceOrder myOrder = new PlaceOrder(menu);
		
		myOrder.orderItem("Coffee", 2);
		myOrder.orderItem("Tea", 2);
		myOrder.orderItem("Juice", 1);
		myOrder.orderItem("VegSandwich", 3);
		
		PayBill bill = new PayBill();
		double myBill = bill.payableAmount(myOrder);
		
		System.out.println("\nTotal" + "\t" + myBill);
	}
}
