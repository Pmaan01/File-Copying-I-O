package assignment_3;

import java.util.Scanner;

public class Main 
{

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to input the source file name
        System.out.print("Enter the source file name (with extension): ");
        String sourceFile = scanner.nextLine();  // Read user input
        
        // Create an instance of GetExtension to extract the extension
        GetExtension getExt = new GetExtension(sourceFile);
        String fileExtension = getExt.getExtension();  // Extract the extension from the source file

        // Destination file names dynamically using the extracted extension
        String byteStreamDestination = "byteStreamOutput." + fileExtension;  // Destination for byte stream
        String charStreamDestination = "charStreamOutput." + fileExtension;  // Destination for character stream
        String bufferedByteDestination = "bufferedByteOutput." + fileExtension;  // Destination for buffered byte stream
        String bufferedCharDestination = "bufferedCharOutput." + fileExtension;  // Destination for buffered character stream

        // Byte Stream File Copy///////found on internet to calculate nano seconds for time taken.
        long startTime = System.nanoTime();
        
        FileCopy byteStreamCopy = new ByteStreamFileCopy();
        byteStreamCopy.copyFile(sourceFile, byteStreamDestination);
        long endTime = System.nanoTime();
        System.out.println("Byte Stream Copy Time: " + (endTime - startTime) + " nanoseconds");

        // Character Stream File Copy
        startTime = System.nanoTime();
        FileCopy charStreamCopy = new CharacterStreamFileCopy();
        charStreamCopy.copyFile(sourceFile, charStreamDestination);
        endTime = System.nanoTime();
        System.out.println("Character Stream Copy Time: " + (endTime - startTime) + " nanoseconds");

        // Buffered Byte Stream File Copy
        startTime = System.nanoTime();
        FileCopy bufferedByteStreamCopy = new BufferedStreamFileCopy();
        bufferedByteStreamCopy.copyFile(sourceFile, bufferedByteDestination);
        endTime = System.nanoTime();
        System.out.println("Buffered Byte Stream Copy Time: " + (endTime - startTime) + " nanoseconds");

        // Buffered Character Stream File Copy
        startTime = System.nanoTime();
        FileCopy bufferedCharStreamCopy = new BuffereCharacterCopy();
        bufferedCharStreamCopy.copyFile(sourceFile, bufferedCharDestination);
        endTime = System.nanoTime();
        System.out.println("Buffered Character Stream Copy Time: " + (endTime - startTime) + " nanoseconds");

        scanner.close();
    }
}

