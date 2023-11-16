package ba.unsa.etf.rpr.Lab3.Z1;

public enum Grad {
    TRAVNIK("030"),
    ORASJE("031"),
    ZENICA("032"),
    SARAJEVO("033"),
    LIVNO("034"),
    TUZLA("035"),
    MOSTAR("036"),
    BIHAC("037"),
    GORAZDE("038"),
    SIROKI_BRIJEG("039");

    private String pozivniBroj;

    Grad(String pozivniBroj) {
        this.pozivniBroj = pozivniBroj;
    }

    public String getPozivniBroj() {
        return pozivniBroj;
    }

    public static Grad izPozivnog(String pozivni){
        for(Grad g:Grad.values()){
            if(pozivni.equals(g.getPozivniBroj())){
                return g;
            }
        }
        return null;
    }

}
