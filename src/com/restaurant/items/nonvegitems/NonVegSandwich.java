package com.restaurant.items.nonvegitems;

import java.util.Objects;
import com.restaurant.items.Sandwich;;

public class NonVegSandwich extends Sandwich{

	private String name;
	private double cost;
	private int quantity;
	
	public NonVegSandwich() {
		this("NonVegSandwich", 3.50);
	}
	
	public NonVegSandwich(String name, double cost) {
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

        if (obj != null && obj instanceof NonVegSandwich)
        {
            same = this.name == ((NonVegSandwich) obj).name;
        }

        return same;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
