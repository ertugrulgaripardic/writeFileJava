import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        readFile();

    }

    public static void createFile() {
        File file = new File("C:\\javademos\\files\\student.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten mevcut");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void getFileInfo() {
        File file = new File("C:\\javademos\\files\\student.txt");
        if (file.exists()) {
            System.out.println("Dosya adı: " + file.getName());
            System.out.println("Dosya yolu: " + file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: " + file.canWrite());
            System.out.println("Dosya okunabilir mi: " + file.canRead());
            System.out.println("Dosya boyutu: " + file.length());

        }
    }

    public static void readFile() {
        File file = new File("C:\\javademos\\files\\student.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) ;
            System.out.println(file);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

}