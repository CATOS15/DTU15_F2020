package Lektion6.Tennis;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        TennisSpiller wozniacki = new TennisSpiller("Caroline Wozniacki");
        TennisSpiller williams = new TennisSpiller("Serena Williams");

        wozniacki.setModstander(williams);
        williams.setModstander(wozniacki);
        wozniacki.modtagBold();
        wozniacki.start();
        williams.start();

        Thread.sleep(100000);

        wozniacki.join();
        williams.join();
    }
}
