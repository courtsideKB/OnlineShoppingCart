package mykitchen.com;

public class ItemToPurchase {
	
	private static String printTotalCost; 
	private static String printItemDescription;
	private static int itemPrice; 
	private String itemDescription; 
	private String itemName; 
	private static int itemQuantity; 
	
	// ItemToPurchase Constructor
	public ItemToPurchase() {
		itemName = "none"; 
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	}
	
	// Parameterized Constructor
    public ItemToPurchase(String itemName, String itemDescription, int itemPrice, int itemQuantity) {
		itemName = "none";
		itemDescription = "none";
		itemPrice = 0;
		itemQuantity = 0;
	} 
		
	// Set method for itemName 
	public void setName(String itemName) {
	 this.itemName = itemName;
	}
	
	// Set method for itemPrice
	public void setPrice(int itemPrice) { 
		ItemToPurchase.itemPrice = itemPrice;
	}
	
	// Set method for itemQuantity 
	public void setQuantity(int itemQuantity) { 
		ItemToPurchase.itemQuantity = itemQuantity;
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
	public static int getItemPrice() {
		return itemPrice;
	}
	
	// Getter method for itemQuantity
	public static int getQuantity() { 
		return itemQuantity; 
	}
	
	// Getter method for getDescription
	public String getDescription() {
		return itemDescription;
	}
	
	// Getter method for totalItemCost
	public static int getTotalItemCost(ItemToPurchase item) {
	    return ItemToPurchase.getItemPrice() * ItemToPurchase.getQuantity();
	}
	
	// Getter method for totalCost
	public static int getTotalCost(ItemToPurchase item1, ItemToPurchase item2) {
		return (ItemToPurchase.getItemPrice() * ItemToPurchase.getQuantity()) + (ItemToPurchase.getItemPrice() * ItemToPurchase.getQuantity());
	}
	// Print method for Item1
	public static String printTotalCostItem1(ItemToPurchase item1) {
	    printTotalCost = (item1.getName() + " " + ItemToPurchase.getQuantity() + " @ $" + ItemToPurchase.getItemPrice() + " = $" + ItemToPurchase.getTotalItemCost(item1));
		return printTotalCost;
	}
	// Print method for Item2
	public static String printTotalCostItem2(ItemToPurchase item2) {
	   printTotalCost = (item2.getName() + " " + ItemToPurchase.getQuantity() + " @ $" + ItemToPurchase.getItemPrice() + " = $" + ItemToPurchase.getTotalItemCost(item2));
	   return printTotalCost;
	}
	// Item Description print method for item1 
	public static String printItemDescription(ItemToPurchase item) {
		printItemDescription = (item.getName() + ": " + item.getDescription());
		return printItemDescription;
	}
}


