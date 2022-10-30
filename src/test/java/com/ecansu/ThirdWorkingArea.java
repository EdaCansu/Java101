package com.ecansu;

import java.util.Scanner;

public class ThirdWorkingArea {

    public static void main(String[] args) {

        //while döngüsü başlangıç
        /*int password;
        Scanner inp= new Scanner(System.in);
        boolean passwordSuccess = false;

        while (!passwordSuccess) {
            System.out.print("Lütfen şifrenizi giriniz: ");
            password = inp.nextInt();
            if (password == 123) {
                System.out.println("Doğru.");
                passwordSuccess = true;
            } else {
                System.out.println("Yanlış.");
            }
        }*/
        //while döngüsü son

        //do-while döngüsü başlangıç
        /*int pass;
        Scanner inp = new Scanner(System.in);
        boolean askpassword = true;

        do {
            System.out.print("Lütfen şifrenizi giriniz: ");
            pass = inp.nextInt();
            if (pass == 123) {
                System.out.println("Doğru");
                askpassword = false;
            } else {
                System.out.println("Yanlış");
            }
        } while(askpassword);*/
        //do-while döngüsü son

        //for döngüsü başlangıç
        /* for (int i = 0; i < 10; i+=2) {
            System.out.println(i);
        }*/
        //for döngüsü son

        //Çift sayıyı bulma başlangıç

        /*Scanner inp = new Scanner(System.in);
        int n;
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        for (int i = 0; i<= n; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }*/
        //Çift sayıyı bulma son

        //ortak bölen ortalama başlangıç
        /*Scanner inp = new Scanner(System.in);
        int n, sum = 0, j = 0;
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        for (int i = 0; i < n; i++){
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.println(i);
                sum += i;
                j++;
            }
        }
        System.out.println("Toplam: " + sum);
        System.out.println("Ortalama: " + sum / j);*/
        //ortak bölen ortalama son

        //tek sayı toplama başlangıç

        int n, t = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n= inp.nextInt();
        while (n >= 0) {
            System.out.println(n);
            if (n % 2 != 0) {
                t += n;
            }
            System.out.print("Lütfen bir sayı giriniz: ");
            n= inp.nextInt();
        }
        System.out.println("Tek sayıların toplamı: " + t);
        System.out.println("Program sona ermiştir.");
        //tek sayı toplama son



    }

}
