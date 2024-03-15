package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {

    public static String[] readLastRecordedData(String filePath) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            // first page in excel
            Sheet sheet = workbook.getSheetAt(0);

            // last row in sheet
            Row lastRow = sheet.getRow(sheet.getLastRowNum());

            // read email and password
            String email = lastRow.getCell(2).getStringCellValue();
            String password = lastRow.getCell(3).getStringCellValue();
            String newPassword = lastRow.getCell(4).getStringCellValue();
            workbook.close();

            return new String[]{email, password, newPassword};

        } catch (IOException e) {
            throw new IOException("Error reading from Excel file: " + e.getMessage(), e);
        }
    }

}
