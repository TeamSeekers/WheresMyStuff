package com.example.seekers.wheresmystuff;

/**
 * Created by marcu on 7/18/2017.
 */

import com.example.seekers.wheresmystuff.Controller.SearchFoundItemsActivity;

import com.example.seekers.wheresmystuff.Model.FoundItemList;
import com.example.seekers.wheresmystuff.Model.FoundItem;


import org.junit.Test;
import static org.junit.Assert.*;

public class MarcusJonesUnitTest {
    @Test
    public void testSearchItem() {
        FoundItem item = new FoundItem("Iphone", "Black", "Apple Iphone", "Some Location");
        FoundItemList list = null;
        list.getFoundItemList().add(item);
        assertTrue(SearchFoundItemsActivity.searchItem("Iphone", "Black",
                "Apple Iphone", "SomeLocation"));
        assertFalse(SearchFoundItemsActivity.searchItem("Android", "White",
                "Samsung Android", "AnotherLocation"));
    }


}
