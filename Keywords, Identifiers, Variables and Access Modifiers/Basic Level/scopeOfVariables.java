// Write a Java program where:
// A global (class-level) variable and a local (method-level) variable have the same name.
// Print both variables to differentiate scope.
import java.util.*;
public class scopeOfVariables {
        int a = 10;
        void localVariable(){
            int b = 20;
            System.out.println("Local variable is b: "+b);
            System.out.println("Global variable is a: "+a);
        }
    public static void main(String[] args) {
        scopeOfVariables obj = new scopeOfVariables();
        System.out.println("Instance variable (previously called 'global') is a: " + obj.a);
        // System.out.println("Local variable is b: "+b); // This will give an error as b is a local variable and cannot be accessed outside the method
        obj.localVariable();
    }
}

