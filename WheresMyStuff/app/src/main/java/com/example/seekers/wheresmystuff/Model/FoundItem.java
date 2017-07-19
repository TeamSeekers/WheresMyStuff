package com.example.seekers.wheresmystuff.Model;

/**
 * A class that represents an item that has been found.
 */
public class FoundItem extends Item {
    private String name;
    private String color;
    private String description;
    private String address;

    public FoundItem() {

    }

    /**
     * Constructor for FoundItem
     *
     * @param name the name of the FoundItem
     * @param color the color of the foundItem
     * @param description the description of the FoundItem
     */
    public FoundItem(String name, String color, String description, String address) {
        this.name = name;
        this.color = color;
        this.description = description;
        this.address = address;
    }

    /**
     * Getter for name variable
     *
     * @return returns name of item
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for color variable
     *
     * @return returns the name of the color
     */
    public String getColor() {
        return this.color;
    }

    /**
     * Getter for description variable
     *
     * @return the description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Getter for address variable
     *
     * @return the address
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Overrides the toString method
     *
     * @return a string that properly describes the item
     */
    public String toString() {
        return "Name: " + this.name + " Color: " + this.color + " Description: " + this.description;
    }
}
