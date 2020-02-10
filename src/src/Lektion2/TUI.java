package Lektion2;

import java.util.Scanner;

public class TUI implements IUI {
    IData data;
    Scanner keyboard = new Scanner(System.in);

    public TUI(IData data){
        this.data = data;
    }

    public void showMenu(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("== MENU ==");
        System.out.println("1. Show all ingredients");
        System.out.println("2. Show one ingredient");
        System.out.println("3. Change ingredient");
        System.out.println("4. Create new ingredient");
        System.out.println("5. Exit");

        System.out.print("Make your choice: ");
        int choice = safeInt();
        switch (choice) {
            case 1:
                showIngredients();
                break;
            case 2:
                showIngredient();
                break;
            case 3:
                changeIngredient();
                break;
            case 4:
                createIngredient();
                break;
            case 5:
                //??
                break;
            default:
                System.out.println("Please make another choice");
                break;
        }
    }; //viser menu med valgmuligheder

    public void showIngredients(){
        String[] allIngredients = data.getAllIngredients();
        System.out.println("List of all ingredients:");
        for(int i = 0; i < allIngredients.length; i++)
            System.out.println(allIngredients[i]);
    }; //viser alle ingredienser

    public void showIngredient(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of the ingredient: ");
        int id = keyboard.nextInt();
        String ingredientName = data.getIngredientName(id);
        int amount = data.getIngredientAmount(id);
        if(ingredientName != null) {
            System.out.println("Ingredient " + id + " is: " + ingredientName);
            System.out.println("Amount: " + amount);
        }
    }; //lader brugeren vælge ingrediens ud fra id og viser denne

    public void changeIngredient(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of the ingredient: ");
        int id = keyboard.nextInt();
        boolean done = false;
        while(!done) {
            System.out.print("Which property do you want to change? Choose (N)ame or (A)mount: ");
            String choice = keyboard.nextLine();
            if (choice.equals("N") || choice.equals("n")) {
                System.out.println("Ingredient: " + data.getIngredientName(id));
                System.out.print("Enter new name: ");
                String name = keyboard.nextLine();
                data.setIngredientName(id, name);
                done = true;
            } else if (choice.equals("A") || choice.equals("a")) {
                System.out.println("Ingredient: " + data.getIngredientName(id) + " Amount: " + data.getIngredientAmount(id));
                System.out.print("Enter new amount: ");
                int amount = safeInt();
                data.setIngredientAmount(id, amount);
                done = true;
            } else System.out.println("Please re-enter your choice");
        }
    }; //lader brugeren vælge ingrediens ud fra id, dernæst vælge et felt og så indtaste en ny værdi for denne

    public void createIngredient(){
        System.out.println("Creating new ingredient...");
        boolean done = false;
        int id = -1;
        while(!done) {
            System.out.print("Enter ingredient id: ");
            id = keyboard.nextInt();
            if (data.getIngredientName(id) != null)
                System.out.println("Id already exists");
            else done = true;
        }
        if(id == -1) return;
        System.out.print("Enter new name: ");
        String name = keyboard.next();
        System.out.print("Enter new amount: ");
        int amount = safeInt();
        data.createIngredient(id, name, amount);
        System.out.println("Ingredient created");
    }; //lader brugeren indtaste værdier til en ny ingrediens

    private int safeInt() {
        boolean done = false;
        int result = 0;
        while(!done){
            String next = keyboard.next();
            try {
                result = Integer.parseInt(next);
            } catch (Exception e) {
                System.out.println("Not an integer. Try again.");
            } finally {
                done = true;
            }
        }
        return result;
    }
}