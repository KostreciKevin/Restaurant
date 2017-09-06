package com.restaurant.items;

import java.util.Objects;

public class Tea extends HotDrinks{

	private String name;
	private double cost;
	private int quantity;
	
	public Tea() {
		this("Tea", 2.40);
	}
	
	public Tea(String name, double cost) {
		this.name = name;
		this.cost = cost;
	}
	@Override
	public int getQuantity() {
		return quantity;
	}

	@Override
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getCost() {
		return cost;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean same = false;

        if (obj != null && obj instanceof Tea)
        {
            same = this.name == ((Tea) obj).name;
        }

        return same;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
