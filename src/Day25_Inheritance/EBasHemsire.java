package Day25_Inheritance;

public class EBasHemsire extends DHemsire{
EBasHemsire(){
    System.out.println(adres);

    adres = "Cankaya";
    System.out.println(gorev);
    System.out.println("Genel gorev: " + super.gorev);
     isim = "Ayse";
    System.out.println(this.isim);
    System.out.println(super.isim);
    this.maas();
    super.maas();
    nobet();
    this.nobet();
    super.nobet();

    ozelSigorta();
    this.ozelSigorta();
    super.ozelSigorta();

    tazminat();
    this.tazminat();
    //super.tazminat; Inheritance chailda yoksa parente bakilir
    //amma parent da yoksa chailda bakilmaz ,CTE olur
}
    String gorev ="Bas Hemsire";
    String adres = "Adres belirltilmedi";

    public void maas(){
        System.out.println("Bas He,sire maasi: " +3000);
    }

    public void nobet(){
        System.out.println("Bashemsire ayda 3 gun nobet tutar");
    }
public void tazminat(){
    System.out.println("Hemsireler tazminat alir");
}
    public static void main(String[] args) {
        EBasHemsire bh1= new EBasHemsire();
        System.out.println(bh1.adres);

    }
}
