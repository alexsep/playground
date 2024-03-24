package com.example.functionalinterfaces;

public class MainFunctionalInterfaceExample {

    public static void main(String[] args) {
        System.out.println(
                "Using a functional interface to reverse a String: " +
                reverseMyString("some string", originalString -> {
                    StringBuilder sb = new StringBuilder(originalString);
                    return sb.reverse().toString();
                })
        );

    }

    /**
     * Method receive a Functional Interface as parameter. The implementation will be passed as a lambda expression
     */
    private static String reverseMyString(String myString, MyFunctionalInterfaceExample reverse) {
        return reverse.reverse(myString);
    }
}
