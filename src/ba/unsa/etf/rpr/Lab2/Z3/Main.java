package ba.unsa.etf.rpr.Lab2.Z3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static double calculateStandardDeviation(List<Double> numbers) {
        int size = numbers.size();

        if (size < 2)
            return 0.0;

        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0.0;

        for (double number : numbers) {
            double difference = number - mean;
            sumSquaredDifferences += difference * difference;
        }

        double variance = sumSquaredDifferences / size;
        return Math.sqrt(variance);
    }

    private static double calculateMean(List<Double> numbers) {
        double sum = 0.0;

        for (double number : numbers)
            sum += number;

        return sum / numbers.size();
    }

    public static void main(String[] args) {

        Scanner ulaz=new Scanner(System.in);
        List<Double> lista= new ArrayList<>();

        System.out.println("Unesite element niza");
        for(;;){
            var input = ulaz.nextLine();

            if(input.equalsIgnoreCase("stop"))
                break;

            try{
                Double number=Double.parseDouble(input);
                lista.add(number);

            }catch(Exception e){
                System.out.println("Pogrešan unos, ponovite:");
            }
        }

        if(lista.isEmpty()){
            System.out.println("Niste unijeli niti jedan element :)");
        }else{

            double min=lista.get(0);
            double max=lista.get(0);

            for(var element:lista){
                if(element>max)
                    max=element;
                if(element<min)
                    min=element;
            }

            Double mean=calculateMean(lista);
            Double std_dev=calculateStandardDeviation(lista);

            System.out.println("Maksimalni element: "+max);
            System.out.println("Minimalni element: "+min);
            System.out.println("Srednja vrijednost: "+mean);
            System.out.println("Standardna devijacija: "+std_dev);
        }
    }
}
