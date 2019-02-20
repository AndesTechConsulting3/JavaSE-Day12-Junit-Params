package org.andestech.learning.rfb18.g3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

    public static List<Object[]> getData(String fileName)
    {

        ArrayList<Object[]> list = new ArrayList<>();
        Integer[] arr;

        try(FileInputStream fis = new FileInputStream(fileName)) {

            Scanner scanner = new Scanner(fis);
            scanner.useDelimiter("\r\n");
            while (scanner.hasNext())
            {
               String dataString = scanner.next();
               // System.out.println(scanner.next());
               if(dataString.startsWith("#") || dataString.isEmpty() || dataString.contains(" ")) continue;

               arr = new Integer[3];
               String[] stArray = dataString.split(",");
               for (int i=0; i<3; i++)
               {
                   arr[i] = Integer.parseInt(stArray[i]);

               }

                list.add(arr);
                System.out.println(Arrays.toString(arr));

            }


        }
        catch (IOException ex){ex.printStackTrace();}
        return list;
    }

}
