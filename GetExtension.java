package assignment_3;

public class GetExtension 
{

    private String name;  // Stores the full file name
    private String ext;   // Stores the file extension

    // Constructor to initialize the file name and extract the extension
    public GetExtension(String fileName) 
    {
        if (
        		fileName == null || 
        		fileName.trim().isEmpty() ||
                !fileName.contains(".") ||
                fileName.lastIndexOf(".") == 0 ||
                fileName.lastIndexOf(".") == fileName.length() - 1) 
        {
                throw new IllegalArgumentException("File name must be non-empty and contain a valid extension.");
        }
        this.name = fileName;
        this.ext = extractExtension(fileName);  // Extract the extension when the object is created
    }

    // Getter for the file name
    public String getName() 
    {
        return name;
    }

    // Method to extract the extension from the file name
    private String extractExtension(String filename) 
    {
        int lastDotIndex = filename.lastIndexOf('.');  // Find the last dot in the file name
        if (lastDotIndex == -1 || lastDotIndex == filename.length() - 1) 
        {
            return "";  // No extension found, or the dot is the last character
        }
        return filename.substring(lastDotIndex + 1);  // Return the substring after the last dot
    }

    // Getter for the file extension
    public String getExtension() 
    {
        return ext;
    }

}
