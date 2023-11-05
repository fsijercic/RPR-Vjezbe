package ba.unsa.etf.rpr.Lab2.Z1;

public class SinusiFaktorijel {

    public static double Sinus(double n){
        return Math.sin(n);
    }

    public static long Faktorijel(int n){
        if(n==0){
            return 1;
        }
        return n*Faktorijel(n-1);
    }


}
