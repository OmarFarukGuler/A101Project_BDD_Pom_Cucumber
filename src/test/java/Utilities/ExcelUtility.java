package Utilities;


import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtility {

    public static void ReadTheExcel(String path, String sheetName, int columnCount) throws IOException {

        FileInputStream inputStream;
        Workbook workbook;

        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet(sheetName);

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            Row row = sheet.getRow(i);
            for (int j = 0; j < columnCount; j++) {
                System.out.print(row.getCell(j) + " ");
            }
            System.out.println();
        }


    }

    public static void writeToExcel(String path, String scenarioID, String scenarioName, String browserName, String status, String date) throws IOException {

        FileInputStream inputStream;
        Workbook workbook;

        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Sheet sheet = workbook.getSheet("Sheet1");
        int rowCount = sheet.getPhysicalNumberOfRows();

        Row row = sheet.createRow(rowCount);


        row.createCell(0).setCellValue(scenarioID);
        row.createCell(1).setCellValue(scenarioName);
        row.createCell(2).setCellValue(browserName);
        row.createCell(3).setCellValue(status);
        row.createCell(4).setCellValue(date);
        System.out.println();


        inputStream.close();

        try {
            inputStream.close();
            FileOutputStream outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
