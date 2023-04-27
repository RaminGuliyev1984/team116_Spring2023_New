package Day08_String_Manipulation;

import java.util.Scanner;

public class C04_string_manipulations {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail gir,cabukolgot");
        String email = scan.next();

        if (!email.contains("o")) {
            System.out.println("Gecersiz mail");
        }

        if (!email.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        }

        if (!email.endsWith("@gmail.com")) {
            System.out.println("mailde yazi hatasi var");
        }


        if (!email.contains("o")) {
            System.out.println("Gecersiz mail");
        }else if (!email.contains("@gmail.com")) {
        }else if (!email.endsWith("@gmail.com")) {
                System.out.println("mailde yazi hatasi var");
            }

        }
    }
