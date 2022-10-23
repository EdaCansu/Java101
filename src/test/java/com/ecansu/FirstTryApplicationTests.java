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

        // Not ortalamasi hesaplayan program baslangic
        /* Scanner inp = new Scanner(System.in);
        System.out.println("Matematik Notunu Giriniz : ");
        double mathNot = inp.nextInt();

        System.out.println("Fizik Notunu Giriniz : ");
        double phyNot = inp.nextInt();

        System.out.print("Kimya Notunu Giriniz : ");
        double chmNot = inp.nextInt();

        double ort = (mathNot + phyNot + chmNot) / 3;
        System.out.println("Not Ortalamanız : " + ort);

        boolean kosul = ort >= 60;
        String result = kosul ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result); */
        // Not ortalamasi hesaplayan program son


        // KDV hesaplayan program baslangic
        /*  Scanner mny = new Scanner(System.in);

        System.out.print("Para miktarını giriniz : ");
        double money = mny.nextDouble();
        double kdv1Oran = 0.18;
        double kdv2Oran = 0.08;
        double Kdv1 = money * kdv1Oran;
        double Kdv2 = money * kdv2Oran;
        double Kdv2F = money + Kdv2;
        double Kdv1F = money + Kdv1;


        System.out.println("KDV'siz Fiyat: " + money);

        boolean kosul = money <= 1000;
        double result = kosul ? Kdv1F : Kdv2F;
        double result2 = kosul ? Kdv1 : Kdv2;
        System.out.println("KDV'li Fiyat: " + result);
        System.out.println("KDV tutarı: " + result2); */
        //KDV hesaplayan program son

        //Hipotenüs ve ucgen alanı hesaplayan program baslabgic
        /*double knr1, knr2, knr3;
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenar uzunluğunu giriniz : ");
        knr1 = input.nextDouble();
        System.out.println("İkinci kenar uzunluğunu giriniz : ");
        knr2 = input.nextDouble();

        knr3 = Math.sqrt((knr1 * knr1) + (knr2 * knr2));
        System.out.println("Hipotenüs : " + knr3);

        double uBileseni = (knr1 + knr2 + knr3) / 2;
        double alan2 = Math.sqrt(uBileseni * (uBileseni - knr1) * (uBileseni - knr2) * (uBileseni - knr3));
        System.out.println("Alanı: " +alan2); */
        //Hipotenüs ve ucgen alanı hesaplayan program son

        //taksimetre baslangic
        /* Scanner girdi = new Scanner(System.in);
        double km, perKm = 2.20, total, startPrice = 10;
        System.out.println("Gidilen km'yi giriniz: ");
        km= girdi.nextDouble();

        total = startPrice + (perKm * km);
        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar: " + total); */
        //taksimetre son

        //Dairenin alanını ve çevresini hesaplayan program baslangic
        /* Scanner veri = new Scanner(System.in);
        double yCap, pi, alan, cevre, aci, dilimAlani;
        System.out.println("Lütfen yarıçapı giriniz: ");
        yCap = veri.nextDouble();
        pi = 3.14;
        alan = pi * yCap * yCap;
        System.out.println("Alan: " + alan);
        cevre = 2 * pi * yCap;
        System.out.println("Çevre: " + cevre);
        System.out.println("Lütfen açıyı giriniz: ");
        aci = veri.nextDouble();
        dilimAlani = (pi * (yCap * yCap) * aci) / 360;
        System.out.println("Gösterilen dilimin alanı: " + dilimAlani); */
        //Dairenin alanını ve çevresini hesaplayan program son

        //Vücut kitle endeksi hesaplayan program baslangic
        Scanner inp = new Scanner(System.in);
        double boy, kilo, vIndex;
        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo = inp.nextDouble();
        vIndex = kilo / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz: " + vIndex);
        //Vücut kitle endeksi hesaplayan program son

    }

    @Test
    void contextLoads() {
    }

}
