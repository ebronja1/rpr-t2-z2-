package ba.unsa.etf.rpr;

public class Osoba {
    private String ime, prezime;

    Osoba(String ime1, String prezime1) {
        ime = ime1;
        prezime = prezime1;
    }
    public String toString() {
        return ime + " " + prezime;
    }
}
