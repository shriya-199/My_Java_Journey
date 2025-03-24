// Write a Java method to convert a floating-point number to an integer using the Round Half Up rule (round 0.5 and above up, else down)
import java.util.*;
public class FloatToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the float value: ");
        float f = sc.nextFloat();
        System.out.println("The integer value after rounding is: ");
        if(f%1>=0.5)
            System.out.println((int)f+1);
        else
            System.out.println((int)f);
    }
}
