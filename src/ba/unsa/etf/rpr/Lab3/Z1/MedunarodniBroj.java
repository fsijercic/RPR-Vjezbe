package ba.unsa.etf.rpr.Lab3.Z1;

import java.util.Objects;

public class MedunarodniBroj extends TelefonskiBroj{
    private String drzava;
    private String broj;

    public MedunarodniBroj(String drzava, String broj) {
        this.drzava = drzava;
        this.broj = broj;
    }

    public String getDrzava() {
        return drzava;
    }

    public String getBroj() {
        return broj;
    }

    @Override
    public String ispisi() {

        if(drzava!=null&&broj!=null)
            return '+'+getDrzava()+getBroj();
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDrzava(), getBroj());
    }
}
