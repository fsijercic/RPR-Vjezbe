package ba.unsa.etf.rpr.Lab2.Z2;

public class Osoba {
    private String ime;
    private String prezime;

    public Osoba(String ime, String prezime){
        ime=new String(ime);
        prezime= new String(prezime);
    }

    public String toString(){
        return ime + " " + prezime;
    }

}
