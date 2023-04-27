package Day7_Switch_Statement_String_manupulation;

import java.util.Locale;

public class C05_TolowercaseToUpperCase {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());

        System.out.println(str);

        str = str.toUpperCase();
        System.out.println(str);   //JAVA CANDIR

        System.out.println(str.toLowerCase()); //java candir

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println();

        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);

        String str2 = "Kimse beni aramiyor";

        System.out.println(str2.toUpperCase(Locale.forLanguageTag("Tr")));



    }
}
