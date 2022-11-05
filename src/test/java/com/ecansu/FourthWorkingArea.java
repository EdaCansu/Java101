package com.ecansu;

public class FourthWorkingArea {
    //Palindrom başlangıç
   /* static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber)
            return true;
        else
            return false;
    }*/
    // Palindrom son

    //Recursive and Fibonacci series start

    static int fib(int n) {
        if (n == 1 || n== 2) {
            return 1;
        }
        return fib(n-1)+ fib(n-2);
    }
    //Recursive and Fibonacci series end

    public static void main(String[] args) {
        //- Palindrom -- System.out.println(isPalindrom(2442));

        // Recursive and Fibonacci series
        for(int i = 1; i<10; i++ ){
        System.out.println(fib(i));
        }
    }
}
