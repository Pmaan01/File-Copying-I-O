package assignment_3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamFileCopy implements FileCopy 
{
	  @Override
	    public void copyFile(String sourceFile, String destinationFile) 
	  {
	        // Try-with-resources statement to ensure resources are closed automatically
	        try (FileInputStream fis = new FileInputStream(sourceFile); // Input stream to read bytes from the source file
	             FileOutputStream fos = new FileOutputStream(destinationFile)) { // Output stream to write bytes to the destination file
	            
	            int byteData; // Variable to hold each byte read from the input stream
	            
	            // Read bytes until the end of the stream (when fis.read() returns -1)
	            while ((byteData = fis.read()) != -1) 
	            {
	                fos.write(byteData); // Write the byte to the destination file
	            }
    
	            System.out.println("File copied successfully using byte streams!");
	        } 
	        catch (IOException e) 
	        { // Catch any IOExceptions that occur during file operations
	            e.printStackTrace(); // Print the stack trace for debugging
	        }
	    }
	}