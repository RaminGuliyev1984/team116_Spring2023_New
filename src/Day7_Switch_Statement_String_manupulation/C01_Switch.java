package Day7_Switch_Statement_String_manupulation;

import java.util.Scanner;

public class C01_Switch {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen yazi girin");

        char ilkHarf = scan.next().toUpperCase().charAt(0);

        switch (ilkHarf){

            case 'o':
                System.out.println("Ocak");
            case 'S':
                System.out.println("Suabt");
            case 'G':
                System.out.println("Mart");
            case 'J':
                System.out.println("Nisan");
            case 'K':
                System.out.println("Mayis");
            case '0':
                System.out.println("Haziran");
            case 'Q':
                System.out.println("Temmuz");
            case 'A':
                System.out.println("Agustos");
            case 'N':
                System.out.println("Eylul");
            case 'M':
                System.out.println("Ekim");
            case 'Z':
                System.out.println("Kasim,Aralik");
            default:
                System.out.println("Gecersiz harf");
        }


        if (ilkHarf == 'o' || ilkHarf =='0') System.out.println("Ocak");
        if(ilkHarf == 'S')
        if(ilkHarf == 'G')
        if(ilkHarf == 'J')
        if(ilkHarf == 'K')
        if(ilkHarf == 'O')
        if(ilkHarf == 'Q')
        if(ilkHarf == 'A')
        if(ilkHarf == 'N')
        if(ilkHarf == 'M')
        if(ilkHarf == 'Z');

    }
}
