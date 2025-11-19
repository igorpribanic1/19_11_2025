public class MojaIznimka extends Exception {
    private String korisnik;

    public MojaIznimka(String message, String korisnik) {
        super(message);
        setKorisnik(korisnik);
    }

    public String getKorisnik() {
        return korisnik;
    }

    public void setKorisnik(String korisnik) {
        this.korisnik = korisnik;
    }
}
