package Lektion5.ReadDir;

import java.io.File;

public class ReadDir {

    public static String[] readdir(String catalogueName) {
        File file = null;
        String[] paths = null;

        try{
            // create new file object
            file = new File(catalogueName);

            // array of files and directory
            paths = file.list();
        }catch(Exception e){
            // if any error occurs
            e.printStackTrace();
        }

        return paths;
    }
}
