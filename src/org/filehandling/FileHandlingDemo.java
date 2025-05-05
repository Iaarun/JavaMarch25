package org.filehandling;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

public class FileHandlingDemo {
    public static void main(String[] args) throws IOException {
        FileHandlingDemo demo = new FileHandlingDemo();
      //  demo.createFile("mytest.txt");
        // demo.createFile("mytest2.txt");
        demo.readPropertiesfile();
    }

    public void createFile(String  fileName)    {
        File file = new File("src/org/filehandling/" + fileName);
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        //file writing
   /*     try{
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a test file.");
            writer.close();
            System.out.println("File written successfully.");
        }catch (IOException e){
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }*/

        //file reading
        try{
            Scanner reader = new Scanner(file);
            while(reader.hasNext()){
                String data = reader.nextLine();
                System.out.println(data);
            }
        }catch (Exception e){
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }


    }

    public void readPropertiesfile() throws IOException {
        File file = new File("src/org/filehandling/dummy.properties");
        FileInputStream fis = new FileInputStream(file);
        //Properties class is used to maintain the properties file
        Properties prop = new Properties();
//load method is used to load the properties file
        prop.load(fis);

        System.out.println(prop.get("name") );
        System.out.println(prop.get("age") );
        System.out.println(prop.get("course") );

    }
}
