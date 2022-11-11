package arrayss;

public class Arrayler {

    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        //int[] list = {59, 57, 81, 1, -240, 80, 59};
        //int[] list2 = {5, 14, 6, 7, 6, 2, 9, 5, 2, 9};
        //Arrays.sort(list2);

        //int[][] list3 = new int[7][4];
        //B harfi yazdırma
        /*for(int i = 0; i < list3.length; i++){
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
        }*/


       /*int[] duplicate = new int[list2.length];
       int startIndex = 0;

        for(int i = 0; i < list2.length; i++){
            for (int j = 0; j < list2.length; j++){
                if((i != j) && (list2[i] == list2[j])){
                    if(!isFind(duplicate, list2[i])){
                        duplicate[startIndex++] = list2[i];
                    }
                    break;
                }
            }
        }

        for (int i = 0; i < list2.length; i++){
            if ((duplicate[i] != 0) && (duplicate[i] % 2 ==0) ){
                System.out.println(duplicate[i]);
            }
        }
        //İkinci bir yol
        System.out.println(Arrays.toString(duplicate));*/


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

        //New something
        /*Scanner inp = new Scanner(System.in);
        System.out.print("Lütfen dizinin boyutunu giriniz: ");
        int boyut = inp.nextInt();
        int number, startIndex = 0;

        int[] arr1 = new int[boyut];
        System.out.println("Dizinin Elemanlarını Giriniz: ");

        for( int i = 0; i < boyut; i++){
            System.out.print(i+1 + ". Elemanı: ");
            arr1[i] = inp.nextInt();
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));*/


        /*int[] arr = {25, 32, 14, 9, 10, -5};
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++){
            System.out.println((i+1) + ". Eleman: " + arr[i]);
        }

        System.out.println(Arrays.toString(arr));*/


        int[][] arr = new int[2][3];
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[0][2] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        int countRow = 0, countCol = 0;


        for (int i = 0; i < arr.length; i++) {
            for (int k = 0; k < arr[i].length; k++) {
                countCol = arr[i].length;
                System.out.print(arr[i][k] + " ");
            }
            System.out.println("");
            countRow++;
        }

        System.out.println(countRow + " countrow");
        System.out.println(countCol + " countcol");

        int[][] arrNew = new int[countCol][countRow];
        for (int i = 0; i < countRow; i++) {
            for (int k = 0; k < countCol; k++) {
                arrNew[k][i] = arr[i][k];
            }
        }


        for (int[] val : arrNew) {
            for (int i : val) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }


    }

}
