import java.sql.SQLOutput;
import java.util.Scanner;

public class sade {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Isim giriniz lutfen");
        String isim = scan.nextLine();


        System.out.println("Soyisim giriniz lutfen");
        String soyisim = scan.nextLine();


        System.out.println("Meslek giriniz  lutfen");
        String meslek = scan.nextLine();

        System.out.println("Takim giriniz  lutfen");
        String takim = scan.nextLine();


        System.out.println("Adress  giriniz  lutfen");
        String adress = scan.nextLine();

        System.out.println("isim" + isim + soyisim+ "soyisim" +meslek+"meslek" +takim+ "takim"+adress+"adress");






    }
}
