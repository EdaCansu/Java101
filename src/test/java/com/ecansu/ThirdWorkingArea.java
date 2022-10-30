package com.ecansu;

import java.util.Scanner;

public class ThirdWorkingArea {

    public static void main(String[] args) {
        int password;
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
        }

    }

}
