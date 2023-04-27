package Day08_String_Manipulation;

public class C06_lastIndex {
    public static void main(String[] args) {
        String str = "Java cok faydali";
                    //0123456789
        System.out.println(str.lastIndexOf("a")); //13

        System.out.println(str.lastIndexOf("a", 10));
        System.out.println(str.lastIndexOf("a", 12));

        System.out.println(str.indexOf("a"));
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("a", 2));

        System.out.println(str.indexOf("o"));           //6
        System.out.println(str.lastIndexOf("o"));    //6

        System.out.println(str.indexOf("cok"));           //5
        System.out.println(str.lastIndexOf("cok"));

        System.out.println(str.indexOf("k"));              //7
        System.out.println(str.lastIndexOf("k"));

        String str1 = "Java cok kolay";
        String str2 = "got";

        int basdanIndex = str1.indexOf(str2);
        int sondanIndex = str1.lastIndexOf(str2);

        if(str1.indexOf(str2)==-1){
            System.out.println("aradiginiz kelime hic kullanilmamais");
        } else if (basdanIndex==sondanIndex) {
            System.out.println(" Aradiginiz kelime birden fazla");
        }else{
            System.out.println("Aradiginiz kelime 1-den fazla kullanilmis");
        }


    }
}
