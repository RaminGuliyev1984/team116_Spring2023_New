package Day05_If_Else_Statements;

import java.util.Scanner;

public class C05_IfStatements {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ucgenn kenairni gir");

        double kenar1= scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if(kenar1 == kenar2 && kenar2== kenar3 && kenar1 >0){
            System.out.println("Girilen deyerler uc kenar olusduru");
        }



    }
}
