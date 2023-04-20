package edu;

public class restaurant {
    // create fast food restaurant attributes
    private String name;
    private String location;
    private int price;
    private double rating;

    // constructor that generates restaurant info
    public restaurant(String name, String location, double rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    // constructor that generates a random rating
    public static double randomRating() {
        double rating = Math.random() * 5;
        return rating;
    }

    // methods
    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public double getRating() {
        return rating;
    }

    public int getPrice() {
        return price;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // toString method
    public String toString() {
        return "Name: " + name + "\nLocation: " + location + "\nRating: " + rating;
    }
}
