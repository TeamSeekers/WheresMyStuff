package com.example.seekers.wheresmystuff.Model;

/**
 * A class that represents a person(user or administrator)
 */
public abstract class Person {
    /**
     * Getter method for the name
     *
     * @return the name of the person
     */
    public abstract String getName();

    /**
     * Method to check if a User is banned
     */
    public abstract boolean isBanned();

    /**
     * Set account to banned or unbanned
     *
     * @param b true for banned, false for unbanned
     */
    public abstract void setBanned(boolean b);

    /**
     * Getter method for the username
     *
     * @return the username of the person
     */
    public abstract String getUsername();

    /**
     * Getter method for the AccountType
     *
     * @return the accountType for the person
     */
    public abstract String getAccountType();

    /**
     * The getter method for the password
     *
     * @return the password for the person
     */
    public abstract String getPassword();

    /**
     * Get number incorrect tries
     *
     * @return number incorrect tries
     */
    public abstract int getIncorrect();

    /**
     * Reset number of attempts to login
     */
    public abstract void resetIncorrect();

    /**
     * Add to number of attempts to login
     */
    public abstract void addIncorrect();

    /**
     * Overrides the toString method for this class
     *
     * @return a string that properly describes the information held in the
     * class
     */
    public abstract String toString();
}
