import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Läs in en sfärs radie och beräkna
        //   - Volymen = (4 * pi * r*r*r) / 3
        //   - Arean   = 4 * pi * r*r

        Scanner input = new Scanner(System.in);
        System.out.print("Ange sfärens radie: ");
        double radie = input.nextDouble();

        double volume = (4 * Math.PI * radie * radie * radie) / 3;
        double area = 4 * Math.PI * radie * radie;

        System.out.println("En sfär med radien " + radie + " har:");
        System.out.println("Volymen: " + volume);
        System.out.println("Arean: " + area);

    }
}