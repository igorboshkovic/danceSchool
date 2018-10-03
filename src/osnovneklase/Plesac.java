
package osnovneklase;

import java.time.LocalDate;

public class Plesac extends Clan {
    
    public Plesac(int id, String ime, String prezime) {
        super(ime);
    }

    public Plesac(int id, String ime, String prezime, String brTel) {
        super(ime, brTel);
    }

    public Plesac(int id, String ime, String prezime, String brTel, String facebookNalog, String email, LocalDate datumDolaska) {
        super(ime, brTel, facebookNalog, email, TipClana.PLESAC, datumDolaska);
    }
    
}
