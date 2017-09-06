package com.restaurant.items.vegitems;

import java.util.Objects;
import com.restaurant.items.Sandwich;

public class VegSandwich extends Sandwich{

	private String name;
	private double cost;
	private int quantity;
	
	public VegSandwich() {
		this("VegSandwich", 3.95);
	}
	
	public VegSandwich(String name, double cost) {
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

        if (obj != null && obj instanceof VegSandwich)
        {
            same = this.name == ((VegSandwich) obj).name;
        }

        return same;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
