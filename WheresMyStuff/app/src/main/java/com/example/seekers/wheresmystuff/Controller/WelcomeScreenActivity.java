package com.example.seekers.wheresmystuff.Controller;

import android.content.Intent;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.seekers.wheresmystuff.Model.Analytics;
import com.example.seekers.wheresmystuff.Model.User;
import com.example.seekers.wheresmystuff.Model.Admin;
import com.example.seekers.wheresmystuff.Model.FoundItem;
import com.example.seekers.wheresmystuff.Model.FoundItemList;
import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.Model.LostItemList;
import com.example.seekers.wheresmystuff.Model.PersonList;
import com.example.seekers.wheresmystuff.R;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.facebook.FacebookSdk;
import com.facebook.appevents.AppEventsLogger;
/**
 * A controller class that handles when the app is initiated.
 */
public class WelcomeScreenActivity extends AppCompatActivity {

    public static PersonList personList;
    public static LostItemList lostItemList;
    public static FoundItemList foundItemList;
    private static FirebaseDatabase database;
    public static DatabaseReference myRef;
    public static Analytics banner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        Button login = (Button) findViewById(R.id.login);
        final Button registration = (Button) findViewById(R.id.registration);
        personList = new PersonList();
        lostItemList = new LostItemList();
        foundItemList = new FoundItemList();
//        banner = (TextView) findViewById(R.id.activity_banner);
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();


        final LoginButton loginButton = (LoginButton) findViewById(R.id.login_button);
        loginButton.setReadPermissions("email");
        CallbackManager callbackManager = CallbackManager.Factory.create();
        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        Intent intent = new Intent(WelcomeScreenActivity.this, HomeScreenActivity.class);
                        startActivity(intent);
                        overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
                    }

                    @Override
                    public void onCancel() {
                        //do nothing just go back to welcome screen
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        AlertDialog.Builder builder1 = new AlertDialog.Builder(WelcomeScreenActivity.this);
                        builder1.setMessage("Facebook login error");
                        builder1.setCancelable(true);
                        AlertDialog alert11 = builder1.create();
                        alert11.show();
                    }
                });



        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                DataSnapshot admins = dataSnapshot.child("Admins");
                Iterable<DataSnapshot> adminsChildren = admins.getChildren();
                for (DataSnapshot admin: adminsChildren) {
                    Admin a = admin.getValue(Admin.class);
                    if (a != null) {
                        personList.getPersonList().put(a.getUsername(), a);
                    }
                }
                DataSnapshot users = dataSnapshot.child("Users");
                Iterable<DataSnapshot> usersChildren = users.getChildren();
                for (DataSnapshot user: usersChildren) {
                    User u = user.getValue(User.class);
                    if (u != null) {
                        personList.getPersonList().put(u.getUsername(), u);
                    }
                }
                DataSnapshot lostItems = dataSnapshot.child("LostItems");
                Iterable<DataSnapshot> lostChildren = lostItems.getChildren();
                for (DataSnapshot lost: lostChildren) {
                    LostItem l = lost.getValue(LostItem.class);
                    if (l != null) {
                        lostItemList.getLostItemList().add(l);
                    }
                }
                DataSnapshot foundItems = dataSnapshot.child("FoundItems");
                Iterable<DataSnapshot> foundChildren = foundItems.getChildren();
                for (DataSnapshot found: foundChildren) {
                    FoundItem f = found.getValue(FoundItem.class);
                    if (f != null) {
                        foundItemList.getFoundItemList().add(f);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this, RegistrationScreenActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeScreenActivity.this, LoginScreenActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }
        });

        /*loginButton.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent = new Intent(WelcomeScreenActivity.this, HomeScreenActivity.class);
                //startActivity(intent);
                //overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            //}
        //}

        }*/
    }
}
