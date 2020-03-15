package mykitchen.com;

import java.util.ArrayList;

public class ShoppingCart {

	private String customerName;
	private String currentDate;
	
    private ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();
	final int LIST_SIZE = 5;
	
	// ShoppingCart constructor.
	public ShoppingCart() {
		customerName = "none";
		currentDate = "January 1, 2020";
	}
	
	// Set method for customer name.
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	// Set method for current date.
	public void setCurrentDate(String currentDate) {
		this.currentDate = currentDate;
	}
	
	// Get method to return customer name.
	public String getCustomerName() {
		return customerName;
	}
	
	// Get method to return current date.
	public String getCurrentDate() {
		return currentDate;
	}
	
	// Method to add items to cartItems array.
	public void addItems(ItemToPurchase item) {
		int i;
		for (i = 0; i < LIST_SIZE; i++) {
			cartItems.add(item);
		}	
	}
	
	// Method to remove items from cartItems array.
	public void removeItems(ItemToPurchase itemName) {
		if (cartItems.contains(itemName)) {
			cartItems.remove(itemName);
		}
		else if (!cartItems.contains(itemName)) {
			System.out.println("Item not found in cart. Nothing Modified");
		}
	}
	
	// Method to modify items within cartItems array.
	public void modifyItems(ItemToPurchase item, ItemToPurchase itemName) {
		boolean itemFound = false;
		if (cartItems.contains(itemName)) {
			itemFound = true;
		}
		if (!itemFound == false) {
			if (item.getDescription().equals("none")) {
				ItemToPurchase.printItemDescription(item);
			}
			if (item.getItemPrice() != 0) {
				item.setPrice(item.getItemPrice());
			}
			if (item.getQuantity() != 0) {
				item.setQuantity(item.getQuantity());
			}
		}
		if (itemFound == false) {
			System.out.println("Item not found in cart. Nothing modified.");
		}
	  }
	
	// Method to get the total number of items within cartItems.
	public int getNumItemsInCart() {
		int totalQuantity = 0;
		if (cartItems != null) {
			for (ItemToPurchase item : cartItems) {
				totalQuantity += item.getQuantity();
			}
		}
		return totalQuantity;
	}
	
	// Determines the total cost of all items within the cart.
	public int getCostOfCart() {
		int costOfCart = 0;
		for (ItemToPurchase item : cartItems) {
			costOfCart = item.getItemPrice() * item.getQuantity();
		}
		return costOfCart;
	}
	
	// Prints total cost of items in cart.
	public void printTotal() {
		int total = 0;
		for (ItemToPurchase item : cartItems) {
			total = item.getItemPrice() * item.getQuantity();
		}
		System.out.println(customerName + " " + "'s Shopping Cart - " + currentDate);
		System.out.println("Number of Items in Cart: " + getNumItemsInCart());
		System.out.println("\n");
		for (ItemToPurchase item : cartItems) {
			System.out.println(item.getItemPrice() + " " + item.getQuantity() + " " + " @ $" + item.getItemPrice() + " " + item.getTotalItemCost(item));
		}
		System.out.println("\n");
		System.out.println("Total: " + total);
	  }
	
	// Prints description of a item.
	public void printDescriptions() {
		System.out.println(customerName + " " + "'s Shopping Cart - " + currentDate);
		System.out.println("\n");
		System.out.println("Item Descriptions");
		for (ItemToPurchase item : cartItems) {
			System.out.println(ItemToPurchase.printItemDescription(item));
		}
		if (cartItems.isEmpty()) {
			System.out.println("SHOPPING CART IS EMPTY");
		}
	}
}


