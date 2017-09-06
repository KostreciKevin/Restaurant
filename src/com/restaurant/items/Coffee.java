package com.restaurant.items;

import java.util.Objects;

public class Coffee extends HotDrinks{

	private String name;
	private double cost;
	private int quantity;
	
	public Coffee() {
		this("Coffee", 2.35);
	}
	
	public Coffee(String name, double cost) {
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

        if (obj != null && obj instanceof Coffee)
        {
            same = this.name == ((Coffee) obj).name;
        }

        return same;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
