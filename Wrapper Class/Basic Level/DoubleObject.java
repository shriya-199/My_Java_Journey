// Convert a double primitive type to a Double object and vice versa.
class DoubleObject
{
    public static void main(String args[])
    {
       double d= 7.9;
       Double dObj = d; // Convert double to Double object
       System.out.println("Primitive double: " + d);
       System.out.println("Double object: " + dObj);
       Double d2Object = 20.5;
       double d2 = d2Object;
       System.out.println("Double object : "+d2Object); // Convert Double object to double primitive type
       System.out.println("Primitive double: " + d2);


    }
}