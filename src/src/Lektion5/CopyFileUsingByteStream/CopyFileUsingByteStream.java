package Lektion5.CopyFileUsingByteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CopyFileUsingByteStream {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Type input file: ");
        String input = keyboard.nextLine();
        System.out.println("Type output file: ");
        String output = keyboard.nextLine();

        try {
            copyFile(input, output);
        } catch (IOException e) {
            System.out.println("Faulty input parameters.");
        }
    }

    public static void copyFile(String input, String output) throws IOException {
        File in = new File(input);
        File out = new File(output);

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(in);
            fileOutputStream = new FileOutputStream(out);
            fileInputStream.transferTo(fileOutputStream);
        }
        finally {
            if(fileInputStream != null) fileInputStream.close();
            if(fileOutputStream != null) fileOutputStream.close();
        }
    }
}
