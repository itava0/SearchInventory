package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) throws IOException {

        ArrayList<Product> inventory = getInventory();
        BufferedReader readFile = new BufferedReader(new FileReader("src/main/resources/inventory.csv"));
        String input = "";
        int productID = 0;
        String productName = "";
        float productPrice;

        while((input = readFile.readLine()) != null){
            String[] temp = input.split("\\|");
            productName = temp[1];
            productPrice = Float.parseFloat(temp[2]);
            productID = Integer.parseInt(temp[0]);
            inventory.add(new Product(productID, productName, productPrice));
        }
        readFile.close();

        inventory.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        return inventory;
    }
}
