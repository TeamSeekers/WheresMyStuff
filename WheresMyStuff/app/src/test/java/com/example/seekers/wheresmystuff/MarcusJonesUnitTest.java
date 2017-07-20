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
        FoundItemList list = new FoundItemList();
        ArrayList<FoundItem> foundSearch = new ArrayList<>();
        list.getFoundItemList().add(item);
        assertTrue(SearchFoundItemsActivity.searchItem(list.getFoundItemList(), "Iphone", "Black",
                "Apple Iphone", "SomeLocation", foundSearch));
    }


}
