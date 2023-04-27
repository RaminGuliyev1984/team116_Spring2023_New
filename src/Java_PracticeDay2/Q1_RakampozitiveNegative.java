package Java_PracticeDay2;

import java.util.Scanner;

public class Q1_RakampozitiveNegative {
    public static void main(String[] args) {

        Scanner cicek = new Scanner(System.in);
        System.out.println("Lutfemn bir sayi gir:");

        int sayi = cicek.nextInt();

        if(sayi>=0) {

            if (sayi < 10) System.out.println("Rakam");

            else System.out.println("Pozitiv sayi");
        }
            else System.out.println("nagativ sayi");


        System.out.println("*****************.2.************");

        if(sayi>=0  && sayi < 10) System.out.println("Rakam");

            else  if(sayi >= 10) System.out.println("Pozitiv sayi");

        else System.out.println("Negativ sayi");

        System.out.println("*****************Ternary************");

        boolean sart1 = sayi>0;
        boolean sart2 = sayi<10;

        String sonuc =(sart1) ? (sart2 ? "Rakam" : "Pozitiv sayi"): "Negativ sayi";

        System.out.println(sonuc);

    }
}









