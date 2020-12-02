package ba.unsa.etf.rpr;

public class Predmet {
    String nazivPredmeta;
    Profesor profesor;
    int brojCasovaUSemestru;
    public Predmet(String nazivPredmeta, Profesor profesor, int brojCasovaUSemestru ){
        this.nazivPredmeta = nazivPredmeta; this.profesor = profesor; this.brojCasovaUSemestru = brojCasovaUSemestru;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public int getBrojCasovaUSemestru() {
        return brojCasovaUSemestru;
    }

    public void setBrojCasovaUSemestru(int brojCasovaUSemestru) {
        this.brojCasovaUSemestru = brojCasovaUSemestru;
    }
}
