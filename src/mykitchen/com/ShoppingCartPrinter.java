package mykitchen.com;
import java.util.Scanner;

public class ShoppingCartPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner scnr = new Scanner(System.in); // New Scanner Object
     String itemName;
     int itemPrice;
     int itemQuantity;
     
     // 2 ItemToPurchase Objects
     ItemToPurchase item1 = new ItemToPurchase();
     ItemToPurchase item2 = new ItemToPurchase();
     
     
     // User Input for Item 1
     System.out.println("Item 1");
     System.out.println("Enter the item Name: ");	
     itemName = scnr.nextLine();
     System.out.println("Enter the item Price: ");
     itemPrice = scnr.nextInt();
     System.out.println("Enter the item quantity: ");
     itemQuantity = scnr.nextInt(); 
     
     // Qualified Methods for item1   
     item1.setName(itemName);
     item1.setPrice(itemPrice);
     item1.setQuantity(itemQuantity);
   
     System.out.println("");
     scnr.nextLine();
     
     // User Input for Item 2
     System.out.println("Item 2");
     System.out.println("Enter the item Name: ");
     itemName = scnr.nextLine();
     System.out.println("Enter the item Price: ");
     itemPrice = scnr.nextInt();
     System.out.println("Enter the item quantity: ");
     itemQuantity = scnr.nextInt(); 
     
     // Qualified Methods for item2 
     item2.setName(itemName);
     item2.setPrice(itemPrice);
     item2.setQuantity(itemQuantity);
     
     // Print Total Cost
     System.out.println("");
     System.out.println("TOTAL COST");
     System.out.println(ItemToPurchase.printTotalCostItem1(item1));
     System.out.println(ItemToPurchase.printTotalCostItem2(item2));
     System.out.println("");
     System.out.println("Total: $" + ItemToPurchase.getTotalCost(item1, item2));
     
     scnr.close();
	}
}
