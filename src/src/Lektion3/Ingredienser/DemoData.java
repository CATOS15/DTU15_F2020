package Lektion3.Ingredienser;

import java.util.ArrayList;
import java.util.List;

public class DemoData implements IData {
    private class Ingredient {
        int id;
        String name;
        int amount;

        Ingredient(int id, String name, int amount) {
            this.id = id;
            this.name = name;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Ingredient " + id + ": " + name + "(" + amount +")";
        }
    }

    private List<Ingredient> ingredients;

    public DemoData() {
        ingredients = new ArrayList<>();
        ingredients.add(new Ingredient(1, "flormelis", 60));
        ingredients.add(new Ingredient(2, "mel", 240));
        ingredients.add(new Ingredient(3, "smør", 185));
    }

    public String[] getAllIngredients() {
        String[] result = new String[ingredients.size()];
        int i = 0;
        for (Ingredient ingredient:
             ingredients) {
            result[i++] = ingredient.toString();
        }
        return result;
    } //returnerer alle ingredienser i en String-array
    public String getIngredientName(int id) throws IngredientNotFoundException {
        for (Ingredient ingredient:
             ingredients) {
            if(ingredient.id == id)
                return ingredient.name;
        }
        throw new IngredientNotFoundException();
    }; //returnerer navn for ingrediens
    public int getIngredientAmount(int id) throws IngredientNotFoundException {
        for (Ingredient ingredient:
                ingredients) {
            if(ingredient.id == id)
                return ingredient.amount;
        }
        throw new IngredientNotFoundException();
    }; //returnerer mængde for ingrediens
    public void setIngredientName(int id, String name) throws IngredientNotFoundException {
        for (Ingredient ingredient:
                ingredients) {
            if(ingredient.id == id)
                ingredient.name = name;
        }
        throw new IngredientNotFoundException();
    }; //ændrer navn for ingrediens til angivet værdi i 'name'
    public void setIngredientAmount(int id, int amount) throws IngredientNotFoundException {
        for (Ingredient ingredient:
                ingredients) {
            if(ingredient.id == id)
                ingredient.amount = amount;
        }
        throw new IngredientNotFoundException();
    }; //ændrer mængde for ingrediens til angivet værdi i 'amount'
    public void createIngredient(int id, String name, int amount){
        Ingredient ingredient = new Ingredient(id, name, amount);
        ingredients.add(ingredient);
    }; //opretter en ny ingrediens med de angivne værdier
}
