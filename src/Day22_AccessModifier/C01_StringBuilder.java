package Day22_AccessModifier;

public class C01_StringBuilder {
    public static void main(String[] args) {

       // StringBuilder sb1 = "Java";

        Object obj1 = "Java";
        Object obj2 = 23;
        Object obj3 = true;

        StringBuilder sb2 =new StringBuilder("Java Candir");

        System.out.println(sb2);

        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append(", buna inanmayan mi var ?");

        System.out.println(sb2);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.trimToSize();
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());
    }
}
