package Java_PracticeDay2;

import java.util.Scanner;

public class Q2_HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 2 tane tam sayi girin:");

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("Islem turunu secin: \n\t1: Toplama\n\t2: Cikarma\n\t3: Carpma\n\t4: Bolme\n\t5");

        int islem = scan.nextInt();

        if(islem==1) System.out.println(a+b);
        else if (islem==2) System.out.println(a-b);
        else if (islem==3) System.out.println(a*b);
        else if (islem==4) {
            if(b==0) System.out.println(" 0 a bulunme tanimsizidir");
          else  System.out.println(a/b);}

        else System.out.println("Yanlisw girdin,lutfen tekrar gir");


        System.out.println("********** Switch***********8**********");

        switch(islem){
            case 1:
                System.out.println(a+ "+" +b+"=" +(a+b));break;
            case 2:
                System.out.println(a+ "-" +b+"=" +(a-b));break;
            case 3:
                System.out.println(a+ "*" +b+"=" +(a*b));break;
            case 4: if(b==0) System.out.println("0 ra bolum tanimsizidir");
            else System.out.println(a+ "/" +b+"=" +(a/b));break;


            default:
                System.out.println("Hatali giris");
        }


        System.out.println("***********SWTC CASE***************");

           char isaret = scan.next().charAt(0);

        switch(isaret){
            case '+': System.out.println(a+ "+" +b+"=" +(a+b));break;

            case '-': System.out.println(a+ "-" +b+"=" +(a-b));break;

            case '*': System.out.println(a+ "*" +b+"=" +(a*b));break;

            case '/': if(b==0) System.out.println("0 ra bolum tanimsizidir");
            else System.out.println(a+ "/" +b+"=" +(a/b));break;

            default:
                System.out.println("Hatali giris");
        }


    }
}
