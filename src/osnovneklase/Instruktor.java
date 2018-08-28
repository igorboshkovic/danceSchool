
package osnovneklase;

import java.time.LocalDate;
import java.time.Period;

public class Instruktor extends Clan{
    
    private double koeficijent;
    
    public Instruktor(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    public Instruktor(int id, String ime, String prezime, String brTel) {
        super(id, ime, prezime, brTel);
    }

    public Instruktor(int id, String ime, String prezime, String brTel, String facebookNalog, String email, LocalDate datumDolaska) {
        super(id, ime, prezime, brTel, facebookNalog, email, TipClana.INSTRUKTOR, datumDolaska);
    }

    public double getKoeficijent() {
        return koeficijent;
    }

    public void setKoeficijent(double koeficijent) {
        this.koeficijent = koeficijent;
    }
    
    public double izracunajKoeficijent(LocalDate datumIzracunavanja){
        Period intervalPeriod = Period.between(this.getDatumDolaska(), datumIzracunavanja);
        int godine = intervalPeriod.getYears();
        double koef = (godine* 0.05)+1;
        this.koeficijent = koef;
        return koef;
    }
}
