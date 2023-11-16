package ba.unsa.etf.rpr.Lab3.Z1;

import java.util.Objects;

public class MobilniBroj extends TelefonskiBroj{
    private int mobilnaMreza;
    private String broj;

    public MobilniBroj(int mobilnaMreza, String broj) {
        this.mobilnaMreza = mobilnaMreza;
        this.broj = broj;
    }

    public int getMobilnaMreza() {
        return mobilnaMreza;
    }

    public String getBroj() {
        return broj;
    }

    @Override
    public String ispisi(){
        if(broj!=null)
            return "0"+getMobilnaMreza()+"/"+getBroj();
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMobilnaMreza(), getBroj());
    }
}
