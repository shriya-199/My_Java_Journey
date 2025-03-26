// Write a Java program that takes a sentence as input and prints only the Java keywords present in it.

import java.util.*;
class printJavaKeywords
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String str = sc.nextLine();
        // Here we took a String as input
        String[] keywords = { "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const", "continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float", "for", "goto", "if", "implements", "import", "instanceof", "int", "interface", "long", "native", "new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super", "switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while" };
        // Here we took an array of Java keywords
        String[] words = str.split(" ");
        // Here we split the input string into words
        System.out.println("Java keywords present in the sentence are: ");
        for (String word : words)
        // Here we iterate through the words
        {
            for (String keyword : keywords)
            //Here we iterate through the keywords
            {
                if (word.equals(keyword))
                {
                    System.out.println(word);
                    break;
                }
            }

        }        
    }
}
