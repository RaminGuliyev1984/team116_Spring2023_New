package Day03_dataturleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
         // 1 adim: Scaner objesi olusdurun
        Scanner scan = new Scanner(System.in);

        // 2 Adim: Kullaniciya ne istediginizi soyleyin
        System.out.println("Lutfen Isminizi giriniz");

        // 3 Adim: girilen bilgiyi icine kayabileceyimiz bir variable olusturun.
         // olusdurdugumuz scanner objesi ile uygun methodu kullanarak bilgiyi alin.

        String kullaniciIsmi = scan.next();

        System.out.println("girilen isim:" + kullaniciIsmi);



    }
}
