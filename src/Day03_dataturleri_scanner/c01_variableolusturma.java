package Day03_dataturleri_scanner;

public class c01_variableolusturma {
    public static void main(String[] args) {

        int sayi;
        sayi = 20;
        System.out.println(sayi); //20
        System.out.println("hello world"); //hello world
        // int sayi = 30;  declaration sadece bir kere yapilabilir.

        sayi = 30;
        sayi= 2*sayi+20;
        System.out.println(sayi);

        byte ogrenciyasi1 = 10;//endogru kullanim bu olur.hafiza kullanimini optimize etdirmek icin bu yeterlidir.
        long oyrenciyasi2 = 17;
        short oyrenciyasi3 = 20;
        int ogrenciyasi4 = 40;

        double sayi1 = 3.12345672738499745631;
        System.out.println(sayi1);

        // double vergulden sonra 16 hane yazdirir.ama cok kicik sayilar
        // indigi icin ondalikli sayinin sonunda hatalar olabilir.
        //   15 / 3  = 4.999999999999   5.0     5.000000000000000001

        float sayi2 = 3.323232323232323232f;
        // float sayi tanimladigimizda doubledan farkli oldugunu belirtmek icin
        // sonuna f veya F  yazmak zorundayiz.
        System.out.println(sayi2);

        //tam sayilar icin int, ondalikli sayilar icin double kullaniriz.

    }
}
