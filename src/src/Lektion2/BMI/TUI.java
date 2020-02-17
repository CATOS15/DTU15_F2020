package Lektion2.BMI;

import java.util.Scanner;

public class TUI implements IUI {
    IFunktionalitet funktionalitet;

    TUI(IFunktionalitet funktionalitet) {
        this.funktionalitet = funktionalitet;
    }

    public void dialog() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Indtast cpr: ");
        String input = keyboard.nextLine();
        System.out.println("Personens BMI:");
        System.out.println(funktionalitet.getTextualBMI(input));
    }
}
