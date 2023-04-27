package Day05_If_Else_Statements;

import java.util.Scanner;

public class C08_Ifstatemanets {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir karakter gir");

        char karakter = scanner.next().charAt(0);

        if ('A'<= karakter && karakter <= 'Z'){
            System.out.println("buyuk harf");
        }
        else{
            System.out.println("kucuk harf");
        }


    }
}
