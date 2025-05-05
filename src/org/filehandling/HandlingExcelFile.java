package org.filehandling;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HandlingExcelFile {
    public static void main(String[] args) {
        HandlingExcelFile handlingExcelFile = new HandlingExcelFile();
       // handlingExcelFile.createExcelFile("mytest.xlsx");

      //  handlingExcelFile.createExcelFile();
          handlingExcelFile.readExcelFile();
    }

    public void readExcelFile(){
        File file = new File("src/org/filehandling/Employee.xlsx");
        FileInputStream fis = null;
        try {
            fis  = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
             XSSFSheet sheet= workbook.getSheet("TestSheet");
            int rowCount = sheet.getPhysicalNumberOfRows();
            int colNo = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Row Count: " + rowCount);
            System.out.println("Column Count: " + colNo);
         String name=   sheet.getRow(1).getCell(1).getStringCellValue();
            System.out.println("Name: " + name);

            //reading data from excel file
            //upper for loop for reading data in rows
            // inner for loop for reading data in columns
            System.out.println("--------------------");
            for(int i=0; i<rowCount; i++){
                for(int j=0; j<colNo; j++){
                  String data=  sheet.getRow(i).getCell(j).getStringCellValue();
                    System.out.print(data+" ");
                }
                System.out.println();
            }
  workbook.close();

        }catch (IOException e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }

    public void createExcelFile() {
        File file = new File("src/org/filehandling/Employee.xlsx");
        FileOutputStream fos = null;
        FileInputStream fis = null;
        try{
            fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("TestSheet");
            //creating header
            sheet.createRow(0).createCell(0).setCellValue("ID");
            sheet.getRow(0).createCell(1).setCellValue("Name");
            sheet.getRow(0).createCell(2).setCellValue("Salary");
            //creating data
            sheet.createRow(1).createCell(0).setCellValue("1");
            sheet.getRow(1).createCell(1).setCellValue("John");
            sheet.getRow(1).createCell(2).setCellValue("1000");
            fos= new FileOutputStream(file);
            workbook.write(fos);
            System.out.println("File created successfully.");

          workbook.close();
        }catch (Exception e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }


    }
}
