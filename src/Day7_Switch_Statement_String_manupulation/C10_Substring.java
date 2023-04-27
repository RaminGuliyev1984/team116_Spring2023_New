package Day7_Switch_Statement_String_manupulation;

public class C10_Substring {
    public static void main(String[] args) {

        String str = "Java candir";
        //sedece candir kismimnni yazdir

        System.out.println(str.substring(5)); //Candir
        System.out.println(str.substring(2)); // va Candir

        System.out.println(str.substring(10)); //r
        System.out.println(str.substring(11)); //

      //  System.out.println(str.substring(12)); //error
        System.out.println(str.substring(0,4));
        System.out.println(str.substring(3,4));
        System.out.println(str.substring(1,2));

        System.out.println(str.substring(5,5)); //hiclik
        System.out.println(str.substring(8,5)); // hata verir, error

        String str2 = "eSRa";
        str2 = str2.substring(0,1).toUpperCase()+ str2.substring(1).toLowerCase();
        System.out.println(str2);


    }
}
