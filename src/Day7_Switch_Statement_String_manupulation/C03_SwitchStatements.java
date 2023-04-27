package Day7_Switch_Statement_String_manupulation;

import java.util.Scanner;

public class C03_SwitchStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir rakam alip,
        // rakami yaziyla yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen yazi girin");

        int rakam = scan.next().toUpperCase().charAt(0);

        switch (rakam){

            case 1:
                System.out.println("Bir");
                break;
            case 2:
                System.out.println("Iki");
                break;
            case 3:
                System.out.println("Uc");
                break;
            case 4:
                System.out.println("Dord");
                break;
            case 5:
                System.out.println("Bes");
                break;
            case 6:
                System.out.println("Alti");
                break;
            case 7:
                System.out.println("Yeddi");
                break;
            case 8:
                System.out.println("Sekkiz");
                break;
            case 9:
                System.out.println("Dokkuz");
                break;
            default:
                System.out.println("Gecerli bir rakam giriniz");
        }

    }
}
