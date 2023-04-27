package Day06_Nestedifelse_StatementandTernaryOperators;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

        //Kullanicidan bir tamsayi alin.
        // Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirinSayi pozitif degilse,
        // 3 basamakli veya 3 basamakli degil

        //seceneklerinden uygun olani yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir sayi alin");
        int sayi = scanner.nextInt();

        System.out.println(sayi>0
                                   ?
                                   sayi % 2 ==0 ? "cift wsayi": "cift sayi degil"
                                   :
                                    sayi >= 999 && sayi <= -100 ? " uc basamaki" : "uc basamakli degil"
                                     );

    }
}
