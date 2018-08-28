package osnovneklase;

import java.time.LocalDate;

public class Plesac extends Clan{

    public Plesac(int id, String ime, String prezime) {
        super(id, ime, prezime);
    }

    public Plesac(int id, String ime, String prezime, String brTel) {
        super(id, ime, prezime, brTel);
    }

    public Plesac(int id, String ime, String prezime, String brTel, String facebookNalog, String email, LocalDate datumDolaska) {
        super(id, ime, prezime, brTel, facebookNalog, email,TipClana.PLESAC, datumDolaska);
    }
    
    
}
