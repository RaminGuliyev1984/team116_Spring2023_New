package Day08_String_Manipulation;

public class C011_Replaceall {
    public static void main(String[] args) {

        String str = "SDS SASALKSSLK  KLSK SSSK S LSK LSS ";

        System.out.println(str);

        str.replaceAll("\\d","");
        System.out.println(str);

        str=str.replaceAll("\\W","");
        System.out.println(str);


        str=str.replaceAll(" ","5");
        System.out.println(str);



    }
}
