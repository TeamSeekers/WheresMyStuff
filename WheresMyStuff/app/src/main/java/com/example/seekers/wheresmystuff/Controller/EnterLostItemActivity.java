package com.example.seekers.wheresmystuff.Controller;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.R;

/**
 * This class represents the controller for the activity when someone
 * would like to submit a lost item claim.
 */
public class EnterLostItemActivity extends AppCompatActivity {

    private EditText enterNameOfItem;
    private EditText enterColorOfItem;
    private EditText enterDescriptionOfItem;
    private EditText enterAddressOfItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_lost_item);
        enterNameOfItem = (EditText) findViewById(R.id.enterNameOfItem);
        enterColorOfItem = (EditText) findViewById(R.id.enterLostColor);
        enterDescriptionOfItem = (EditText) findViewById(R.id.enterLostItemDescription);
        Button cancelEnter = (Button) findViewById(R.id.cancelEnterItem);
        Button enterFoundItem = (Button) findViewById(R.id.enterLostItemButton);
        enterAddressOfItem = (EditText) findViewById(R.id.enterAddressOfItemLost);

        cancelEnter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
            }
        });

        enterFoundItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = enterNameOfItem.getText().toString();
                String color = enterColorOfItem.getText().toString();
                String description = enterDescriptionOfItem.getText().toString();
                String address = enterAddressOfItem.getText().toString();

                if (addLostItem(name, color, description, address)) {
                    WelcomeScreenActivity.myRef.child("LostItems").child(name + " : " + description).setValue(
                            WelcomeScreenActivity.lostItemList.getLostItemList().get(
                                    WelcomeScreenActivity.lostItemList.getLostItemList().size() - 1));
                    finish();
                    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                } else {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(EnterLostItemActivity.this);
                    builder1.setMessage("The lost item must at least have a name. Please try again.");
                    builder1.setCancelable(true);
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                }
            }
        });
    }

    /**
     * Add lost item to database
     *
     * @param name Name of item
     * @param color Color of item
     * @param description Description of item
     * @param address Address item was found at
     * @return true if item can be added, false otherwise
     */
    public static boolean addLostItem(String name, String color, String description, String address) {
        if (name.isEmpty()) {
            return false;
        } else {
            LostItem newLostItem = new LostItem(name, color, description, address);
            WelcomeScreenActivity.lostItemList.getLostItemList().add(newLostItem);
            return true;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
