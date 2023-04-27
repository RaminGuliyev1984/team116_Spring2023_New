package Day08_String_Manipulation;

public class C07_isempty {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.isEmpty());   //false

        System.out.println(str.isBlank());

        str = "     ";
        System.out.println(str.isEmpty()); //false
        System.out.println(str.isBlank()); //true

        str = "";
        System.out.println(str.isEmpty());  //true
        System.out.println(str.isBlank());  //true

        System.out.println(str.length());
    }
}
