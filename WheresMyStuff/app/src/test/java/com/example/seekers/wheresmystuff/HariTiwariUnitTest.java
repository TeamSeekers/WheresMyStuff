package com.example.seekers.wheresmystuff;

import android.location.Address;
import android.location.Geocoder;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.seekers.wheresmystuff.Model.User;
import com.example.seekers.wheresmystuff.Model.Person;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

/**
 * Created by Hari Tiwari on 7/17/2017.
 */
public class HariTiwariUnitTest {
    @Test
    public void testIsBanned() {
        Person PERSONA1 = new User("Hari Tiwari", "testUser", "testing", "User");
        PERSONA1.setBanned(true);
        assertEquals(PERSONA1.isBanned(), true);
        PERSONA1.setBanned(false);
        assertEquals(PERSONA1.isBanned(), false);
    }
}