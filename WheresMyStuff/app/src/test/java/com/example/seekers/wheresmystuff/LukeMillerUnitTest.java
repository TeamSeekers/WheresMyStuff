package com.example.seekers.wheresmystuff;

import com.example.seekers.wheresmystuff.Controller.EnterLostItemActivity;
import com.example.seekers.wheresmystuff.Controller.WelcomeScreenActivity;
import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.Model.LostItemList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Luke on 7/18/2017.
 */

public class LukeMillerUnitTest {
        @Test
        public void testAddFoundItem() {
            LostItem item1 = new LostItem("", "Black", "iPhone5s", "930 Spring Street NW, Atlanta GA");
            LostItem item2 = new LostItem("Backpack", "Blue", "", "0");
            LostItem item3 = new LostItem("Test Item", "Blue", "Test Item Description", "");

            WelcomeScreenActivity.lostItemList = new LostItemList();
            assertTrue(EnterLostItemActivity.addLostItem(
                    item2.getName(), item2.getColor(),
                    item2.getDescription(), item2.getAddress()));
            assertFalse(EnterLostItemActivity.addLostItem(
                    item1.getName(), item1.getColor(),
                    item1.getDescription(), item1.getAddress()));
            WelcomeScreenActivity.lostItemList.getLostItemList().add(item3);
            WelcomeScreenActivity.lostItemList.getLostItemList().add(item1);
            assertEquals(WelcomeScreenActivity.lostItemList.getLostItemList().get(
                    WelcomeScreenActivity.lostItemList.getLostItemList().size() - 1), item3);
        }
}
