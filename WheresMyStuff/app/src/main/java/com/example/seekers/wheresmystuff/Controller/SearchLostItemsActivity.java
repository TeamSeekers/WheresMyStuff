package com.example.seekers.wheresmystuff.Controller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

/**
 * A controller class to search through a list of lost items.
 */
public class SearchLostItemsActivity extends AppCompatActivity {

    private EditText name;
    private EditText color;
    private EditText description;
    private EditText address;
    public static ArrayList<LostItem> lostSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_lost_items);

        Button search = (Button) findViewById(R.id.searchButtonLost);
        Button back = (Button) findViewById(R.id.searchBackButtonLost);
        name = (EditText) findViewById(R.id.enterNameSearch);
        color = (EditText) findViewById(R.id.enterColorSearch);
        description = (EditText) findViewById(R.id.enterDescriptionSearch);
        address = (EditText) findViewById(R.id.searchEnterAddressLost);
        lostSearch = new ArrayList<>();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }
        });

        WelcomeScreenActivity.myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                WelcomeScreenActivity.lostItemList.getLostItemList().clear();
                DataSnapshot lostItems = dataSnapshot.child("LostItems");
                Iterable<DataSnapshot> lostChildren = lostItems.getChildren();
                for (DataSnapshot lost: lostChildren) {
                    LostItem l = lost.getValue(LostItem.class);
                    if (l != null) {
                        WelcomeScreenActivity.lostItemList.getLostItemList().add(l);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName = name.getText().toString();
                String itemColor = color.getText().toString();
                String itemDescription = description.getText().toString();
                String itemAddress = address.getText().toString();
                ArrayList<LostItem> temp = WelcomeScreenActivity.lostItemList.getLostItemList();
                for (int i = 0; i < temp.size(); i++) {
                    if (itemName.equals(temp.get(i).getName()) && !itemName.equals("")) {
                        if (!lostSearch.contains(temp.get(i))) {
                            lostSearch.add(temp.get(i));
                        }
                    }
                    if (itemColor.equals(temp.get(i).getColor()) && !itemColor.equals("")) {
                        if (!lostSearch.contains(temp.get(i))) {
                            lostSearch.add(temp.get(i));
                        }
                    }
                    if (itemDescription.equals(temp.get(i).getDescription()) && !itemDescription.equals("")) {
                        if (!lostSearch.contains(temp.get(i))) {
                            lostSearch.add(temp.get(i));
                        }
                    }
                    if (itemAddress.equals(temp.get(i).getAddress()) && !itemAddress.equals("")) {
                        if (!lostSearch.contains(temp.get(i))) {
                            lostSearch.add(temp.get(i));
                        }
                    }
                }
                Intent intent = new Intent(SearchLostItemsActivity.this, ViewSearchLostItemsActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
