package com.mac.main;

public class Repl {


// Write a Java program to print the area and perimeter of a rectangle.

    public static void main(String[] args) {
        System.out.println("INIT MAIN");
        // printResultOfA();
        // printResultOfB();
        // printResultOfC();
        // printResultOfD(firstNumber,secondNumber);
        int length = 25;
        int width = 5;
        int thirdNumber = 10;
        // printResultOfE(firstNumber,secondNumber,thirdNumber);
        printResultOfF(length,width);

    }

    public static void printResultOfF (int length, int width){

        System.out.println(length*width);
        System.out.println(2*length+2*width);
    }

    //old code
    public static void printResultOfE(int firstNumber,int secondNumber, int thirdNumber){
        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println(sum/3);
    }
    public static void printResultOfD(int firstNumber, int secondNumber){

        System.out.println(firstNumber*secondNumber);
    }
    public static void printResultOfA(){
        Integer a  = -5;
        Integer b = 8;
        Integer c = 6;

        int aa = -5;
        int bb = 8;
        int cc = 6;

        System.out.println(aa + bb * cc);
        System.out.println((a + b) * c);
        System.out.println(((-5 + 8) * 6));
    }
    public static void printResultOfB(){

        Integer a = 55;
        Integer b = 9;
        Integer c = 9;

        System.out.println((55+9)%9);
    }
    public static void printResultOfC(){
        Integer a = 20;
        Integer b = -3;
        Integer c = 5;
        Integer d = 8;

        System.out.println(20 + ((-3*5) / 8));
    }
}