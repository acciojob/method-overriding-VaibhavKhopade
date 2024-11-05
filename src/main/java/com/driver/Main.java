package com.driver;
// Task 1: Create class A with a method named meth
public class A {
    public String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create class B which extends class A
public class B extends A {
    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        B obj = new B();
        System.out.println(obj.meth());  // Calls the overridden method in class B

        // Task 5: Call the overridden method from object of class B
        // The output will show the overridden method from class B, demonstrating method overriding
    }
}
