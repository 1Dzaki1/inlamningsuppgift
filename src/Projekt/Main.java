package Projekt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Skriv in text och skriv 'stop' för att avsluta:");

        Reader data = new Reader();
        String line;

        while (true) {
            line = scan.nextLine();
            if (line.equalsIgnoreCase("stop")) {
                break;
            }
            data.avlasare(line);
        }

        System.out.println("\nInlagd text:\n" + data.getInputText());
        System.out.println("Antal tecken: " + data.getAntalTecken());
        System.out.println("Antal rader (exklusive raden med 'stop'): " + data.getAntalRader());

        scan.close();
    }

}


