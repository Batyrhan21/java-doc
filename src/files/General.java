package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class General {
    public static void main(String[] args) {
        createFile();
        writeToFile();
        readFile();
        getFileInformation();
        deleteFile();
    }

    public static void createFile() {
        File myObj = null;
        try {
            myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("file created " + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void writeToFile() {
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("HEHE i'm here");
            myWriter.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }
    public static void readFile() {
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

    }
    public static void getFileInformation() {
        File myObj = new File("filename.txt");
        if (myObj.exists()) {
            System.out.println("Filename: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File size in bytes: " + myObj.length());
        } else  {
            System.out.println("The file does not exists");
        }
    }
    public static  void deleteFile() {
        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Delete the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file");
        }
    }
}
