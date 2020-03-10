package mykitchen.com;
import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scnr = new Scanner(System.in); // New Scanner Object
     String itemName;
     String itemDescription;
     String itemToView;
     String yn;
     int itemPrice;
     int itemQuantity;
     
     // 2 ItemToPurchase Objects
     ItemToPurchase item1 = new ItemToPurchase();
     ItemToPurchase item2 = new ItemToPurchase();
     
     
     // User Input for Item 1
     System.out.println("Item 1");
     System.out.println("Enter the item Name: ");	
     itemName = scnr.nextLine();
     System.out.println("Enter item description: ");
     itemDescription = scnr.nextLine();
     System.out.println("Enter the item Price: ");
     itemPrice = scnr.nextInt();
     System.out.println("Enter the item quantity: ");
     itemQuantity = scnr.nextInt(); 
     
     // Qualified Methods for item1   
     item1.setName(itemName);
     item1.setPrice(itemPrice);
     item1.setQuantity(itemQuantity);
     item1.setDescription(itemDescription);
   
     System.out.println("");
     scnr.nextLine();
     
     // User Input for Item 2
     System.out.println("Item 2");
     System.out.println("Enter the item Name: ");
     itemName = scnr.nextLine();
     System.out.println("Enter item description: ");
     itemDescription = scnr.nextLine();
     System.out.println("Enter the item Price: ");
     itemPrice = scnr.nextInt();
     System.out.println("Enter the item quantity: ");
     itemQuantity = scnr.nextInt(); 
     scnr.nextLine();
     
     // Qualified Methods for item2 
     item2.setName(itemName);
     item2.setPrice(itemPrice);
     item2.setQuantity(itemQuantity);
     item2.setDescription(itemDescription);
     
     // Print Total Cost
     System.out.println("");
     System.out.println("TOTAL COST");
     System.out.println(ItemToPurchase.printTotalCostItem1(item1));
     System.out.println(ItemToPurchase.printTotalCostItem2(item2));
     System.out.println("");
     System.out.println("Total: $" + ItemToPurchase.getTotalCost(item1, item2));
     
     System.out.println("Would you like to view a items description? (yes/no)");
     yn = scnr.nextLine();
     if (yn.contains("yes")) {
    	System.out.println("Which item description would you like to view?");
        itemToView = scnr.next();
    	
    	if (itemToView.contains(item1.getName())) {
    		System.out.println(ItemToPurchase.printItemDescription(item1));
    	}
    	else if (itemToView.contains(item2.getName())) {
    		System.out.println(ItemToPurchase.printItemDescription(item2));
    	}
     }
     
     
     scnr.close();
	}
}
