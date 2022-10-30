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
        int pass;
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
        } while(askpassword);

        //do-while döngüsü son

    }

}
