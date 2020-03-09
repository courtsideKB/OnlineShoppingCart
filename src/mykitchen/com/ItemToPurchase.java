package mykitchen.com;

public class ItemToPurchase {
	
	private static String printTotalCost; 
	private String itemName; 
	private String itemDescription; 
	private int itemPrice; 
	private int itemQuantity; 
	
	// ItemToPurchase Constructor
	public ItemToPurchase() {
		itemName = "none"; 
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	// Parameterized Constructor
	/* public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
		itemName = "none";
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	} */
		
	// Set method for itemName 
	public void setName(String itemName) {
	 this.itemName = itemName;
	}
	
	// Set method for itemPrice
	public void setPrice(int itemPrice) { 
		this.itemPrice = itemPrice;
	}
	
	// Set method for itemQuantity 
	public void setQuantity(int itemQuantity) { 
		this.itemQuantity = itemQuantity;
	}
	
	// Set method to set Description
	public void setDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	
	// Getter method for itemName 
	public String getName() { 
		return itemName;
	}
	
	// Getter method for itemPrice
	public int getItemPrice() {
		return itemPrice;
	}
	
	// Getter method for itemQuantity
	public int getQuantity() { 
		return itemQuantity; 
	}
	
	// Get method for getDescription
	public String getDescription() {
		return itemDescription;
	}
	
	// Getter method for totalItemCost
	public int getTotalItemCost(ItemToPurchase item) {
	    return item.getItemPrice() * item.getQuantity();
	}
	
	// Getter method for totalCost
	public static int getTotalCost(ItemToPurchase item1, ItemToPurchase item2) {
		return (item1.getItemPrice() * item1.getQuantity()) + (item2.getItemPrice() * item2.getQuantity());
	}
	// Print method for Item1
	public static String printTotalCostItem1(ItemToPurchase item1) {
	    printTotalCost = (item1.getName() + " " + item1.getQuantity() + " @ $" + item1.getItemPrice() + " = $" + item1.getTotalItemCost(item1));
		return printTotalCost;
	}
	// Print method for Item2
	public static String printTotalCostItem2(ItemToPurchase item2) {
	   printTotalCost = (item2.getName() + " " + item2.getQuantity() + " @ $" + item2.getItemPrice() + " = $" + item2.getTotalItemCost(item2));
	   return printTotalCost;
	}
}


