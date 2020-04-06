package com.examples.io.oops.exceptionhandling;

public class ExceptionHandling {

    public void test() {

        try {
            System.out.println("First Try");
            try {
                System.out.println("Nested try");
            } catch (Exception e) {
                e.printStackTrace();
            }
            finally {
                System.out.println("Nested finally");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finally for first try");
        }



    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        exceptionHandling.test();
    }
}
