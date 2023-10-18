package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {

        ArrayList<Product> inventory = getInventory();

        inventory.add(new Product(1,"Banana", 2.56f));
        inventory.add(new Product(2, "kiwi", 5.50f));
        inventory.add(new Product(3, "eggPlant", 3.50f));
        inventory.add(new Product(4, "apple", 6.50f));
        inventory.add(new Product(2, "orange", 1.50f));

        Collections.sort(inventory, (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d %s - Price: $%.2f",
                    p.getId(), p.getName(), p.getPrice());
        }
    }
    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<Product>();

        return inventory;
    }
}
