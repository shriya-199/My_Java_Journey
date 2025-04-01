// Write a Java program to convert an int primitive type to an Integer object using autoboxing
class AutoBoxing
{
    public static void main(String args[])
    {
        int a = 5;
        Integer a1 = Integer.valueOf(a);
        System.out.println("The value of a after autoboxing is: " + a1);

    }
}