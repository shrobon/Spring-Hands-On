package com.shrobon.spring.Asst4;

public class ShoppingCart {
	private Item it;

	@Override
	public String toString() {
		return "ShoppingCart [it=" + getIt() + "]";
	}

	public Item getIt() {
		return it;
	}

	public void setIt(Item it) {
		this.it = it;
	}
	
	
}
