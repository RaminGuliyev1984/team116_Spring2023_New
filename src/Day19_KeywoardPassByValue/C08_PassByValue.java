package Day19_KeywoardPassByValue;

import java.util.Arrays;

public class C08_PassByValue {
    public static void main(String[] args) {

        int[] arr = {3,5,7};

         elemanEkle(arr);

        System.out.println("metod calldan sonra arr:" +Arrays.toString(arr));
    }
    public static void elemanEkle(int[] arr){

        int[] yeniArr = new int[4];

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i]=arr[i];
        }

        yeniArr[yeniArr.length-1]=10;

        arr= yeniArr;

        System.out.println(Arrays.toString(arr));
    }
}
