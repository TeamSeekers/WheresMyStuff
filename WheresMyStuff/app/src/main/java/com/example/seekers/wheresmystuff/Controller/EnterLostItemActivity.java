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
    private Button cancelEnter;
    private Button enterFoundItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_lost_item);
        enterNameOfItem = (EditText) findViewById(R.id.enterNameOfItem);
        enterColorOfItem = (EditText) findViewById(R.id.enterLostColor);
        enterDescriptionOfItem = (EditText) findViewById(R.id.enterLostItemDescription);
        cancelEnter = (Button) findViewById(R.id.cancelEnterItem);
        enterFoundItem = (Button) findViewById(R.id.enterLostItemButton);
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
                if (enterNameOfItem.getText().toString().isEmpty()) {
                    AlertDialog.Builder builder1 = new AlertDialog.Builder(EnterLostItemActivity.this);
                    builder1.setMessage("The lost item must at least have a name. Try again.");
                    builder1.setCancelable(true);
                    AlertDialog alert11 = builder1.create();
                    alert11.show();
                } else {
                    String name = enterNameOfItem.getText().toString();
                    String color = enterColorOfItem.getText().toString();
                    String description = enterDescriptionOfItem.getText().toString();
                    String address = enterAddressOfItem.getText().toString();
                    LostItem newLostItem = new LostItem(name, color, description, address);
                    WelcomeScreenActivity.lostItemList.getLostItemList().add(newLostItem);
                    WelcomeScreenActivity.myRef.child("LostItems").child(name + " : " + description).setValue(newLostItem);
                    finish();
                    overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
