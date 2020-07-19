
package main.multimedia_nikola_simonovic;

/**
 *
 * @author Hp
 */
public class Radio {
    private double fmFrequency;
    private int amFrequency;
    private char band;
    
    public Radio (double customfmFrequency, int customamFrequency, char customband){
     this.fmFrequency = customfmFrequency;
     this.amFrequency = customamFrequency;
     this.band = customband;
    }

    public double getFmFrequency() {
        return fmFrequency;
    }

    public void setFmFrequency(double fmFrequency) {
        this.fmFrequency = fmFrequency;
    }

    public int getAmFrequency() {
        return amFrequency;
    }

    public void setAmFrequency(int amFrequency) {
        this.amFrequency = amFrequency;
    }

    public char getBand() {
        return band;
    }

    public void setBand(char band) {
        this.band = band;
    }
    public void printAttributes(){
    System.out.println("Fm Frequency " + this.fmFrequency);
    System.out.println("Am Frequency " + this.amFrequency);
    System.out.println("Band " + this.band);
    }
    
    
}
