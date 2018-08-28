package osnovneklase;

import java.util.ArrayList;

public class Grupa {
    private String nazivGrupe;
    private Kurs kurs;
    private Instruktor muskiInstruktor;
    private Instruktor zenskiInstruktor;
    private ArrayList<Plesac> clanoviGrupe;
    private String facebookLink;

    public Grupa(String nazivGrupe, Kurs kurs) {
        this.nazivGrupe = nazivGrupe;
        this.kurs = kurs;
    }

    public Grupa(String nazivGrupe, Kurs kurs, Instruktor muskiInstruktor, Instruktor zenskiInstruktor) {
        this.nazivGrupe = nazivGrupe;
        this.kurs = kurs;
        this.muskiInstruktor = muskiInstruktor;
        this.zenskiInstruktor = zenskiInstruktor;
    }

    public String getNazivGrupe() {
        return nazivGrupe;
    }

    public void setNazivGrupe(String nazivGrupe) {
        this.nazivGrupe = nazivGrupe;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }

    public Instruktor getMuskiInstruktor() {
        return muskiInstruktor;
    }

    public void setMuskiInstruktor(Instruktor muskiInstruktor) {
        this.muskiInstruktor = muskiInstruktor;
    }

    public Instruktor getZenskiInstruktor() {
        return zenskiInstruktor;
    }

    public void setZenskiInstruktor(Instruktor zenskiInstruktor) {
        this.zenskiInstruktor = zenskiInstruktor;
    }

    public ArrayList<Plesac> getClanoviGrupe() {
        return clanoviGrupe;
    }

    public void setClanoviGrupe(ArrayList<Plesac> clanoviGrupe) {
        this.clanoviGrupe = clanoviGrupe;
    }

    public String getFacebookLink() {
        return facebookLink;
    }

    public void setFacebookLink(String facebookLink) {
        this.facebookLink = facebookLink;
    }
    
    
           
}
