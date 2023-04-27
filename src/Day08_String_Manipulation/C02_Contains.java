package Day08_String_Manipulation;

public class C02_Contains {
    public static void main(String[] args) {

        String str = "Java ileher sey cok guzel";

        System.out.println(str.contains("Java")); //true //  case sensitive
        System.out.println(str.contains("JAVA"));  //false

        String arananKelime = "Cok";
        System.out.println(str.contains("arananKelime"));

        String olmayanaKelime = "Deniz";
        System.out.println(str.contains("olmayanKelime"));
        System.out.println(str.contains("a"));
        System.out.println(str.contains(""));
        System.out.println(str.contains(" "));

    }
}
