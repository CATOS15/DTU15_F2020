package Lektion5.Serializable;

import java.io.*;
public class SerializeDemo {

    public static void main(String [] args) {
        Complex c = new Complex(1.0, 2.0);

        try {
            FileOutputStream fileOut =
                    new FileOutputStream("C:\\Users\\s190614\\complex.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(c);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved to file Users\\you\\complex.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}