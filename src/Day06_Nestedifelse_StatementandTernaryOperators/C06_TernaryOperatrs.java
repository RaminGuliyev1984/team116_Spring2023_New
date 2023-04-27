package Day06_Nestedifelse_StatementandTernaryOperators;

public class C06_TernaryOperatrs {
    public static void main(String[] args) {

        int sayi = 10;

        sayi = sayi > 10  ? 2 * sayi : sayi +10;

        System.out.println(sayi);

        sayi++;

        System.out.println(sayi % 2 ==0 ? 2 * sayi: "tek sayi" );

    }
}
