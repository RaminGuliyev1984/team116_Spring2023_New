package Day19_KeywoardPassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        double fiyat =200;

        indirimYap10(fiyat);

        System.out.println("indirimli fiyat yazdirdikdan sonra;" +fiyat);

    }

    public static void indirimYap10(double aaa){

        aaa = aaa * 90/100;

        System.out.println("%10 indirimli fiyat:" +aaa);
    }
}
