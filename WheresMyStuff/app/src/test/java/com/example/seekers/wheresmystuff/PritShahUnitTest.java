package com.example.seekers.wheresmystuff;

import com.example.seekers.wheresmystuff.Controller.RegistrationScreenActivity;
import com.example.seekers.wheresmystuff.Controller.WelcomeScreenActivity;
import com.example.seekers.wheresmystuff.Model.Person;
import com.example.seekers.wheresmystuff.Model.PersonList;
import com.example.seekers.wheresmystuff.Model.User;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by pritshah on 7/17/17.
 */

public class PritShahUnitTest {
    @Test
    public void testAddUser() {
        Person person1 = new User("Prit Shah", "testUser1", "testing", "User");
        Person person2 = new User("Prit Shah", "testUser2", "testing", "Admin");
        WelcomeScreenActivity.personList = new PersonList();
        assertTrue(RegistrationScreenActivity.addUser(
                person1.getName(), person1.getUsername(),
                person1.getPassword(), person1.getAccountType()));
        assertFalse(RegistrationScreenActivity.addUser(
                person2.getName(), person2.getUsername(),
                person2.getPassword(), person2.getAccountType()));
        WelcomeScreenActivity.personList.getPersonList().put(person1.getUsername(), person1);
        assertEquals(WelcomeScreenActivity.personList.getPersonList().get(person1.getUsername()), person1);
        assertNull(WelcomeScreenActivity.personList.getPersonList().get(person2.getUsername()));
    }
}
