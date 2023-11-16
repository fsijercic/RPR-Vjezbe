package ba.unsa.etf.rpr.Lab3.Z1;

import java.util.Objects;

public class FiksniBroj extends TelefonskiBroj {

    private Grad grad;
    private String broj;

    public FiksniBroj(Grad grad, String broj) {
        if(grad==null) throw new BrojException("Pozivni broj za telefon nije ispravan");
        this.grad = grad;
        this.broj = broj;
    }

    @Override
    public String ispisi() {
        if(grad!=null&&broj!=null)
            return grad.getPozivniBroj()+"/"+broj;
        return null;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGrad(), getBroj());
    }

    public Grad getGrad() {
        return grad;
    }

    public String getBroj() {
        return broj;
    }


}
