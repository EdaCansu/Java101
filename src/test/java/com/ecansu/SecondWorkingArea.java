package com.ecansu;

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
        int a = 10, b = 20, c = 1;
        if ((a < b) && (a < c)) {
            System.out.println("A en küçük sayıdır.");
        } else if ((b < a) && (b < c)) {
            System.out.println("B en küçük sayıdır.");
        } else {
            System.out.println("C en küçük sayıdır.");
        }
        System.out.println("Programınız sonlandı!");
        // if-else bloklari son
    }
}
