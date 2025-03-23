// Write a Java program that converts a double value into an integer without using explicit typecasting ((int)).
import java.math.BigDecimal;
import java.util.*;
public class ConversionWithouTypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Double Value:");
        double d = sc.nextDouble();
        int i = new BigDecimal(d).intValue();
        System.out.print("The respective int value is: "+i);
    }
}
// Here we can do this in different ways:
// Math.round() for standard rounding.
// Math.floor() or Math.ceil() for specific rounding directions.
// Double.intValue() for quick conversion.
// BigDecimal for precision.
