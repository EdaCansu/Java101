package com.ecansu;

import java.util.Scanner;

public class SecondWorkingArea {
    public static void main(String[] args) {
        // Karsilastirma operatorleri baslangic
        /* == Eşittir ( x == y )
        != Eşit Değildir ( x != y )
        > Büyüktür ( x > y )
        < Küçüktür ( x < y )
        >= Büyük Eşittir ( x >= y )
        <= Küçük Eşittir ( x <= y ) */
        // Karsilastirma operatorleri son

        // Mantiksal operatorler baslangic
        /*
        && VE (AND)
        || Veya (OR)
        ! Ters İşlem
        ? : Soru İşareti Operatörü (kosul ? "dogru" : "yanlis")
        */
        // Mantiksal operatorler son

        // if-else bloklari baslangic
        /* int a = 10, b = 20, c = 1;
        if ((a < b) && (a < c)) {
            System.out.println("A en küçük sayıdır.");
        } else if ((b < a) && (b < c)) {
            System.out.println("B en küçük sayıdır.");
        } else {
            System.out.println("C en küçük sayıdır.");
        }
        System.out.println("Programınız sonlandı!");*/
        // if-else bloklari son

        //switch case baslangic
        /* int day;
        Scanner takenDay = new Scanner(System.in);
        System.out.println("Lütfen bugünün kaçıncı gün olduğunu giriniz");
        day = takenDay.nextInt();
        switch (day){
            case 1:
                System.out.println("Bugün günlerden pazartesi");
                break;
            case 2:
                System.out.println("Bugün günlerden salı");
                break;
            case 3:
                System.out.println("Bugün günlerden çarşamba");
                break;
            case 4:
                System.out.println("Bugün günlerden perşembe");
                break;
            case 5:
                System.out.println("Bugün günlerden cuma");
                break;
            case 6:
                System.out.println("Bugün günlerden cumartesi");
                break;
            case 7:
                System.out.println("Bugün günlerden pazar");
                break;
            default:
                System.out.println("Yanlış bir değer girdiniz.");
        }
        System.out.println("Programınız bitmiştir."); */
        //switch case son

        //Hesap makinesi baslangic
        int n1, n2, select;
        Scanner number = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        n1 = number.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = number.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Lütfen yapılmasını istediğiniz işlemi seçiniz: ");
        select = number.nextInt();

        switch (select){
            case 1:
                System.out.println("Toplam :" + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarm :" + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpım :" + (n1 * n2));
                break;
            case 4:
                if (n2 == 0){
                    System.out.println("Bir sayı sıfıra bölünemez");
                } else {
                    System.out.println("Bölüm :" + (n1 / n2));
                }
                break;
            default:
                System.out.println("Yanlış bir seçim yaptınız. Tekrar deneyiniz.");
        }

    }
}
