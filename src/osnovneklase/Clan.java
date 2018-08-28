package osnovneklase;

import java.time.LocalDate;

public class Clan {
    
    private int id;
    private String ime;
    private String prezime;
    private String brTel;
    private String facebookNalog;
    private String email;
    private TipClana tipClana;
    private LocalDate datumDolaska;
    
    public Clan(int id, String ime, String prezime){
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
    }

    public Clan(int id, String ime, String prezime, String brTel) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
        this.brTel = brTel;
    }
    
    

    public Clan(int id, String ime, String prezime, String brTel, String facebookNalog, String email, TipClana tipClana, LocalDate datumDolaska) {
        this.id = id;
        this.ime = ime;
        this.prezime = prezime;
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

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
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
            
            
    
}
