
package osnovneklase;

public class RasporedTermina {
    
    private String prviTermin;
    private String vremePrvogTermina;
    private String drugiTermin;
    private String vremeDrugogTermina;

    public RasporedTermina(String prviTermin, String vremePrvogTermina) {
        this.prviTermin = prviTermin;
        this.vremePrvogTermina = vremePrvogTermina;
    }

    public RasporedTermina(String prviTermin, String vremePrvogTermina, String drugiTermin, String vremeDrugogTermina) {
        this.prviTermin = prviTermin;
        this.vremePrvogTermina = vremePrvogTermina;
        this.drugiTermin = drugiTermin;
        this.vremeDrugogTermina = vremeDrugogTermina;
    }

    public String getPrviTermin() {
        return prviTermin;
    }

    public void setPrviTermin(String prviTermin) {
        this.prviTermin = prviTermin;
    }

    public String getVremePrvogTermina() {
        return vremePrvogTermina;
    }

    public void setVremePrvogTermina(String vremePrvogTermina) {
        this.vremePrvogTermina = vremePrvogTermina;
    }

    public String getDrugiTermin() {
        return drugiTermin;
    }

    public void setDrugiTermin(String drugiTermin) {
        this.drugiTermin = drugiTermin;
    }

    public String getVremeDrugogTermina() {
        return vremeDrugogTermina;
    }

    public void setVremeDrugogTermina(String vremeDrugogTermina) {
        this.vremeDrugogTermina = vremeDrugogTermina;
    }

    @Override
    public String toString() {
        return "RasporedTermina{" + "prviTermin=" + prviTermin + ", vremePrvogTermina=" 
                + vremePrvogTermina + ", drugiTermin=" + drugiTermin + ", vremeDrugogTermina=" + vremeDrugogTermina + '}';
    }
    
}
