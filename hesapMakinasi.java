package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Menu");
        System.out.println("[1] - Toplama Islemi");
        System.out.println("[2] - Bolme Islemi");

        Scanner myObj = new Scanner(System.in);
        int key = myObj.nextInt();
        switch (key) {
            case 1:
                System.out.println("Toplanacak sayıları giriniz : ");
                double number1 = myObj.nextInt();
                double number2 = myObj.nextInt();
                double x  = toplamaIslemi(number1, number2);
                System.out.println(x);
                break;
            case 2:
                System.out.println("Bolunecek sayıları giriniz : ");
                double number3 = myObj.nextInt();
                double number4 = myObj.nextInt();
                double y= bolmeIslemi(number3, number4);
                System.out.println(y);
                break;
        }


    }

    public static double toplamaIslemi(double number1, double number2) {
        return number1 + number2;
    }

    public static double bolmeIslemi(double number1, double number2) {
        return number1 / number2;
    }

}