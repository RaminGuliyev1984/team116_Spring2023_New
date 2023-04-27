package Day11_metod_over_loading_forLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);


        int sayi = 7;

           while(sayi%3 !=0){
               System.out.println("Lutfen bir sayi gir");
                sayi= scan.nextInt();

               if (sayi %3==0) {
                   System.out.println("sayi 3 tam bolunur");

               }else {
                   System.out.println("Sayi 3 tam bolunemiyir");

               }
           }

    }
}
