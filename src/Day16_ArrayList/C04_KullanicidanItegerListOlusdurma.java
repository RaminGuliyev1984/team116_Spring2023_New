package Day16_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullanicidanItegerListOlusdurma {
    public static void main(String[] args) {

    }

    public static List<Integer>kullanicidanSsayiAlarakListeOlusduranMetod(){

        Scanner scanner =new Scanner(System.in);

        int girilenSayi = 4;
        List<Integer> sayilar = new ArrayList<>();

        while (girilenSayi!=0){
            System.out.println("Lutfen gir");

       if (girilenSayi!=0){
           sayilar.add(girilenSayi);
            }

        }
         return sayilar;
    }
}
