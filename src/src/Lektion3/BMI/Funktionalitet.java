package Lektion3.BMI;

public class Funktionalitet implements IFunktionalitet {
    IData data;

    Funktionalitet(IData data) {
        this.data = data;
    }

    public double getBMI(String cpr) throws DataException {
        return data.getVaegt(cpr) / (data.getHoejde(cpr) * data.getHoejde(cpr));
    }
    // returnér en tekst der beskriver BMI intervallet
    public String getTextualBMI(String cpr) throws DataException {
        return data.getNavn(cpr) + " has " + getBMI(cpr) + " as BMI";
    }
    // returnér person navn udfra CPR-nr
    public String getNavn(String cpr) throws DataException {
        return data.getNavn(cpr);
    }
}
