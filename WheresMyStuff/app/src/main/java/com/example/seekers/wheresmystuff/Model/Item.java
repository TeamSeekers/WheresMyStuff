package com.example.seekers.wheresmystuff.Model;

/**
 * Created by pritshah on 6/24/17.
 */

/**
 * A class that represents an item that has been lost or found.
 */
public abstract class Item {
    /**
     * Getter for name variable
     *
     * @return returns name of item
     */
    public abstract String getName();

    /**
     * Getter for color variable
     *
     * @return returns the name of the color
     */
    public abstract String getColor();

    /**
     * Getter for description variable
     *
     * @return the description
     */
    public abstract String getDescription();

    /**
     * Getter for address variable
     *
     * @return the address
     */
    public abstract String getAddress();

    /**
     * Overrides the toString method
     *
     * @return a string that properly describes the item
     */
    public abstract String toString();
}
