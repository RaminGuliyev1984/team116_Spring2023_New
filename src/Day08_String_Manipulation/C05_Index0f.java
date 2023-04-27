package Day08_String_Manipulation;

public class C05_Index0f {
    public static void main(String[] args) {

        String str = "Java en iyisi";
                    //0123456789
        System.out.println(str.indexOf("e"));  //5
        System.out.println(str.indexOf("a"));  //1
        System.out.println(str.indexOf("en"));  //5
        System.out.println(str.indexOf("yi"));   //9
        System.out.println(str.indexOf("iyisi")); //8
        System.out.println(str.indexOf("O")); //-1
        System.out.println(str.indexOf("en guzeli"));//-1

        System.out.println(str.indexOf("a", 1)); //1
        System.out.println(str.indexOf("a", 2)); //3

        System.out.println(str.indexOf("i")); //8
        System.out.println(str.indexOf("i", 5)); //8
        System.out.println(str.indexOf("i", 6)); //8
        System.out.println(str.indexOf("i", 9));//10


        if(str.indexOf("en")==-1){
            System.out.println(" aradiginiz cumeleni icermir");
        }else {
            int birinciKelimeIndex = str.indexOf("en");
            if (str.indexOf("en",birinciKelimeIndex +1)==-1){
                System.out.println("aradiginiz kelime bir kelime");
            }else{
                System.out.println("aradiginiz kelime birden cok");
            }

        }



    }
}
