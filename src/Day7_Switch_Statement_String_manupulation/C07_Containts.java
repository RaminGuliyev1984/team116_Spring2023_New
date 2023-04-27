package Day7_Switch_Statement_String_manupulation;

public class C07_Containts {
    public static void main(String[] args) {

        String str = "Java ogren goteborg al,hihahi";

        System.out.println(str.contains("a"));
        System.out.println(str.contains("l"));

        System.out.println(str.contains("Ogren")); //false
        System.out.println(str.contains("ogren"));  // true

        System.out.println(str.contains("e")); // charsequence lazim
    }
}
