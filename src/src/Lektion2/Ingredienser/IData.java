package Lektion2.Ingredienser;

public interface IData {
    String[] getAllIngredients(); //returnerer alle ingredienser i en String-array
    String getIngredientName(int id); //returnerer navn for ingrediens
    int getIngredientAmount(int id); //returnerer mængde for ingrediens
    void setIngredientName(int id, String name); //ændrer navn for ingrediens til angivet værdi i 'name'
    void setIngredientAmount(int id, int amount); //ændrer mængde for ingrediens til angivet værdi i 'amount'
    void createIngredient(int id, String name, int amount); //opretter en ny ingrediens med de angivne værdier
}

