package ba.unsa.etf.rpr.Lab1.Z2;
import java.util.Scanner;

public class Main {

    public static int sumaCifara(int n){
        int sum=0;
        while(n!=0){
            sum=sum+(n%10);
            n=n/10;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner ulaz =new Scanner(System.in);

        System.out.println("Unesite broj n:");
        int n=ulaz.nextInt();

        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                System.out.print(i+" ");
            }
        }

        ulaz.close();

    }
}
