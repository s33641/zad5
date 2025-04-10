import java.util.ArrayList;

public class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzen = new ArrayList<Wydarzenie>();
    private ArrayList<Klient> listaKlientow = new ArrayList<Klient>();

    public void dodajWydarzenie(Wydarzenie w) {
        listaWydarzen.add(w);
    }
    public void dodajWydarzenie(String nazwa, double cena) {
        Wydarzenie w = new Wydarzenie(nazwa, cena);
        listaWydarzen.add(w);
    }
    public void dodajKlienta(Klient k) {
        listaKlientow.add(k);
    }
    public void dodajKlienta(String imie, String nazwisko) {
        Klient k = new Klient(imie, nazwisko);
        listaKlientow.add(k);
    }
    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie){
        this.listaWydarzen.add(wydarzenie);
        this.listaKlientow.add(klient);
        klient.dodajRezerwację(wydarzenie);
        wydarzenie.zarezerwujMiejsce();

    }
    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzen) {
            if (w.getNazwa().equals(nazwa)) {
                return w;
            }
        }
        return null;
    }
    public Klient znajdzKlienta(String imie, String nazwisko) {
        for (Klient k : listaKlientow) {
            if(k.getNazwisko().equals(nazwisko)) {
                return k;
            }
        }
        return null;
    }
    public void zmiezCeneWydarzenia(String nazwa, double nowaCena){
        for (Wydarzenie w : listaWydarzen) {
            if(w.getNazwa().equals(nazwa)) {
                w.setCena(nowaCena);
            }
        }
    }
}
