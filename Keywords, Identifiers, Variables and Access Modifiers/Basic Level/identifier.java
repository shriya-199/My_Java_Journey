// Write a Java program to check whether a given identifier is valid according to Java naming rules.
import java.util.*;
public class identifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an identifier: ");
        String str = sc.nextLine();
        // Here we took a String as input
        if (str.matches("[a-zA-Z_$][a-zA-Z_$0-9]*"))
        // Here we check if the input string is a valid identifier by using regular expression that checks if the string starts with a letter, $ or _ and is followed by any number of letters, digits, $ or _
         {
            System.out.println("Valid identifier");
        } else {
            System.out.println("Invalid identifier");
        }
    }
    
}
