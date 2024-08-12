import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.ArrayList;
import Item.Item;

public class Main {
    public static void main(String[] args) {

        ArrayList items = new ArrayList();
        Scanner sc = new Scanner(System.in);
        double subTotal = 0;
        double tax = 0;
        double discount = 0;
        double finalTotal = 0;

        System.out.println("Welcome to the Supermarket Billing System");
        System.out.println("Enter the item details");


        while(true) {
            System.out.print("Enter item name: ");
            String itemName = sc.next();

            if(itemName.equalsIgnoreCase("exit")){
                break;
            }
            System.out.print("Enter item quantity: ");
            int itemQuantity = sc.nextInt();
            System.out.print("Enter item price: ");
            double itemPrice = sc.nextDouble();
            Item item = new Item(itemName,itemQuantity, itemPrice);
            items.add(item);
            subTotal += itemQuantity * itemPrice;

            System.out.println("Item: " + itemName + ", Quantity: " + itemQuantity + ", Price: $" + itemPrice);
        }

        System.out.print("Enter the tax rate(%): ");
        double taxRate = sc.nextDouble();
        tax = (taxRate * subTotal) / 100;
        System.out.print("Enter the discount amount($): ");
        discount = sc.nextDouble();

        finalTotal = subTotal + tax - discount;
        System.out.println("Subtotal: $" + subTotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Discount: $" + discount);
        System.out.println("Total: $" + finalTotal);
    }
}