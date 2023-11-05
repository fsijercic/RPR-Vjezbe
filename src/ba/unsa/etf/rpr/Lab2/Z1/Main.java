package ba.unsa.etf.rpr.Lab2.Z1;

public class Main {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Upotreba: java Main <operacija> <broj>");
            return;
        }

        String operation = args[0];
        double number = Double.parseDouble(args[1]);

        if (operation.equals("sin")) {
            double result = SinusiFaktorijel.Sinus(number);
            System.out.println("Sinus broja " + number + " je " + result);
        } else if (operation.equals("faktorijel")) {
            long result = SinusiFaktorijel.Faktorijel((int)number);
            System.out.println("Faktorijel broja " + (int) number + " je " + result);
        } else {
            System.out.println("Nepodržana operacija. Koristite 'sin' ili 'faktorijel'.");
        }
    }
}
