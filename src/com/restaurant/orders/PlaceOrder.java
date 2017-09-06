package com.restaurant.orders;

import com.restaurant.items.*;
import com.restaurant.menu.*;
import com.restaurant.items.vegitems.*;
import com.restaurant.items.nonvegitems.*;

import java.util.ArrayList;

public class PlaceOrder {

	private ArrayList<Order> orders;
	private ArrayList<Item> availableItems;
	
	public PlaceOrder() {
		this(null);
	}
	
	public PlaceOrder(Menu menu) {
		
		this.orders = new ArrayList<>();
		this.availableItems = new ArrayList<>(menu.getItems());
	}
	
	public void orderItem(String item, int quantity) {
		Item newItem;
		
		if (item.equals("Coffee")) {
			newItem = new Coffee();
		} else if (item.equals("Tea")) {
			newItem = new Tea();
		} else if (item.equals("Juice")) {
			newItem = new Juices();
		} else if (item.equals("VegSandwich")) {
			newItem = new VegSandwich();
		} else if (item.equals("NonVegSandwich")) {
			newItem = new NonVegSandwich();
		} else {
			newItem = null;
		}
		
		//if the requested item is an available item, the order can be placed
		//otherwise, an error message is returned
		if (availableItems.contains(newItem)) {

			Order order = new Order(newItem, quantity);
			orders.add(order);
			System.out.println(order.toString());
		}
		else {
			System.out.println(item + " is not in the menu.");
		}
	}
	
	public ArrayList<Order> getOrder(){
		return orders;
	}
}
