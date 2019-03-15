package com.manager.estate.playground;

public class Main {

    public static void main(String[] args) {


        Exceptions exceptions = new Exceptions();


        exceptions.throwExceptionHandle();


        try {
            exceptions.throwExceptionDontHandle();
        } catch (Exception e) {
            System.out.println("obsłużone z innego miejsca");
        }


        double result = exceptions.divide(2, 0);

        System.out.println(result);
    }
}
