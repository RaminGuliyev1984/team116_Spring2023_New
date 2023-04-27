package Day11_metod_over_loading_forLoop;

import java.util.Scanner;

public class C06_While_Loop {
    public static void main(String[] args) {


        Scanner input= new Scanner(System.in);
        int sayac = 0;
        int toplam = 0;
        int sayi = 0;

        while (toplam < 500){
            System.out.println("toplanmak icin bir sayi giriniz:");
            sayi = input.nextInt();

            sayac++;
            toplam+=sayi;
        }

        System.out.println(sayac+ "adet sayinin toplami" +toplam);

    }
}
