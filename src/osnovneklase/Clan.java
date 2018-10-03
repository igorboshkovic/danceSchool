
package osnovneklase;

import java.time.LocalDate;

public class Clan {
    
    private int id;
    private int brojClanske;
    private String imeIPrezime;
//    private String prezime;
    private String brTel;
    private String facebookNalog;
    private String email;
    private TipClana tipClana;
    private LocalDate datumDolaska;

    public Clan(String ime) {
        this.imeIPrezime = ime;

    }

    public Clan(String ime, String brTel) {
        this.imeIPrezime = ime;
        this.brTel = brTel;
    }
        
    public Clan(String ime, String brTel, String facebookNalog, String email, TipClana tipClana, LocalDate datumDolaska) {
        this.imeIPrezime = ime;
        this.brTel = brTel;
        this.facebookNalog = facebookNalog;
        this.email = email;
        this.tipClana = tipClana;
        this.datumDolaska = datumDolaska;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setIme(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getBrTel() {
        return brTel;
    }

    public void setBrTel(String brTel) {
        this.brTel = brTel;
    }

    public String getFacebookNalog() {
        return facebookNalog;
    }

    public void setFacebookNalog(String facebookNalog) {
        this.facebookNalog = facebookNalog;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipClana getTipClana() {
        return tipClana;
    }

    public void setTipClana(TipClana tipClana) {
        this.tipClana = tipClana;
    }

    public LocalDate getDatumDolaska() {
        return datumDolaska;
    }

    public void setDatumDolaska(LocalDate datumDolaska) {
        this.datumDolaska = datumDolaska;
    }

    @Override
    public String toString() {
        return "Clan{" + "imeIPrezime=" + imeIPrezime +
                ", brTel=" + brTel + ", facebookNalog=" +
                facebookNalog + ", email=" + email + ", tipClana=" + 
                tipClana + ", datumDolaska=" + datumDolaska + '}';
    }

    
    
    
}
