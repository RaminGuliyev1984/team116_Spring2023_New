package Java_PracticeDay2;

import java.util.Arrays;
import java.util.Scanner;

public class PozitivSayilariBulma {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please click Array button");
        int arrayBoyut = scan.nextInt();
        int[] arr= new int[arrayBoyut];

        int arrayElementi =0;
        for (int i = 0; i < arrayBoyut; i++) {
            System.out.println("Please Arrays" +i+ "Button click");
            arrayElementi = scan.nextInt();
            arr[i]= arrayElementi;
        }
        System.out.println(Arrays.toString(arr));
        ArraydaPozitifSayilariToplama(arr);

    }

    public static void ArraydaPozitifSayilariToplama(int[] arr){

        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>0){
                toplam+=arr[i];
            }
        }
        System.out.println("Arraydaki pozitiv sayilar toplami:" + toplam);

    }

}
