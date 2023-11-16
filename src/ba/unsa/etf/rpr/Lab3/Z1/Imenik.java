package ba.unsa.etf.rpr.Lab3.Z1;
import java.util.*;

public class Imenik {

    private Map<String,TelefonskiBroj> brojevi;

    public Imenik(Map<String, TelefonskiBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public Map<String, TelefonskiBroj> getBrojevi() {
        return brojevi;
    }

    public void setBrojevi(Map<String, TelefonskiBroj> brojevi) {
        this.brojevi = brojevi;
    }

    public void dodaj(String ime,TelefonskiBroj broj){
        this.brojevi.put(ime,broj);
    }

    public String dajBroj(String ime){
        TelefonskiBroj broj=brojevi.get(ime);
        if(broj!=null)
            return broj.ispisi();
        return null;
    }

    public String dajIme(TelefonskiBroj broj){

        for(Map.Entry<String,TelefonskiBroj> xy:this.brojevi.entrySet()){
            if(xy.getValue().ispisi().equals(broj.ispisi()))
                return xy.getKey();
        }

        return null;
    }

    public String naSlovo(char s){
        StringBuilder imena= new StringBuilder();
        int br=1;

        for(Map.Entry<String,TelefonskiBroj> xy:this.brojevi.entrySet())
            if(xy.getKey().startsWith(String.valueOf(s))){
                imena.append(br++)
                        .append(". ")
                        .append(xy.getKey()).append(" - ")
                        .append(xy.getValue().ispisi())
                        .append(System.lineSeparator());
            }

        return imena.toString();
    }

    public Set<String> izGrada(Grad g){
        Set<String> spisak=new TreeSet<String>();

        for(Map.Entry<String,TelefonskiBroj> xy:this.brojevi.entrySet())
            if(xy.getValue() instanceof FiksniBroj && ((FiksniBroj) xy.getValue()).getGrad().equals(g)){
                spisak.add(xy.getKey());
            }

        return spisak;
    }

    public Set<TelefonskiBroj> izGradaBrojevi(Grad g){
        Set<TelefonskiBroj> spisak=new TreeSet<TelefonskiBroj>(new Comparator<TelefonskiBroj>() {
            @Override
            public int compare(TelefonskiBroj o1, TelefonskiBroj o2) {
                return o1.ispisi().compareTo(o2.ispisi());
            }
        });

        for(var xy:this.brojevi.entrySet())
            if(xy.getValue() instanceof TelefonskiBroj && ((FiksniBroj) xy.getValue()).getGrad().equals(g))
                spisak.add(xy.getValue());

        return spisak;
    }





}
