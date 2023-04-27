package Day11_metod_over_loading_forLoop;

public class C04_Metod_Over_Loading {
    public static void main(String[] args) {

          topla(4,5);
          topla('a','b');
          topla(3.2f,5.4f);



    }

      public static void topla(double sayi1,double sayi2){
          System.out.println("Iki double'in toplami:" +(sayi1+sayi2));
      }

      public static void topla(int sayi1,float sayi2){
          System.out.println("Int ve float 'intoplami:" +(sayi1+sayi2));
      }
     static void topla(float sayi1,float sayi2){
        System.out.println("iki float'in toplami:" +(sayi1+sayi2));
    }

}
