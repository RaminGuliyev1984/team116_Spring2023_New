package Day03_dataturleri_scanner;

public class Non_primitive_data_turleri {
    public static void main(String[] args) {

        String isim = "Ramin Guliyev";

        String ilkharf = "L";
        char ilkharf2 ='m';

        // tek bir karakter atayacaksak ikisinide ataya bilirik.

        System.out.println(ilkharf.toLowerCase());
        System.out.println(ilkharf2);

        //primitive data turundeki variable'lar sadece deger tasiyabilir.
        //non-primitive data turundeki variable'larin hem deger hemde metodlari olur.

        String metin="sdsdsdsdsdsd"+
                "dsdsdsdsdsdsd"+
                "dsdwdsdwdsdsd"+
                "dsdsdsd;nskds;ldaslj;akldjakldjalck"+
                "sasasasas;asasasasa;sasasasasas;asasasa;sas";

        String not = "not";
        String Not ="buyuk harf ile baslamasi tavsiye edeilmez,amma Java kabul eder";
        String nOT = "bir kere deklare edilen variable tekrar deklare edilemez";
        String noT = "ama isimler farkli yazildigi icin  java bunlari farkli variable kabul eder";

        // int int=10; kabul etmez, String double = "28"; kabul etmez
        // camel case : kucuk harfle baslar, sonraki kelimeler bitisik yazilir ve ilk harfi buyuk olur.
        // ilkHarf, ogrenciNumarasi, notDefteri,okulCantasi ve.b
        // naming convention- isimlendirme gelenegi

    }
}
