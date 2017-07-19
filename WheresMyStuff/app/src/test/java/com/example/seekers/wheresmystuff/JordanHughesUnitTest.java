package com.example.seekers.wheresmystuff;

/**
 * Created by Jordan Hughes on 7/18/2017.
 */

import com.example.seekers.wheresmystuff.Controller.EnterLostItemActivity;
import com.example.seekers.wheresmystuff.Controller.WelcomeScreenActivity;
import com.example.seekers.wheresmystuff.Model.Item;
import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.Model.LostItemList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;


public class JordanHughesUnitTest {
    @Test
    public void testAddLostItem(){
        /*
         *Create five items. Expect the adding of a lost item to fail only if it has no name field
         */

        LostItem item1 = new LostItem("Samsung Galaxy s8","Black", "Phone","North Ave NW, Atlanta, GA 30332");
        LostItem item2 = new LostItem("Samsung Galaxy s7","", "Phone","North Ave NW, Atlanta, GA 30332");
        LostItem item3 = new LostItem("Samsung Galaxy s6","Black", "","North Ave NW, Atlanta, GA 30332");
        LostItem item4 = new LostItem("Samsung Galaxy s5","Black", "Phone","");
        LostItem item5 = new LostItem("","Black", "Phone","North Ave NW, Atlanta, GA 30332");
        WelcomeScreenActivity.lostItemList=new LostItemList();
        int size = WelcomeScreenActivity.lostItemList.getLostItemList().size();
        assertTrue(EnterLostItemActivity.addLostItem(item1.getName(),item1.getColor(),
                item1.getDescription(),item1.getAddress()));
        size++;
        assertTrue(EnterLostItemActivity.addLostItem(item2.getName(),item2.getColor(),
                item2.getDescription(),item2.getAddress()));
        size++;
        assertTrue(EnterLostItemActivity.addLostItem(item3.getName(),item3.getColor(),
                item3.getDescription(),item3.getAddress()));
        size++;
        assertTrue(EnterLostItemActivity.addLostItem(item4.getName(),item4.getColor(),
                item4.getDescription(),item4.getAddress()));
        size++;
        assertFalse(EnterLostItemActivity.addLostItem(item5.getName(),item5.getColor(),
                item5.getDescription(),item5.getAddress()));


/*
 *Want to make sure that as we add all of the objects that the number of items is what it should be
 */
        assertEquals(size, WelcomeScreenActivity.lostItemList.getLostItemList().size());
/*
*Also want to make sure that items are added to the end of the list
 */
        assertEquals(item4, WelcomeScreenActivity.lostItemList.getLostItemList().get(size-1));
    }
}
