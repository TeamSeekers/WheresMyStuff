package com.example.seekers.wheresmystuff.Model;

import java.util.ArrayList;

/**
 * Created by pritshah on 6/22/17.
 */

/**
 * The class that represents a list of lost items.
 */
public class LostItemList {
    private ArrayList<LostItem> lostItemList;

    /**
     * Constructor for LostItemList
     */
    public LostItemList() {
        lostItemList = new ArrayList<LostItem>();
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
