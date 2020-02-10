package Lektion2;

public interface IUI {
    void showMenu(); //viser menu med valgmuligheder
    void showIngredients(); //viser alle ingredienser
    void showIngredient(); //lader brugeren vælge ingrediens ud fra id og viser denne
    void changeIngredient(); //lader brugeren vælge ingrediens ud fra id, dernæst vælge et felt og så indtaste en ny værdi for denne
    void createIngredient(); //lader brugeren indtaste værdier til en ny ingrediens
}
