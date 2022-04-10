package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Toplanacak sayıları giriniz : ");
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();

        toplamaIslemi(number1,number2);
        }
    public static int toplamaIslemi(int number1, int number2){
        return number1+number2;
        }
    }

