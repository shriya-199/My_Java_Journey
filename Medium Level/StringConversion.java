// Write a function to convert a string representation of a number into an integer without using built-in functions like Integer.parseInt().
import java.util.*;
public class StringConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String a = sc.nextLine();
        char[] i = a.toCharArray();
        int ab;
        int num=0;
        for(int x = 0; x<i.length;x++)
            {
                if(Character.isDigit(a.charAt(x)))
                // Here we are checking if the character is a digit or not by using Character.isDigit then charAt(index)
                // a.charAt(x) will return the character at the index x
                // -'0' is used to convert the character to integer
                // '0' is subtracted from the character to get the integer value of the character bcoz anything subtracted from 0 gives that exact value only
                // num=num*10 gives the final number and shifts the number to left one by one.
                {
                    num = num*10 + (a.charAt(x)-'0');
                }
                else
                {
                ab = i[x];
                num += ab; 
                }
            }
            System.out.println(num);
        
    }
}