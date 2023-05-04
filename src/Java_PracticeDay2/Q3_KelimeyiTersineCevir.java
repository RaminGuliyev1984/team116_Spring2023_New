package Java_PracticeDay2;

import java.util.Scanner;

public class Q3_KelimeyiTersineCevir {




    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir cumle bir kelime gir:");

        String kelime = scanner.nextLine();

        System.out.println(tersCevir(kelime));

    }
    public static String tersCevir(String word){

        String temp = "";

        for (int i = word.length(); i >=1 ; i--) {

            temp += word.charAt(i-1);
        }
        String reverseWord = temp;

        return reverseWord;
    }

}
