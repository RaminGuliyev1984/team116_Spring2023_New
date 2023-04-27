package Day05_If_Else_Statements;

import java.util.Scanner;

public class C09_ifstatement {
    public static void main(String[] args) {


        //Soru 5- Kullanicidan bir harf isteyin,
        //        girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //        yoksa girilen harfi yazdirin


        Scanner scanner = new Scanner(System.in);

        System.out.println("bir karakter gir");

        char karakter = scanner.next().charAt(0);

        if('a' <= karakter  && karakter <= 'z'){
            System.out.println("yeni hali" +Character.toUpperCase(karakter));
        }else{
            System.out.println("Girilen karakter" +karakter);
        }



    }

}
