package Webdriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelread {

    public static void main(String args[]) throws IOException {

        File src = new File("C:\\Users\\sravn\\OneDrive\\Desktop\\Sample_Tc.xlsx");

        FileInputStream fis = new FileInputStream(src);

        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet("sample");

        System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(1).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(2).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(3).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(4).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(5).getStringCellValue());
        System.out.println(sh.getRow(0).getCell(6).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(2).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(3).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(4).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(5).getStringCellValue());
        System.out.println(sh.getRow(1).getCell(6).getStringCellValue());



    }
}
