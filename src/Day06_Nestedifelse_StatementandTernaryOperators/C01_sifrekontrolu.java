package Day06_Nestedifelse_StatementandTernaryOperators;

import java.util.Scanner;

public class C01_sifrekontrolu {
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");
       int sayi = scanner.nextInt();

       boolean sifrebasariliMi = true;
       if(sayi< 1000 || sayi> 9999){
           System.out.println("sayi 4 basamakli olmali");
           sifrebasariliMi = false;
       }
            if(sayi% 3 !=0){
                System.out.println("sayi 3 ile bolunebilmelidir");
                sifrebasariliMi= false;
            }
          if(sayi % 5 ==0){
        System.out.println("sayi 5 bolunememelidir");
            sifrebasariliMi=false;
}

          if((sayi%10)%2 ==0){
              System.out.println("sayi 5 bolunmememlidir");
              sifrebasariliMi = false;
          }

           if(sifrebasariliMi){
               System.out.println("MUkemmel Sayi");
           }




    }
}
