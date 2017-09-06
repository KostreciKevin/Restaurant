package com.restaurant.orders;

import com.restaurant.items.*;

public class Order {

	private String name;
	private int quantity;
	
	private Item myItem;
	
	public Order() {
		this(null, 0);
	}
	
	public Order(Item item, int quantity) {
		
		this.quantity = quantity;
		this.name = item.getName();
		this.myItem = item;
	}

	//Display name and quantity of the ordered item
	@Override
	public String toString() {
		
		return name + "\t" + quantity;
	}
	
	//returns cost for the quantity of items ordered
	public double price() {
		return myItem.getCost()*this.quantity;
	}	
}
