//Write a Java program to convert an Integer object to an int primitive type using unboxing.
public class Unboxing
{
    public static void main(String args[])
    {
        Integer a = 5;
        int a1 = a.intValue();
        System.out.println("The value of a after unboxing is: " + a1);
    }
}
