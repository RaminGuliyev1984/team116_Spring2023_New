package Day7_Switch_Statement_String_manupulation;

import java.util.Scanner;

public class C_02_Switch_Statements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen Ay numarasi giriniz");

        int ayNo= scan.nextInt();

        switch (ayNo){

            case 12:
            case 1:
            case 2:
                System.out.println("Kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("IlkBahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Son Bahar");
                break;

                default:
                System.out.println("Gecersiz harf");
        }


    }
}
