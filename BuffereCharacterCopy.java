package assignment_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffereCharacterCopy implements FileCopy 
{

    @Override
    public void copyFile(String sourceFile, String destinationFile) 
    {
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter bw = new BufferedWriter(new FileWriter(destinationFile)))
        {

            int charData;
            while ((charData = br.read()) != -1) 
            {
                bw.write(charData);
            }

            System.out.println("File copied successfully using buffered character streams!");
        } 
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
