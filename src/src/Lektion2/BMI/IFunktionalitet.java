package Lektion2.BMI;


public interface IFunktionalitet {
    // beregn BMI udfra personens CPR-nr
    double getBMI(String cpr);
    // returnér en tekst der beskriver BMI intervallet
    String getTextualBMI(String cpr);
    // returnér person navn udfra CPR-nr
    String getNavn(String cpr);
}
