package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class SaveFakeDataToExcel {
    public static void writeToFile(String fname, String lname, String email, String password, String newPassword,String filePath) {
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet("RandomData");
            Row headerRow = sheet.createRow(0);

            // Create headers
            String[] headers = {"First Name", "Last Name", "Email", "Password","newPassword"};
            for (int i = 0; i < headers.length; i++) {
                Cell cell = headerRow.createCell(i);
                cell.setCellValue(headers[i]);
            }

            // Create data row
            Row dataRow = sheet.createRow(1);
            dataRow.createCell(0).setCellValue(fname);
            dataRow.createCell(1).setCellValue(lname);
            dataRow.createCell(2).setCellValue(email);
            dataRow.createCell(3).setCellValue(password);
            dataRow.createCell(4).setCellValue(newPassword);

            // Write the workbook to the file
            try (FileOutputStream fileOut = new FileOutputStream(filePath)) {
                workbook.write(fileOut);
                System.out.println("Data written to Excel file successfully!");
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error writing to Excel file: " + e.getMessage());
        }
    }
}
