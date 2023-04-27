package Day7_Switch_Statement_String_manupulation;

public class C06_CharAt {
    public static void main(String[] args) {

        String str = "Gun kecdikdce Goteborg hahaZ";

        System.out.println(str.charAt(4));
        System.out.println(str.charAt(8));

        System.out.println(str.charAt(20)); // verilen index sinirlarin disinda

        System.out.println(str.length());   // 27

        int uzunluk = str.length();
        System.out.println(str.charAt(uzunluk - 1));

        // sondan ikinci harfi yazdirin

        System.out.println(str.charAt(uzunluk - 2));

        System.out.println(str.charAt(str.length()-3));


    }
}
