
package osnovneklase;

public class Kurs {
    
    private String nazivKursa;
    private String nivoKursa;
    private String terminiKursa;
    private String trajanjeKursa;

    public Kurs(String nazivKursa) {
        this.nazivKursa = nazivKursa;
    }

    public Kurs(String nazivKursa, String nivoKursa) {
        this.nazivKursa = nazivKursa;
        this.nivoKursa = nivoKursa;
    }

    public Kurs(String nazivKursa, String nivoKursa, String trajanjeKursa) {
        this.nazivKursa = nazivKursa;
        this.nivoKursa = nivoKursa;
        this.trajanjeKursa = trajanjeKursa;
    }

    public String getNazivKursa() {
        return nazivKursa;
    }

    public void setNazivKursa(String nazivKursa) {
        this.nazivKursa = nazivKursa;
    }

    public String getNivoKursa() {
        return nivoKursa;
    }

    public void setNivoKursa(String nivoKursa) {
        this.nivoKursa = nivoKursa;
    }

    public String getTrajanjeKursa() {
        return trajanjeKursa;
    }

    public void setTrajanjeKursa(String trajanjeKursa) {
        this.trajanjeKursa = trajanjeKursa;
    }
}


