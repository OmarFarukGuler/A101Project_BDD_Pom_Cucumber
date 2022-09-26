package Utilities;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EGD {
    public static List<List<String>> ExcelGetData(String path) {
        List<List<String>> excelList = new ArrayList<>();
        FileInputStream inputStream;
        Workbook workbook;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Sheet sheet=workbook.getSheet("Sheet1");

        List<String> rowList=new ArrayList<>();
        for (int i = 0; i <sheet.getPhysicalNumberOfRows(); i++) {
            Row row= sheet.getRow(i);
            for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
                Cell cell= row.getCell(j);
                rowList.add(cell.getStringCellValue());
            }
            excelList.add(rowList);
        }


        return excelList;
    }

}
