package labs;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class readingAndWritngForEssentials {
//Constructor
    public readingAndWritngForEssentials() {

    }

//	 Writing Text/String to File using PrintWriter and FileOutputStream
//	 Checks for "FileNotFoundException" in the connection to the file
	 
    public void writingTextToFile() throws IOException {
//      Open PrintWriter
        PrintWriter printWriter = null;
        File file;

        try {
            file = new File("./essentials_stock.txt");
            printWriter = new PrintWriter(new FileOutputStream(file, true));
            if (!file.exists()) {
                file.createNewFile();
            }
        } catch (FileNotFoundException mistake) {
            mistake.getMessage();
        }
        
        Scanner reader = new Scanner(System.in);

        printWriter.print("Shop data");
        printWriter.println();
        printWriter.print("<item>  <quantity>  <GHC price> "); 
        printWriter.println();
        
        
        String condition = "No";  
        while(condition.equals("No")){
        System.out.print("Esentials Stock");
	System.out.print("Enter the name of the item(eg.Milk)   ");
        String Item = reader.next();
        System.out.print("Enter the name of the number available(eg. 60)   ");
        String numberavailable = reader.next();
        System.out.print("Enter the name of the price. (eg.GHC2.5)   ");
        String price = reader.next();
        System.out.print("do you want to end the program? Yes/No   ");
        condition = reader.next();

        
        printWriter.print(Item + " ");
        printWriter.print(numberavailable + " ");
        printWriter.print(price + " ");
        printWriter.println();
        
        }
        
        // Close reader and writer
        reader.close();
        printWriter.close();
        
        
//      To backup the file
        FileReader Orignal = new FileReader("./essentials_stock.txt");
        FileWriter NewBackup = new FileWriter("./backup_essentials_stock.txt");
        try {
            int c = Orignal.read();
            while (c != -1) {
                NewBackup.write(c);
                c = Orignal.read();
            }
        } catch (IOException e) {
            System.out.println(e);
        } finally {
            Orignal.close();
            NewBackup.close();
        }
    }

    public static void main(String[] args) throws IOException {
        readingAndWritngForEssentials pwd = new readingAndWritngForEssentials();
        pwd.writingTextToFile();
    }
}
