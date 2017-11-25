//Author: Ovidio Castillo
//Purpose: To use math class
//Date: 11/02/2017

import java.util.Scanner;
import java.lang.Math;

public class Maths {

            //main method
    public static void main(String[] args) {

        System.out.println("Power "+power(input()));
        System.out.println("Absolute "+(input()));
        System.out.println("square root "+ squareRoot(input()));
        System.out.println("Random "+ random(input()));
        System.out.println("Max "+ max(input()));
        System.out.println("Minimum "+ minimum(input()));
        System.out.println("Round "+ round(input()));
        System.out.println("Ceiling "+ ceiling(input()));
        System.out.println("Floor "+ floor(input()));


    }
            //Math methods
    public static int absolute(int x){
        return Math.abs(x);}

    public static double power(double x){
        return Math.pow(x,x);
    }
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }
    public static double random(double x){
        return Math.random();
    }
    public static int max(int x){
        return Math.max(x,x);
    }
    public static int minimum(int x){
        return Math.min(x,x);
    }
    public static double round(double x){
        return Math.round(x);
    }
    public static double ceiling(double x){
        return Math.ceil(x);
    }
    public static double floor(double x){
        return Math.floor(x);
    }
                //user input method
    public static int input(){
            Scanner keyboard=new Scanner(System.in);
            System.out.println("Enter A Number: ");
            return keyboard.nextInt();

    }
}