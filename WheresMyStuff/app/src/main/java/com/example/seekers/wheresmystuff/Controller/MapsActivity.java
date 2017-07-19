package com.example.seekers.wheresmystuff.Controller;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.seekers.wheresmystuff.Model.FoundItem;
import com.example.seekers.wheresmystuff.Model.Item;
import com.example.seekers.wheresmystuff.Model.LostItem;
import com.example.seekers.wheresmystuff.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Controller class to handle adding markers to map and viewing map
 */
public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        WelcomeScreenActivity.myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                DataSnapshot lostItems = dataSnapshot.child("LostItems");
                Iterable<DataSnapshot> lostChildren = lostItems.getChildren();
                for (DataSnapshot lost: lostChildren) {
                    LostItem l = lost.getValue(LostItem.class);
                    if (l != null) {
                        WelcomeScreenActivity.lostItemList.getLostItemList().add(l);
                    }
                }
                DataSnapshot foundItems = dataSnapshot.child("FoundItems");
                Iterable<DataSnapshot> foundChildren = foundItems.getChildren();
                for (DataSnapshot found: foundChildren) {
                    FoundItem f = found.getValue(FoundItem.class);
                    if (f != null) {
                        WelcomeScreenActivity.foundItemList.getFoundItemList().add(f);
                    }
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        try {
            addAllMarkers();
        } catch (IOException io) {
            Log.d("Exception", io.getMessage());
        }
        CameraPosition pos = new CameraPosition(new LatLng(30.00, -93), 0, 0, 0);
        mMap.moveCamera(CameraUpdateFactory.newCameraPosition(pos));
        mMap.getUiSettings().setZoomControlsEnabled(true);
        mMap.getUiSettings().setCompassEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(true);
    }

    private void addMarker(Item item) throws IOException {
        Geocoder coder = new Geocoder(this);
        ArrayList<Address> newAddress = (ArrayList<Address>) coder.getFromLocationName(item.getAddress(), 5);
        if (newAddress.size() > 0) {
            Address location = newAddress.get(0);
            double longitude = location.getLongitude();
            double latitude = location.getLatitude();
            mMap.addMarker(new MarkerOptions()
                    .position(new LatLng(latitude, longitude))
                    .title(item.getName())
                    .snippet(item.getAddress() + "/" + item.getColor() + "/" + item.getDescription()));
        }
    }

    private void addAllMarkers() throws IOException {
        for (int i = 0; i < WelcomeScreenActivity.lostItemList.getLostItemList().size(); i++) {
            if (WelcomeScreenActivity.lostItemList.getLostItemList().get(i).getAddress() != null) {
                addMarker(WelcomeScreenActivity.lostItemList.getLostItemList().get(i));
            }
        }
        for (int i = 0; i < WelcomeScreenActivity.foundItemList.getFoundItemList().size(); i++) {
            if (WelcomeScreenActivity.foundItemList.getFoundItemList().get(i).getAddress() != null) {
                addMarker(WelcomeScreenActivity.foundItemList.getFoundItemList().get(i));
            }
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }
}
