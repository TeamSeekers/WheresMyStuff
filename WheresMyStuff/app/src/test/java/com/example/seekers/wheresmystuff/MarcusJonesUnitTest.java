package com.example.seekers.wheresmystuff;

import com.example.seekers.wheresmystuff.Controller.SearchFoundItemsActivity;

import com.example.seekers.wheresmystuff.Model.FoundItemList;
import com.example.seekers.wheresmystuff.Model.FoundItem;


import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MarcusJonesUnitTest {
    @Test
    public void testSearchItem() {
        FoundItem item = new FoundItem("Iphone", "Black", "Apple Iphone", "Some Location");
        FoundItemList list1 = new FoundItemList();
        ArrayList<FoundItem> list2 = list1.getFoundItemList();
        list2.add(item);
        assertTrue(SearchFoundItemsActivity.searchItem(list2, "Iphone", "Black",
                "Apple Iphone", "SomeLocation"));
        assertFalse(SearchFoundItemsActivity.searchItem(list2, "Android", "White",
                "Samsung Android", "AnotherLocation"));
    }


}
