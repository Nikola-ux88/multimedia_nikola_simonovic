
package main.multimedia_nikola_simonovic;


public class Television {
    private int Volume;
    private int currentProgram;
    private boolean turnOn;
    
    public Television (int Volume, int currentProgram, boolean customturnON) {
        this.turnOn = customturnON;
        this.Volume = Volume;
        this.currentProgram = currentProgram;
        
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int Volume) {
        this.Volume = Volume;
    }

    public int getCurrentProgram() {
        return currentProgram;
    }

    public void setCurrentProgram(int currentProgram) {
        this.currentProgram = currentProgram;
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public void setTurnOn(boolean turnOn) {
        this.turnOn = customturnON;
    }
    
    public void printAttributes() {
    System.out.println("Turn On " + this.turnOn);
    System.out.println("Volume " + this.Volume);
    System.out.println("Current Program " + this.currentProgram);
    
    }
    
    public void ChangeChannel(int newChannel){
        this.currentProgram(this.currentProgram() + newChannel);
    }
}
