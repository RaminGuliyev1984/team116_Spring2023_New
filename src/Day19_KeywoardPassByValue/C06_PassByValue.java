package Day19_KeywoardPassByValue;

public class C06_PassByValue {

    public static void main(String[] args) {

      double fiyat = 200;

System.out.println(indirimYap10(fiyat));

System.out.println("indirimli fiyat yazdikdan sonra:"+fiyat);


fiyat = indirimYap10(fiyat);
System.out.println("indirimli fiyat yazdikdan sonra:"+fiyat);

        System.out.println(indirimYap10(500));
}
public static double indirimYap10(double fiyat){

    fiyat =fiyat * 90/100;

    return fiyat;
}
}
