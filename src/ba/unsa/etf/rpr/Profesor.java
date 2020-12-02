package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Profesor {
    String imeIPrezime;
    ArrayList<Predmet> predmeti;
    int brojCasova;
    public Profesor(String imeIPrezime, ArrayList<Predmet> predmeti, int brojCasova){
        this.imeIPrezime = imeIPrezime; this.predmeti=predmeti; this.brojCasova = brojCasova;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public int getBrojCasova() {
        return brojCasova;
    }

    public void setBrojCasova(int brojCasova) {
        this.brojCasova = brojCasova;
    }
    void dodajPredmetProfesoru(Predmet p){
        this.brojCasova += p.getBrojCasovaUSemestru();
    }
}
