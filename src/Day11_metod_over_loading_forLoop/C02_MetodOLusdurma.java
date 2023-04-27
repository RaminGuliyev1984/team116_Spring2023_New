package Day11_metod_over_loading_forLoop;

import java.util.Scanner;

public class C02_MetodOLusdurma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println(pozitifBolenSayiBul(sayi));

        int ptbs = pozitifBolenSayiBul(sayi);

        if (ptbs == 2) {
            System.out.println("verilen sayi asal");
        }else{
            System.out.println("verilen sayi asal degil");
        }

    }

    public static int pozitifBolenSayiBul(int sayi){
int sayac = 0;
        for (int i = 1; i <=sayi ; i++) {
            if(sayi%i==0){
                sayac++;
            }
        }
return sayac;
    }
}
