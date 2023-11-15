package ba.unsa.etf.rpr.Lab2.Z2;

import java.util.Objects;

public class Osoba {
    private String ime;
    private String prezime;

    public String getIme(){return ime;}

    public void setIme(String ime){this.ime=ime;}

    public String getPrezime(){return prezime;}

    public void setPrezime(String prezime){this.prezime=prezime;}

    public Osoba(String ime, String prezime){
        this.ime=new String(ime);
        this.prezime= new String(prezime);
    }

    @Override
    public String toString(){
        return "Osoba{+" +
                "ime='"+ime + '\''+
                ", prezime='" + prezime+'\''+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba)) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(getIme(), osoba.getIme()) && Objects.equals(getPrezime(), osoba.getPrezime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIme(), getPrezime());
    }
}
