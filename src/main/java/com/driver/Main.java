package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B obj = new B();
        System.out.println(obj.meth());  // Calls the overridden method in class B

        // Task 5: Call the overridden method from object of class B
        // The output will show the overridden method from class B, demonstrating method overriding
    }
}
