package Day08_String_Manipulation;

public class C09_Replace {
    public static void main(String[] args) {

        String str = "Javasiz olmaz";
        System.out.println(str.replace('J', 'H'));
        System.out.println(str.replace("a", ""));

        System.out.println(str.replace("Javasiz", "X"));

        System.out.println(str.replace("v", "yayayayaya"));
        System.out.println(str.replace("va", "juviba"));
        System.out.println(str);                                                       //Javasiz olmaz


        str = str.replace("va", "juviba");

        String str1 = " Java hayat cok degisik";
        System.out.println(str1.replace(" ", ""));
        System.out.println("str1="+str1);
        str1=str1.replace(" ","");
        System.out.println("str1=" +str1);

        String str2 = " Java hayatdir be";

    }
}
