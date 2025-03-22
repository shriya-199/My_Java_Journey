// Write a Java program that takes a character input and converts it into its corresponding ASCII integer value.
import java.util.*;
public class CharToInteger {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the character whose ASCII is to be found: ");
    char a = sc.next().charAt(0);
    // Here sc.nextChar() will not work so we took sc.next().charAt(index)
    int num = (int)a;
    System.out.print("The ASCII value is: "+num);
    }
}
