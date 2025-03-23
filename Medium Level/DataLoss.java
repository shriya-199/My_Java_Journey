// Write a program that takes a double input and converts it into an int. Then, check if data loss occurred.
import java.util.*;
public class DataLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the double value: ");
        double d = sc.nextDouble();
        int i = (int)d;
        System.out.println("Value after conversion: "+i);
        if(i != d)
        {
            System.out.println("Data Loss Detected!");
            System.out.printf("Loss of data is: "+"%.2f",(d-i));
            System.out.println(" ");            
            System.out.print("Loss of data is: ");
            System.out.format("%.3f",(i-d));            

        }
        else
        {
            System.out.print("No Data Loss!");
        }

    }
}
