package soucet_a_soucin;
import java.util.Scanner;

public class Soucet_a_soucin {
    public static void main(String[] args) {
        System.out.println("Zadejte dvě čísla pro souČet a součin");
        Scanner scanner = new Scanner(System.in);
        int prvni = scanner.nextInt();
        int druhy = scanner.nextInt();
        System.out.println("Součet je: ");
        System.out.println(prvni+druhy);
        System.out.println("Součin je: ");
        System.out.println(prvni*druhy);
    }
    
}
