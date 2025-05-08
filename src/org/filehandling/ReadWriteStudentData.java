package org.filehandling;

import org.apache.commons.collections4.map.CaseInsensitiveMap;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ReadWriteStudentData {
    public static void main(String[] args) {
        ReadWriteStudentData readWriteStudentData = new ReadWriteStudentData();
        //readWriteStudentData.createExcelFile("mytest.xlsx");
        //readWriteStudentData.createExcelFile();
     //   readWriteStudentData.writeStudentData();
        readWriteStudentData.readExcelFile();
    }

    public void writeStudentData() {
        Map<String, Object[]> studentData= new LinkedHashMap<>();
        studentData.put("1", new Object[]{"ID", "First Name", "Last Name"});
        studentData.put("2", new Object[]{101, "Pankaj", "Singh"});
        studentData.put("3", new Object[]{102, "John", "Doe"});
        studentData.put("4", new Object[]{103, "Jane", "Smith"});
        studentData.put("5", new Object[]{104, "Emily", "Jones"});
        studentData.put("6", new Object[]{105, "Michael", "Brown"});

        Set<String> keyset = studentData.keySet();

        // Code to write student data to an Excel file
        File file = new File("src/org/filehandling/Student.xlsx");
        // Implement the logic to write student data to the Excel file
      //  FileInputStream fis = null;

        try{
         //   fis = new FileInputStream(file);
            // Create a workbook and a sheet
             XSSFWorkbook workbook = new XSSFWorkbook(file);
            // Create a sheet named "StudentData"
             XSSFSheet sheet = workbook.createSheet("StudentData");
            int rownum=0;
            for (String key:keyset){
                  Row row= sheet.createRow(rownum++);
              Object[] data=    studentData.get(key);
              int cellnum=0;
              for (Object obj:data){
                 Cell cell= row.createCell(cellnum++);
                  if(obj instanceof String) {
                      cell.setCellValue((String) obj);
                  } else if (obj instanceof Integer) {
                      cell.setCellValue((Integer) obj);

                  }
              }
            }

            FileOutputStream fos = new FileOutputStream(file);
            workbook.write(fos);
            fos.close();
            workbook.close();


        }catch (Exception e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }

        System.out.println("Student data written to Excel file successfully.");
    }

    public void readExcelFile(){
        File file = new File("src/org/filehandling/Student.xlsx");
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            XSSFWorkbook workbook = new XSSFWorkbook(fis);
            XSSFSheet sheet = workbook.getSheet("StudentData");
            Iterator<Row> rowIt= sheet.iterator();
            while (rowIt.hasNext()){
                Row row=   rowIt.next();
              Iterator<Cell> cellIt=  row.iterator();
              while(cellIt.hasNext()){
                 Cell cell=   cellIt.next();
                 switch (cell.getCellType()){
                     case NUMERIC:
                         System.out.print(cell.getNumericCellValue() + " ");
                         break;
                     case STRING:
                         System.out.print(cell.getStringCellValue() + " ");
                         break;
                 }

              }
                System.out.println();
            }



        }catch (Exception e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
