package com.restaurant.orders;

import java.util.ArrayList;

public class PayBill {
	
	public PayBill() {
		
	}
	
	//returns the cost of the order placed
	public double payableAmount(PlaceOrder placeOrder) {
		double bill = 0.00;
		ArrayList<Order> ordersGiven = placeOrder.getOrder();
		for(Order item : ordersGiven) {
			bill += item.price();
		}
		
		return bill;
	}
}
