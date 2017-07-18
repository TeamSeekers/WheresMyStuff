package com.example.seekers.wheresmystuff.Model;

/**
 * Created by Luke on 7/13/2017.
 */

public class Analytics {
    private int totalRecieved;

    public Analytics() {
        totalRecieved = 0;
    }
    /**
     * add to number to total recieved items
     */
    public void addTotal() {
        totalRecieved++;
    }

    /**
     * get number of recieved items to date
     * @return current tall of items
     */
    public int getTotalRecieved() {
        return totalRecieved;
    }

}
