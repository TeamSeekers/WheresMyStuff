package com.example.seekers.wheresmystuff.Model;

import java.util.ArrayList;

/**
 * The class that represents a list of lost items.
 */
public class LostItemList {
    private final ArrayList<LostItem> lostItemList;

    /**
     * Constructor for LostItemList
     */
    public LostItemList() {
        lostItemList = new ArrayList<>();
    }

    /**
     * Getter method for lostItemList
     *
     * @return an arraylist of the lost items.
     */
    public ArrayList<LostItem> getLostItemList() {
        return lostItemList;
    }
}
