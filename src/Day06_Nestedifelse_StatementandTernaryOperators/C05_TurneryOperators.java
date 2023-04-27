package Day06_Nestedifelse_StatementandTernaryOperators;

public class C05_TurneryOperators {
    public static void main(String[] args) {

        int sayi = 14;

        // sayinin cift tek oldugunu yaziniz

        if(sayi%2 == 0){
            System.out.println("verilen sayi cift sayidir");
        }else {
            System.out.println("vreilen sayi tekdir");
        }

        System.out.println(sayi%2==0 ? "verilen sayi cift sayidir": "verilen sayi tek sayidir");


    }
}
