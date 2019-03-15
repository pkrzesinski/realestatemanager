package com.manager.estate.playground;

public class Exceptions {


    //Exception -> musimy obsłużyć

    public void throwExceptionHandle() {

        try {
            throw new Exception("asdasdasd");
        } catch (Exception e) {
            System.out.println("coś poszło nie tak");
        }

    }

    public void throwExceptionDontHandle() throws Exception {

            throw new Exception("asdasdasd");

    }

//    //Runtime exception -> Nie trzeba obsługiwać
//    public
//
//
//    public static void main(String[] args) {
//
//    }



    public double divide(double a, double b) {
        return a/b;
    }
}
