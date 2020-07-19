
package main.multimedia_nikola_simonovic;


public class Television {
    private int Volume;
    private int currentProgram;
    private boolean turnOn;
    
    public Television (int Volume, int currentProgram, boolean turnON) {
        this.turnOn = turnOn;
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
        this.turnOn = turnOn;
    }
    
    public void printAttributes() {
    System.out.println("Turn On " + this.turnOn);
    System.out.println("Volume " + this.Volume);
    System.out.println("Current Program" + this.currentProgram);
    
    }
}
