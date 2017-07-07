package com.example.seekers.wheresmystuff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AdminScreenActivity extends AppCompatActivity {

    private EditText banUser;
    private EditText unbanUser;
    private Button banUserButton;
    private Button unbanUserButton;
    private String banUsername;
    private String unbanUsername;
    public static FirebaseDatabase database;
    public static DatabaseReference myRef;
    public static PersonList personList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_screen);

        banUser = (EditText) findViewById(R.id.banUserText);
        unbanUser = (EditText) findViewById(R.id.unbanUserText);
        banUserButton = (Button) findViewById(R.id.banUserButton);
        unbanUserButton = (Button) findViewById(R.id.unbanUserButton);
        personList = new PersonList();
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();

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
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        banUsername = banUser.getText().toString();
        unbanUsername = unbanUser.getText().toString();

        banUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!personList.getPersonList().get(banUsername).isBanned()
                        && personList.getPersonList().get(banUsername) != null) {
                    personList.getPersonList().get(banUsername).setBanned(true);
                    User n = (User) personList.getPersonList().get(banUsername);
                    myRef.child("Users").child(n.getUsername()).setValue(n);
                }
            }
        });

        unbanUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (personList.getPersonList().get(unbanUsername).isBanned()
                        && personList.getPersonList().get(banUsername) != null) {
                    personList.getPersonList().get(unbanUsername).setBanned(false);
                    User n = (User) personList.getPersonList().get(unbanUsername);
                    myRef.child("Users").child(n.getUsername()).setValue(n);
                }
            }
        });
    }
}
