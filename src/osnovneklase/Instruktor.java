
package osnovneklase;

import java.time.LocalDate;
import java.time.Period;

public class Instruktor extends Clan{
    
    private double koeficijent;
    
    public Instruktor(int id, String ime) {
        super(ime);
    }

    public Instruktor(int id, String ime, String brTel) {
        super(ime, brTel);
    }

    public Instruktor(int id, String ime, String brTel, String facebookNalog, String email, LocalDate datumDolaska) {
        super(ime, brTel, facebookNalog, email, TipClana.INSTRUKTOR, datumDolaska);
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
