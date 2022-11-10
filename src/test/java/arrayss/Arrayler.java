package arrayss;

import java.util.Arrays;

public class Arrayler {

    public static void main(String[] args) {
        int[] list = {59, 57, 81, -240, 80};
        int[] list2 = {5, 14, 7, 11, 9};
        Arrays.sort(list2);

        int[][] list3 = new int[7][4];
        //B harfi yazdırma
        for(int i = 0; i < list3.length; i++){
            for (int k= 0; k < list3[i].length; k++){
                if(((i == 0) || (i == 3) || (i == 6)) && (k == 3)){
                    System.out.print(" ");
                } else if(((i == 1) || (i == 2) || (i == 4) || (i == 5)) && ((k == 1) || (k == 2))){
                    System.out.print("   ");
                } else {
                    System.out.print("*  ");
                }

            }
            System.out.println("");
        }



        /*int number = 13, minNumber = list2[0], maxNumber = list2[0];
        for (int i: list2) {
            if (i < number) {
               minNumber = i;
            }

            if(i > number){
                maxNumber =i;
                break;
            }
        }

        System.out.println("en küçük number " + minNumber);
        System.out.println("En büyük number " + maxNumber);*/



        /*double avarage = 0;
        for(int i : list){
            avarage += i;
        }
        avarage /= list.length;
        System.out.println(avarage);*/

        /*int min = list[0], max = list[0];
        for(int i = 0; i < list.length; i++){
            if (list[i] < list[0]) {
                min = list[i];
            }
            if (list[i] > list[0]) {
                max = list[i];
            }
        }

        System.out.println("min   " + min);
        System.out.println("max    " + max);*/



    }

}
