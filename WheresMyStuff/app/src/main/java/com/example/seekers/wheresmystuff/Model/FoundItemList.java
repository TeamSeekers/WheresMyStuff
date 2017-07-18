package com.example.seekers.wheresmystuff.Model;

import java.util.ArrayList;

/**
 * Created by pritshah on 6/24/17.
 */

/**
 * This class represents a list of Found items.
 */
public class FoundItemList {
    private ArrayList<FoundItem> foundItemList;

    /**
     * A constructor for the class
     */
    public FoundItemList() {
        foundItemList = new ArrayList<FoundItem>();
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
