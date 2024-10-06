package assignment_3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamFileCopy implements FileCopy {

    @Override
    public void copyFile(String sourceFile, String destinationFile) 
    {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destinationFile)))
        {
        	      	
            int byteData;
            while ((byteData = bis.read()) != -1) 
            {
                bos.write(byteData);
            }

            System.out.println("File copied successfully using buffered byte streams!");
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
