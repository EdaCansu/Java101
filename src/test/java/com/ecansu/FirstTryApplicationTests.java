package com.ecansu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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

        char vChar = 'b';
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
        System.out.println(yanlis);


    }

    @Test
    void contextLoads() {
    }

}
