package utilities;

import java.io.FileWriter;
import java.io.IOException;

public class SaveFakeData {
    public static void writeToFile(String fname, String lname, String email, String password, String filePath) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            // Append data to the file
            writer.write("First Name: " + fname + "\n");
            writer.write("Last Name: " + lname + "\n");
            writer.write("Email: " + email + "\n");
            writer.write("Password: " + password + "\n\n");
            System.out.println("Data written to the file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }
}
