package com.restaurant.items;

import com.restaurant.items.container.*;

public class ColdDrinks implements Item{

	private Category category;
	
	public ColdDrinks() {
		this(Category.DRINKS);
	}
	
	public ColdDrinks(Category category) {
		this.category = category;
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		return new Glass();
	};
	

	@Override
	public int getQuantity() {
		return 0;
	}

	@Override
	public void setQuantity(int quantity) {}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public double getCost() {
		return 0;
	}
}
