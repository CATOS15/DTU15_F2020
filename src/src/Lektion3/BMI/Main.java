package Lektion3.BMI;

public class Main {
    public static void main(String[] args) {
        IData data = new Data();
        IFunktionalitet funktionalitet = new Funktionalitet(data);
        IUI ui = new TUI(funktionalitet);
        ui.dialog();
    }
}
