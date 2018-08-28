
package osnovneklase;

import java.util.ArrayList;

public class Grupa {
    
    private String nazivGrupe;
    private Kurs kurs;
    private Instruktor muskiInstruktor;
    private Instruktor zenskiInstruktor;
    private String facebookLink;
    private ArrayList<Plesac> clanoviGrupe;

    public Grupa(String nazivGrupe, Kurs kurs, Instruktor muskiInstruktor, Instruktor zenskiInstruktor) {
        this.nazivGrupe = nazivGrupe;
        this.kurs = kurs;
        this.muskiInstruktor = muskiInstruktor;
        this.zenskiInstruktor = zenskiInstruktor;
    }
    
    
}
