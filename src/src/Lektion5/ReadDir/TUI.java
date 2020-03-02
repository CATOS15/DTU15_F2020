package Lektion5.ReadDir;

import java.util.Scanner;

public class TUI {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Type catalogue name: ");
        String filename = keyboard.nextLine();
        String[] result = null;

        try {
            result = ReadDir.readdir(filename);
        } catch(Exception e) {
            System.out.println("Faulty input.");
        }
        if(result != null) {
            System.out.println("Result:");
            // for each name in the path array
            for(String path:result)
            {
                // prints filename and directory name
                System.out.println(path);
            }
            System.out.println("===");
        }
    }
}
