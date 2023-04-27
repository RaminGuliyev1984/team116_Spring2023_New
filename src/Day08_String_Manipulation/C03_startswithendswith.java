package Day08_String_Manipulation;

public class C03_startswithendswith {
    public static void main(String[] args) {
        String str = "Java cok guzeldir";

        System.out.println(str.startsWith("java")); //false
        System.out.println(str.startsWith("Java"));  // true

        System.out.println(str.startsWith(str));//true

        System.out.println(str.startsWith(""));//true

        System.out.println("--------------------");

        System.out.println(str.endsWith("a"));
        System.out.println(str.endsWith("guzeldir"));
        System.out.println(str.endsWith("dir"));

        System.out.println(str.endsWith("Java cok guzeldir"));
        System.out.println(str.length());//17 cumlenin uzunlugunu yazar

        System.out.println(str.substring(str.length() - 3));
         System.out.println(str.substring(str.length() - 3));
    }
}
