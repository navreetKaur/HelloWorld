package Main;

/*
 * PalindromeTester.java
 * 
 * Tests a string as entered by the user 
 * to see whether or not it is a palindrome or not.
 * A palindrome would be the same string forwards 
 * as it is backwards.
 * Examples: Anna, civic and of, course:
 * A man a plan a canal Panama.
 */
import java.util.*;
import java.util.regex.Pattern;

public class PalindromeTester {
 public static void main(String[] args) {
 // The palindrome will be entered by the user at the keyboard
 Scanner in = new Scanner(System.in);
 
 System.out.println("Palindrome Checker");
 System.out.print("What phrase would you like to check? ");
 String original = in.nextLine();
 
 // Convert to lower case to simplify comparing strings
 String phrase = original.toLowerCase(); 
 
 String backwards = ""; 
 String forwards = ""; 
 
 // loop through the string forwards, starting with the first character
 for (int i = 0; i <= phrase.length() - 1; i++) {
 
 // Extract each letter as the next character 
 // and build the formatted string
	 String temp = phrase.substring(i, i + 1);
	 int x = temp.toCharArray()[0];
	 if(x >= 97 && x <= 122) {
		 forwards += temp;
	 }
 
 } 
 
 // loop through the string backwards, starting with the last character
 for (int i = phrase.length() - 1; i >= 0; i--) {
 
 // Extract each letter as the next character 
 // and build the backwards string
	 String temp = phrase.substring(i, i + 1);
	 int x = temp.toCharArray()[0];
	 if(x >= 97 && x <= 122) {
		 backwards += temp;
	 }
 
 } 
 
 // A palindrome is a word or phrase that is the same forward or 
 // backward. This is where we check that.
 if (forwards.equals(backwards)) {
 System.out.println(original + " is a palindrome!");
 } else {
 System.out.println(original + " is not a palindrome!"); 
 }
 
 }
}
