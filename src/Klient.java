import java.util.ArrayList;

public class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<Wydarzenie>();

    public Klient(String nazwisko, String imię) {
        this.nazwisko = nazwisko;
        this.imię = imię;
    }

    public Klient(String nazwisko, String imię, String email) {
        this.nazwisko = nazwisko;
        this.imię = imię;
        this.email = email;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    public void dodajRezerwację(Wydarzenie wydarzenie){
        listaRezerwacji.add(wydarzenie);
    }

    public void  wyświetlRezerwacje(){
        for (int i = 0; i < listaRezerwacji.size(); i++) {
            System.out.println(listaRezerwacji.get(i));
        }
    }
    public void anulujRezerwację(Wydarzenie wydarzenie){
        listaRezerwacji.remove(wydarzenie);
    }
}
