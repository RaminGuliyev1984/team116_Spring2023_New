package Day06_Nestedifelse_StatementandTernaryOperators;

import java.util.Scanner;

public class C08_TernaryNested {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan notunu alin // 50 veya daha buyukse ”Sinifi Gectin”,
        // 50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen ntunuzu giriniz");
        double not = scanner.nextDouble();

        System.out.println(not >= 50 ? "Sinifi gecdin": "MAlesef kaldin fuu");


    }
}
