package TestRestoran;

import java.util.*;

public class RestoranMain {
public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); //line to take user input
		
		Restoran menu = new Restoran(); //create object from restaurant(class)
		
		//Input food menu
		System.out.println("MAIN MENU");
		menu.tambahMenuMakanan("Bala-Bala", 1_000, 1);
		Restoran.nextId();
		menu.tambahMenuMakanan("Gehu", 2_000, 2);
		Restoran.nextId();
		menu.tambahMenuMakanan("Cireng", 3_000, 3);
		Restoran.nextId();
		
		
		
		boolean takeOrder = true; //variable regarding the order status of the user
		double price = 0; //varible to sum up the price the user need to pay as a payment
		while (takeOrder == true){ //looping until the user stop ordering the menu
			menu.tampilMenuMakanan(); //show the list of food, food's stock, and price
			System.out.println("---------------------");
			System.out.println("Place your order here");
			System.out.print("Menu number: ");
			int idx = scan.nextInt(); //take user input regarding what food the user want to buy
			
			System.out.print("Quantity: "); 
			int qty = scan.nextInt(); //take user input regarding how much of it the user want to buy
			if (menu.isOutOfStock(idx-1, qty)) { //if the food is available (stock ready)
				System.out.println("Please adjust your order according to our available menu and stock\n");
				continue;
			}
			else
				menu.reduceStock(idx-1, qty); //if the user buy a food, it reduces the food stock 
					
			price = price + (menu.getHarga(idx-1)*qty); //sum up the price of all the order user have made
			System.out.print("The total amount you have to pay: " + price + "\n");
			
			//looping to order next food
			System.out.print("Do you want to order another food?(Yes/No)");
			String orderStatus = scan.next(); //take input, user want another food to buy?
			if (orderStatus.compareToIgnoreCase("yes") == 0)
				takeOrder = true;
			else 
				takeOrder = false;
			}
	}
}
