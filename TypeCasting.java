// Convert an integer to a double and print the value.
import java.util.*;
public class TypeCasting {
    int a;
    void initialization()
    {
        this.a = a;
    }
    public double TypeCasting(int a)
    {
        double b = a;
        return b;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the integer value: ");
        int a = sc.nextInt();
        TypeCasting obj = new TypeCasting();
        System.out.print("After typecasting the values become: "+obj.TypeCasting(a));
    }
}