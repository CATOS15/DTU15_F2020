package Lektion6.Tennis;

public class TennisSpiller extends Thread {
    private boolean harBold = false;
    private TennisSpiller modstander = null;
    private String name;

    public TennisSpiller(String name) {
        this.name = name;
    }
    public void run() {
        while(true) {
            Sleeper.sleepRandom(2);
            if(harBold) {
                harBold = false;
                System.out.println("" + name + " returnerer bolden.");
                modstander.modtagBold();
            }
        }
    }

    public void modtagBold() {
        harBold = true;
    }

    public void setModstander(TennisSpiller modstander) {
        this.modstander = modstander;
    }
}
