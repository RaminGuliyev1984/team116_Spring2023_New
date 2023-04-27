package Day7_Switch_Statement_String_manupulation;

public class C08_Equals {
    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 ="JAVA";
        String str4 ="JavA";
        String str5 = "jAvA";
        String str6 = new String ("Java");

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3));  //false
        System.out.println(str4.equals(str5));  //false
        System.out.println(str2.equals(str6)); //true

        System.out.println(str1==str2); //true
        System.out.println(str1==str3); //false
        System.out.println(str1==str6); //false
        System.out.println(str1.equals(str6)); //true equals kullanmamiz gerek.


    }
}
