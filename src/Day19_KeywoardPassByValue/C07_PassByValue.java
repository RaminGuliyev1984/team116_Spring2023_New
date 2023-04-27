package Day19_KeywoardPassByValue;

import java.util.Arrays;

public class C07_PassByValue {
    public static void main(String[] args) {

        int[] arr = {10,12,23};
        elemanlariArtir(arr);

        System.out.println("metod calldan sonra arr:" +Arrays.toString(arr));
    }

    public static void elemanlariArtir(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i]= arr[i]+3;
        }
        System.out.println(Arrays.toString(arr));
    }
}
