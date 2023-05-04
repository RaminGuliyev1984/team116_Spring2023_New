package Day25_Inheritance;

public class FServisHemsiresi extends DHemsire{
    String str = "Servis Hemsiresi";
    int numara = 20;

    public static void main(String[] args) {
        FServisHemsiresi sh1 = new FServisHemsiresi();
        sh1.staticOlmayanMethod();


    }
    public void staticOlmayanMethod(){
        nobet();
        this.nobet();
        super.nobet();

        maas();
        this.maas();
        super.maas();

        calismaGunu();
        this.calismaGunu();
        //super.calismaGunu;  // CTE

        String str = "Method";

        System.out.println(str);
        System.out.println(this.str);
        System.out.println(super.str);

        System.out.println(numara);
        System.out.println(this.numara);
        System.out.println(super.numara);

        System.out.println(izindeMi);
        System.out.println(this.izindeMi);
        System.out.println(super.izindeMi);

        char ilkHarf = 'J';
        System.out.println(ilkHarf);
       // System.out.println(this.ilkHarf);
       // System.out.println(super.ilkHarf);
    }
    public void nobet(){
        System.out.println("Servis hemsiresi haftada 3 gun nobet yapar");
    }
    public void calismaGunu(){
        System.out.println("Servis hemsireleri haftada 4 gun calisir");
    }
}


