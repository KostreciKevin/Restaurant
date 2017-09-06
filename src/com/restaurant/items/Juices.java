package com.restaurant.items;

import java.util.Objects;

public class Juices extends ColdDrinks {

	private String name;
	private double cost;
	private int quantity;
	
	public Juices() {
		this("Juice", 1.95);
	}
	
	public Juices(String name, double cost) {
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

        if (obj != null && obj instanceof Juices)
        {
            same = this.name == ((Juices) obj).name;
        }

        return same;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
}
