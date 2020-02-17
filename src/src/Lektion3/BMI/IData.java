package Lektion3.BMI;

public interface IData {
    String getNavn(String cpr) throws DataException;

    double getVaegt(String cpr) throws DataException;

    double getHoejde(String cpr) throws DataException;
}