package com.example.seekers.wheresmystuff.Model;

import java.util.ArrayList;

/**
 * This class represents a list of Found items.
 */
public class FoundItemList {
    private final ArrayList<FoundItem> foundItemList;

    /**
     * A constructor for the class
     */
    public FoundItemList() {
        foundItemList = new ArrayList<>();
    }

    /**
     * Getter for the foundItemlist
     *
     * @return the arraylist foundItemList
     */
    public ArrayList<FoundItem> getFoundItemList() {
        return foundItemList;
    }
}
