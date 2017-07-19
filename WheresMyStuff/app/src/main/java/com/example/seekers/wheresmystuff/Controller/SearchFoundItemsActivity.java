package com.example.seekers.wheresmystuff.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.seekers.wheresmystuff.Model.FoundItem;
import com.example.seekers.wheresmystuff.R;

import java.util.ArrayList;

/**
 * A controller class to search through a list of found items.
 */
public class SearchFoundItemsActivity extends AppCompatActivity {

    private EditText name;
    private EditText color;
    private EditText description;
    private EditText address;
    public static ArrayList<FoundItem> foundSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_found_items);

        Button search = (Button) findViewById(R.id.searchButtonFound);
        Button back = (Button) findViewById(R.id.searchBackButtonFound);
        name = (EditText) findViewById(R.id.enterFoundNameSearch);
        color = (EditText) findViewById(R.id.enterFoundColorSearch);
        description = (EditText) findViewById(R.id.enterFoundDescriptionSearch);
        address = (EditText) findViewById(R.id.searchEnterAddressFound);
        foundSearch = new ArrayList<>();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
                String itemColor = color.getText().toString();
                String itemDescription = description.getText().toString();
                String itemAddress = address.getText().toString();
                ArrayList<FoundItem> temp = WelcomeScreenActivity.foundItemList.getFoundItemList();
                searchItem(temp, itemName, itemColor, itemDescription, itemAddress);
                Intent intent = new Intent(SearchFoundItemsActivity.this, ViewSearchFoundItemsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });
    }

    /**
     *
     * @param temp the list of found items that are being searched through
     * @param name the name of the item being searched
     * @param color the color of the item being searched
     * @param description the description of the item being searched
     * @param address the address/location of the item being searched
     * @return true if an item is has been found and false if no item was found
     */
    public static boolean searchItem(ArrayList<FoundItem> temp, String name, String color, String description, String address) {
        for (int i = 0; i < temp.size(); i++) {
            if (name.equals(temp.get(i).getName())) {
                if (!foundSearch.contains(temp.get(i))) {
                    foundSearch.add(temp.get(i));
                }
            }
            if (color.equals(temp.get(i).getColor())) {
                if (!foundSearch.contains(temp.get(i))) {
                    foundSearch.add(temp.get(i));
                }
            }
            if (description.equals(temp.get(i).getDescription())) {
                if (!foundSearch.contains(temp.get(i))) {
                    foundSearch.add(temp.get(i));
                }
            }
            if (address.equals(temp.get(i).getAddress())) {
                if (!foundSearch.contains(temp.get(i))) {
                    foundSearch.add(temp.get(i));
                }
            }
        }
        return foundSearch != null;
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
