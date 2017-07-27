package com.example.seekers.wheresmystuff.Model;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static org.junit.Assert.assertEquals;

/**
 * Created by Hari Tiwari on 7/18/2017.
 */
public class HariTiwariUnitTest {
        @Test
        public void testIsBanned() {
            User PERSONA1 = new User("Hari Tiwari", "testUser", "testing", "User");
            PERSONA1.setBanned(true);
            assertEquals(PERSONA1.isBanned(), true);
            PERSONA1.setBanned(false);
            assertEquals(PERSONA1.isBanned(), false);
        }
}