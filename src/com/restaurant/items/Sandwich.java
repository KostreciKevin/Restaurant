package com.restaurant.items;

import com.restaurant.items.container.*;

public class Sandwich implements Item{

	private Category category;
	
	public Sandwich() {
		this(Category.SNACKS);
	}
	
	public Sandwich(Category category) {
		this.category = category;
	}

	@Override
	public Category getCategory() {
		return category;
	}

	@Override
	public Container getContainer() {
		 return new Wrapper();
	}

	@Override
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setQuantity(int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}
}
