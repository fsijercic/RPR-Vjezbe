package ba.unsa.etf.rpr.Lab1.Z1;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner ulaz = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double x = ulaz.nextDouble();

        System.out.println("Unesite drugi broj: ");
        double y = ulaz.nextDouble();

        System.out.println("Prvi uneseni broj je " + x);
        System.out.println("Drugi uneseni broj je " + y);
        ulaz.close();
    }
}
