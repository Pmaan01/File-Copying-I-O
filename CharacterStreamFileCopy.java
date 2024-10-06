package assignment_3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamFileCopy implements FileCopy
{

    @Override
    public void copyFile(String sourceFile, String destinationFile) 
    {
        try (FileReader fr = new FileReader(sourceFile);
             FileWriter fw = new FileWriter(destinationFile)) 
        {

            int charData;
            while ((charData = fr.read()) != -1) 
            {
                fw.write(charData);
                
            }

            System.out.println("File copied successfully using character streams!");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
