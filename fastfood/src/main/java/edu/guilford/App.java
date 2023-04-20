package edu.guilford;

import java.lang.reflect.Method;

import edu.restaurant;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        // Instantiate fast food restaurant objects
        restaurant mcdonalds = new restaurant("McDonalds", "123 Main St", 3.5);
        restaurant burgerKing = new restaurant("Burger King", "456 Main St", 4.0);
        restaurant wendys = new restaurant("Wendys", "789 Main St", 4.5);
        System.out.println("Wendy's Location: " + wendys.getLocation());

        System.out.println(wendys.toString());
    }

}
