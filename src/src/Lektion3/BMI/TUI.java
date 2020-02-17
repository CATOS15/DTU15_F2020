package Lektion3.BMI;

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
        try {
            System.out.println(funktionalitet.getTextualBMI(input));
        } catch (DataException e) {
            System.out.println("CPR-nummeret existerer ikke.");
        }
    }
}
