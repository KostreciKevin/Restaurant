package com.restaurant.items;

import com.restaurant.items.container.*;

public interface Item{

	int getQuantity();
	void setQuantity(int quantity);
	String getName();
	Category getCategory();
	double getCost();
	Container getContainer();
}
