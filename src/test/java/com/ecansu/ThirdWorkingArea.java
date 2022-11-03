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
        /* int n, t = 0;
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
        System.out.println("Program sona ermiştir."); */
        //tek sayı toplama son

        //java assignment başlangıç
        /*int n, sum = 0;
        Scanner inp = new Scanner(System.in);
        boolean isError = false;

        while (!isError) {
            System.out.print("Lütfen bir sayı giriniz: ");
            n = inp.nextInt();
            if (n % 2 == 0) {
                isError = false;
                if (n % 4 == 0) {
                    sum += n;
                }
            } else {
                isError = true;
            }
        }
        System.out.println("Toplam:" + sum);
        System.out.println("Programınız sonlanmıştır.");*/
        //java assignment son

        //2'nin kuvveti başlangıç
       /* int n;
        double a;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();
        System.out.println(n);

        for (int i = 0; i <= n; i++) {
            a = Math.pow(2,i);
            if (a < n) {
                System.out.print( a + ",");
            }
            else {
                break;
            }
        }

        // İkinci ve kısa yol
        for (int i = 1; i <= n; i *= 3) {
            System.out.println(i);
        }*/
        //2'nin kuvveti son

        //Faktöriyel başlangıç
        /* int n, a = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        System.out.println("Sayınız: " + n);

        for (int i = n; i > 0; i--) {
            a *= i;
            if (i > 1){
                System.out.print(i + "*");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("");
        System.out.println("Faktöriyel sonucunuz: " + a); */
        //Faktöriyel son

        //Kombinasyon başlangıç
        /* int n,r, a = 1, b = 1, c, d= 1, k;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        System.out.print("Lütfen ikinci bir sayı giriniz: ");
        r = inp.nextInt();
        c = n-r;

        for (int i = 1; i <= n; i++ ){
            a *= i;
        }
        for (int i = 1; i <= r; i++ ){
            b *= i;
        }

        for (int i = 1; i <= c; i++){
            d *= i;
        }
        k = a / (b * d);
        System.out.println(n + "'ın " + r + "li kombinasyonu : " + k);*/
        //Kombinasyon son

        //Üslü sayı hesaplama başlangıç
        /*int a, b, c = 1 ;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen taban sayısını giriniz: ");
        a = inp.nextInt();
        System.out.print("Lütfen üs sayısını giriniz: ");
        b= inp.nextInt();

        //c = (int) Math.pow(a,b);
        //System.out.println(c);

        for(int i = 1; i <=b; i++){
            c *= a;
        }
        System.out.println(c);
        int i = 1;
        while (i <=b){
            c *= a;
            i++;
        }
        System.out.println(c);*/

        //Üslü sayı hesaplama son

        //Armstrong number start
        /*int number, a, b, lastnumber, numberOfDigits = 0, exp = 0, sum = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        number = inp.nextInt();
        a = number;
        b = a;
        boolean isArmstrong = true;

        while (b != 0){
            numberOfDigits++;
            b /= 10;
        }

        while (a != 0){
            lastnumber = a%10;
            exp = (int) Math.pow(lastnumber,numberOfDigits);
            a/= 10;
            sum += exp;
        }

        if (number == sum)
            isArmstrong = true;
        else
            isArmstrong = false;

        System.out.println(isArmstrong);*/
        //Armstrong number end

        //Basamak değerleri toplamı başlangıç
        /*int n, nBack, sum = 0, lastNumber;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();
        nBack = n;

        while (nBack != 0) {
            lastNumber = nBack % 10;
            sum += lastNumber;
            nBack /= 10;
        }
        System.out.println("Basamak değerleri toplamı: " + sum);*/
        //Basamak değerleri toplamı son

        //Harmonic series start
        /*int n;
        double result = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = inp.nextInt();

        for(double i = 1; i <= n; i++){
            result += (1/i);
        }
        System.out.print("Sonuç: "+ result);*/
        //Harmonic series end

        //star triangle start

        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //star triangle end
    }

}

