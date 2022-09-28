package _06_Excels;

import Utilities.ExcelUtility;
import Utilities.GWD;
import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class excelReadDeneme {
    public static void main(String[] args) throws IOException {
        //ExcelUtility.ReadTheExcel("src/test/java/_06_Excels/_01_a101.xlsx","Sheet1",2);
        excelReadDeneme.writeToExcel1("src/test/java/_06_Excels/write.xlsx","5" ,"deneme","pass",GWD.browser.get(),"28/09/22");

    }
    public static void writeToExcel1(String path, String scenarioID, String scenarioName, String browserName, String status, String date) throws IOException {

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
