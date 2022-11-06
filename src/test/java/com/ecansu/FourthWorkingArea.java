package com.ecansu;

import java.util.Scanner;

public class FourthWorkingArea {
    //Palindrom başlangıç
   /* static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }*/
    // Palindrom son

    //Recursive and Fibonacci series start
    /*static int fib(int n) {
        if (n == 1 || n== 2) {
            return 1;
        }
        return fib(n-1)+ fib(n-2);
    }*/
    //Recursive and Fibonacci series end

    //Calculator start

    /*static int sum(int a, int b){
        int result = a +b;
        System.out.println("Toplam: " + result);
        return result;
    }

    static void minus(int a, int b){
        int result = a - b;
        System.out.println("Çıkarma işlemi: " + result);
    }

    static int times(int a, int b){
        return a * b;
    }

    static int divided(int a, int b){
        if (b == 0){
            System.out.println("İkinci sayı sıfırdan farklı bir sayı olmalı!");
            return 0;
        }
        int result = a /b;
        System.out.println("Bölüm : " + result);
        return result;
    }

    static void exp(int a, int b){
        int result = 1;
        for(int i =1; i <=b; i++){
            result *= a;
        }
        System.out.println(result);
    }

    static int mod(int a, int b){
        return a % b;
    }

    static void rect(int a, int b){
        System.out.println("Çevresi : "+ 2 *(a+b));
        System.out.println("Alanı : "+ a*b);
    }*/

    //Calculator end

    //Recursive exponential end start

    // int result =1;
        /*for(int i = 1; i <= b; i++){
            result *=a;
        }*/
    static int exp(int a, int b){
        if ( b == 1){
            return a;
        }
       return exp(a, b-1) * a;
    }

    //Recursive exponential number end

    public static void main(String[] args) {
        //- Palindrom -- System.out.println(isPalindrom(2442));

        // Recursive and Fibonacci series
        /*for(int i = 1; i<10; i++ ){
        System.out.println(fib(i));
        }*/


        //Calculator
        /*int select;
        Scanner scan = new Scanner(System.in);
        String menu = "1- Toplama\n" +
                "2- Çıkarma\n" +
                "3- Çarpma\n" +
                "4- Bölme\n" +
                "5- Üs Alma\n" +
                "6- Mod Alma\n" +
                "7- Dikdörtgen Çevre ve Alan Hesabı\n" +
                "0- Çıkış";
        System.out.println(menu);
        while (true) {
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("Lütfen ilk sayıyı giriniz: ");
            int a= scan.nextInt();
            System.out.print("Lütfen ikinci sayıyı giriniz: ");
            int b= scan.nextInt();
            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    System.out.println("Çarpma: " + times(a, b));
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    exp(a,b);
                    break;
                case 6:
                    System.out.println("Mod: " + mod(a,b));
                    break;
                case 7:
                    rect(a,b);
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        }
        System.out.println("Güle güle!");*/

        //revursive ile üslü sayı hesaplama
        int n1, n2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen taban sayısını giriniz: ");
        n1=inp.nextInt();
        System.out.print("Lütfen üs sayısını giriniz: ");
        n2= inp.nextInt();

        System.out.println(exp(n1,n2));

    }
}
