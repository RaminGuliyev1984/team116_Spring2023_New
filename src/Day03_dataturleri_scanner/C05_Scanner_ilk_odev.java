package Day03_dataturleri_scanner;

import java.util.Scanner;

public class C05_Scanner_ilk_odev {
    public static void main(String[] args) {

        //Kullanicidan bir sayi alin ve sayinin karesini yazdirin?
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin");

        double girilenSayi = scan.nextDouble();
        System.out.println("Girilen sayinin karesi:" + girilenSayi*girilenSayi);


    }
}
