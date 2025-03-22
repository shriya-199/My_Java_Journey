// Write a Java program to check whether adding two integers will cause overflow or not.
import java.util.*;
public class Overflow {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter num 2: ");
        int num2 = sc.nextInt();
        if((num1 > 0 && num2 > 0 && num1>Integer.MAX_VALUE-num2) ||(num1 < 0 && num2 < 0 && num1<Integer.MIN_VALUE-num2))
        // Here (num1>Integer.MAX_VALUE-num2) checks if addition of num1+num2 > Integer.MAX_VALUE
        // Similary (num1<Integer.MIN_VALUE-num2) checks if addition of num1+num2 < Integer.MIN_VALUE
        {
            System.out.print("Overflow detected!");
        }
        else
        {
            System.out.print("Sum = "+(num1+num2));
        }
    }
}


