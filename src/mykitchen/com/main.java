package mykitchen.com;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter Customer's name: ");
		String customerName = scnr.nextLine();
		System.out.println("Enter Today's Date: ");
		String currentDate = scnr.nextLine(); 
		System.out.println("\n");
		System.out.println("Customer name: " + customerName);
		System.out.println("Today's Date: " + currentDate);
		
		
	}

}
