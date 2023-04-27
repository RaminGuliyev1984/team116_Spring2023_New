package Day7_Switch_Statement_String_manupulation;

public class C09_Equalsignorecase {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 ="JAVA";
        String str4 ="JavA";
        String str5 = "jAvA";
        String str6 = new String ("Java");

        System.out.println(str1.equalsIgnoreCase(str3)); //true Java JAVA yani buyuk kucukyune bakmaz true yapar
        System.out.println(str4.equalsIgnoreCase(str5)); //true
        System.out.println(str6.equalsIgnoreCase(str2)); //true
    }
}
