package edu.gatech.oad.antlab.person;
import java.util.HashMap;
import java.util.Random;

/**
 *  A simple class for person 2
 *  returns their name and a
 *  modified string
 *
 * @author Marcus Jones
 * @version 1.1
 */
public class Person2 {
    /** Holds the persons real name */
    private String name;
	 	/**
	 * The constructor, takes in the persons
	 * name
	 * @param pname the person's real name
	 */
	 public Person2(String pname) {
	   name = pname;
	 }
	/**
	 * This method should take the string
	 * input and return its characters in
	 * random order.
	 * given "gtg123b" it should return
	 * something like "g3tb1g2".
	 *
	 * @param input the string to be modified
	 * @return the modified string
	 */
	private String calc(String input) {
  int len = input.length();
      HashMap map = new HashMap<Integer, Boolean>();
      boolean notDone = true;
      int counter = 0;
      Random rand = new Random();
      String result = "";
      for (int i = 0; i < len; i++) {
          map.put(i, false);
      }
      while (counter <  len) {
          int check = rand.nextInt(len);
          if ((Boolean) map.get(check) == false) {
              map.put(check, true);
              counter++;
              result += input.charAt(check);
          }
      }
      return result;
	}
	/**
	 * Return a string rep of this object
	 * that varies with an input string
	 *
	 * @param input the varying string
	 * @return the string representing the
	 *         object
	 */
	public String toString(String input) {
	  return name + calc(input);
	}
}
