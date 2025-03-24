//  Find the largest possible floating-point number in Java that doesn't lose precision when converted to an integer.
class largestfloat
{
    public static void main(String[] args) {
        double max = Math.pow(2,53);
        // 2^53 is the largest possible floating-point number in Java that doesn't lose precision when converted to an integer.
        System.out.println(max);
        float maxfloat = (float) Math.pow(2,24);
        // 2^24 is the largest possible floating-point number in Java that doesn't lose precision when converted to an integer.
        System.out.println(maxfloat);
        System.out.println((int)maxfloat);
        System.out.println((long)max);
        // Here we use long instaed of int because the value of max is too large to be stored in an int.
    }
}