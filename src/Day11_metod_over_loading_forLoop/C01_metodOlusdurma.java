package Day11_metod_over_loading_forLoop;

public class C01_metodOlusdurma {
    public static void main(String[] args) {




        substringYazdir("Java Candir",2,6);
    }

    public static void substringYazdir(String metin,int basIndex,int bitIndex){

        if(basIndex > bitIndex){
            System.out.println("Baslangic index bitis index buyuk olamaz");
        } else if (bitIndex > (metin.length()-1)) {
            System.out.println("Istediginiz index metin disinda");
        }else {

            for (int i = basIndex; i < bitIndex; i++) {
                System.out.print(metin.charAt(i));
            }

        }

    }

}
