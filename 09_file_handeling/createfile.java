import java.io.File;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) {
        File file = new File("test.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } 
        
        catch (IOException e) 
        {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
