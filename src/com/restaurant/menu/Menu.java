package com.restaurant.menu;

import java.util.ArrayList;

import com.restaurant.items.*;

public class Menu {
	ArrayList<Item> items;
	
	public Menu() {
		this.items = new ArrayList<>();
	}

	public void addItem(Item item) {
		items.add(item);
	}
	
	public void displayItems() {
		for(Item its: items) {
			System.out.println(its.getName());
		}
	}
	
	public ArrayList<Item> getItems() {
		return items;
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
}
