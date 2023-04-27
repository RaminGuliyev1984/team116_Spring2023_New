import java.util.Scanner;

public class dikdorkgen {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kenar1,kenar2;

        System.out.print("kenar1 girin");
        kenar1= scan.nextInt();
        System.out.print("kenar2 girin");
        kenar2= scan.nextInt();

        System.out.println("Dikdortgenin alani="+ (kenar1*kenar2));
        System.out.println("Dikdortgenin cevresi="+ (2* (kenar1+kenar2)));








    }
}
