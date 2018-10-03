
package osnovneklase;

import java.util.ArrayList;

public class Grupa {
    
    private int id;
    private String nazivGrupe;
    private Kurs kurs;
    private Instruktor muskiInstruktor;
    private Instruktor zenskiInstruktor;
    private String facebookLink;
    private ArrayList<Plesac> clanoviGrupe;

    public Grupa(int id, String nazivGrupe, Kurs kurs, Instruktor muskiInstruktor, Instruktor zenskiInstruktor, String facebookLink) {
        this.id = id;
        this.nazivGrupe = nazivGrupe;
        this.kurs = kurs;
        this.muskiInstruktor = muskiInstruktor;
        this.zenskiInstruktor = zenskiInstruktor;
        this.facebookLink = facebookLink;
    }

    @Override
    public String toString() {
        return nazivGrupe;
    }
    
    
}
