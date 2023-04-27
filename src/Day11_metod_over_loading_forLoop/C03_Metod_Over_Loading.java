package Day11_metod_over_loading_forLoop;

public class C03_Metod_Over_Loading {
    public static void main(String[] args) {


              topla(5,8);
              topla('a','b');
              topla(3.4,5);
               topla(5,2.1);

    }

    public static void topla(int sayi1,int sayi2){
        System.out.println("iki int toplami:" +(sayi1+sayi2));
    }
    public static void topla(int a,int b,int c){
        System.out.println("uc int toplami:" +(a+b+c));
    }
    public static void topla(char char1,char char2 ){
        System.out.println("iki char'in toplami:" +(char1+char2));
    }
    public static void topla(int sayi1,double sayi2){
        System.out.println("int ve double'in toplami:" +(sayi1+sayi2));
    }
    public static void topla(double sayi1,int sayi2){
        System.out.println("double ve int'in toplami:" +(sayi1+sayi2));
    }
}
