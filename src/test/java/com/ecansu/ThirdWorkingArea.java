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

        /* int n;
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

        for (int i = (n-1); i >= 1; i--){
            for (int k = (n-i); k >= 1; k--){
                System.out.print(" ");
            }
            for (int l= (2 * i) - 1; l >= 1; l-- ){
                System.out.print("*");
            }
            System.out.println("");
        }
        int a = 1;
        while (a <= n) {
            int b = 1;
            while (b <= (n - a)) {
                System.out.print(" ");
                b++;
            }
            int c = 1;
            while (c <= ((2*a) -1)) {
                System.out.print("*");
                c++;
            }
            a++;
            System.out.println("");
        }*/

        //star triangle end

        //ATM start
        /*String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3, select, balance = 1500;

        while (right > 0) {
            System.out.print("Username: ");
            userName = inp.nextLine();
            System.out.print("Password: ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome to X Bank.");
                do {
                    System.out.println("1 - Deposit \n" +
                            "2 - Withdraw\n" +
                            "3 - Balance inquiry\n" +
                            "4 -Exit");
                    System.out.print("Please select the action: ");
                    select = inp.nextInt();
                    if (select == 1) {
                        System.out.print("Amount of money you want to deposit: ");
                        int money = inp.nextInt();
                        balance += money;
                    } else if (select == 2) {
                        System.out.print("Amount of money you want to withdraw: ");
                        int money = inp.nextInt();
                        if (balance < money){
                            System.out.println("Insufficient balance.");
                        }else {
                            balance -= money;
                        }
                    } else if (select == 3) {
                        System.out.println("Your balance: " + balance);
                    }
                } while (select != 4);
                System.out.println("See you again. Thank you");
                break;
            } else {
                right--;
                System.out.print("Username or Password incorrect!");
                if (right != 0) {
                    System.out.print(" Please try again.\n");
                    System.out.println("Remaining right: " + right);
                } else {
                    System.out.println("\nYour account has been blocked. Please contact with the bank. ");
                }
            }
        } */
        //ATM end

        //GCD - LCM start

        /*int n1, n2, gcd = 1, lcm = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        n1 = inp.nextInt();
        System.out.print("Please enter a second number: ");
        n2 = inp.nextInt();

        for (int i = 1; i <= n1; i++) {
            //System.out.println(i);
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
            }
        }
        System.out.println(gcd);
        System.out.println("====================");
        //Second road (less loop, saving on time)
        for (int i = n1; i >=1; i--) {
            //System.out.println(i);
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
                break;
            }
        }
        System.out.println(gcd);
        System.out.println("=================");
        //gcd while loop
        int i = n1;
        while (i >= 1) {
            if(n1%i == 0 && n2%i == 0){
                gcd = i;
                break;
            }
            i--;
        }
        System.out.println(gcd);

        for (int i = 1; i <= (n1 *n2); i++){
            if(i %n1 == 0 && i%n2 == 0){
                lcm = i;
                break;
            }
        }
        System.out.println(lcm);

        System.out.println("=================");

        //while loop
        int i= 1;
        while (i <= (n1 *n2)){
            if (i % n1 == 0 && i % n2 ==0) {
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println(lcm); */

        //GCD - LCM end

        //Min - max start

        /*int n1, n2, big = 0, small = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("How many number will you enter: ");
        n1 = inp.nextInt();

        for (int i = 1; i <= n1; i++){
            System.out.print(i + ". number: ");
            n2 = inp.nextInt();

            if (i==1){
                big = n2;
                small = n2;
            }
            if(n2 > big) {
                big = n2;
            }
            if (n2 < small){
                small = n2;
            }
            System.out.println("the biggest number: " + big);
            System.out.println("the smallest number: " + small);
        }*/
        //Min - max end

        //Perfect number start
        /*int number, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        number = input.nextInt();

        for(int i= 1; i < number; i++){
            if(number % i == 0){
                sum += i;
            }
        }

        if (number == sum){
            System.out.println(number + " is a perfect number!");
        } else {
            System.out.println(number + " is not a perfect number!");
        }*/
        //Perfect number end

        //Reverse triangle start
        /*int number;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        number = inp.nextInt();

        for(int i = number; i >= 1; i--){
            for(int l = 0; l < (number - i); l++){
                System.out.print(" ");
            }
            for(int k = ((2 * i) - 1); k >= 1; k--){
                System.out.print("*");
            }
            System.out.println("");
        }*/
        //Reverse triangle end


        //Prime number start

        /*for (int i = 2; i <= 100; i++) {
            int primeNumber = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    primeNumber = 1;
                    break;
                }
            }
            if (primeNumber == 0) {
                System.out.println("Prime number: " + i);
            }
        }*/
        //Prime number end

        //Fibonacci series start
        int number, sum = 0, n0 = 0, n1 = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Please, enter a number: ");
        number = inp.nextInt();
        System.out.println(n0);
        System.out.println(n1);

        for(int i = 2; i <= number; i++){
            sum = n0 + n1;
            System.out.println(sum);
            n0 = n1;
            n1 = sum;
        }

        //Fibonacci series end

    }

}

