package com.ecansu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Scanner;

@SpringBootTest
class FirstTryApplicationTests {

    public static void main(String[] args) {
     //   System.out.println("Hello World");
      /*        int number1 = 10;
        System.out.println("number1");
        int number1, number2 = 20, number3;
        number1 = 10;
        System.out.println(number1 + number2);

        number3 = number1 + number2;
        System.out.println(number3);

        int kisaKenar = 10, uzunKenar = 20;
        int alan = kisaKenar * uzunKenar;
        int cevre = 2 * (kisaKenar + uzunKenar);
        System.out.println(alan);
        System.out.println(cevre);
        */

        /* byte vByte = 1;
        short vShrt = 2;
        int vInt = 3;
        long vLong = 4;
        System.out.println(vByte);
        System.out.println(vShrt);
        System.out.println(vInt);
        System.out.println(vLong);

        float vFloat = 3.14f;
        double vDouble = 4.14;
        System.out.println(vFloat);
        System.out.println(vDouble); */

        /* char vChar = 'b';
        char v2Char = 98;
        System.out.println(vChar);
        System.out.println(v2Char);

        char vNew = 'J';
        char v2New = 'A';
        char v3New = 'V';
        System.out.println("" + vNew + v2New + v3New + v2New);
        System.out.println(vNew + v2New + v3New + v2New);

        boolean dogru = true;
        boolean yanlis =  false;
        System.out.println(dogru);
        System.out.println(yanlis); */

        /* String vStr = "Eda";
        System.out.println(vStr); */

        /* int a = 4, b = 3, c = 6;
        boolean kosul1 = a >= b;
        boolean kosul2 = a <= c;
        // System.out.println(kosul1 && kosul2);
        boolean sonuc = kosul1 || kosul2;
        // System.out.println(!sonuc);
        String result = sonuc ? "İşte bu!" : "Olmadı";
        int result2 = sonuc ? 1 : 0;
        System.out.println(result2);
        System.out.println(result);*/

        /* int a;
        Scanner input = new Scanner(System.in);
        System.out.print("A sayısını giriniz : ");
        a = input.nextInt();
        System.out.println(a);

        Scanner input = new Scanner(System.in);
        System.out.println("İsnizi giriniz :");
        String vIsım = input.nextLine();
        System.out.println(vIsım);

        //string veride sayı girilebiliyor fakar rakamsal verilerde harf girilmiyor.

        Scanner input = new Scanner(System.in);
        double vnmbr = input.nextDouble();
        System.out.println(vnmbr); */

        //double veri türüyle tam sayı ve virgüllü ondalık sayı yazılabiliyor fakat noktalı ondalık sayı yazılamıyor.

        /* Scanner input = new Scanner (System.in);
        boolean vsorgu = input.hasNextBoolean();
        System.out.println(vsorgu); */


        Scanner math = new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz : ");
        int mathNot = math.nextInt();

        Scanner phy = new Scanner(System.in);
        System.out.println("Fizik Notunu Giriniz : ");
        int phyNot = phy.nextInt();

        Scanner chm = new Scanner(System.in);
        System.out.print("Kimya Notunu Giriniz : ");
        int chmNot = chm.nextInt();

        int ort = (mathNot + phyNot + chmNot) / 3;
        System.out.println("Not Ortalamanız : " + ort);

        boolean kosul = ort >= 60;
        String result = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);

    }

    @Test
    void contextLoads() {
    }

}
