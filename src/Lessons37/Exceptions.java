package Lessons37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        try {
            ReadFile();
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main. FAIL!");
        }
    }

    public static void ReadFile() throws FileNotFoundException {
        File file = new File("123");
        Scanner scanner = new Scanner(file);

    }
}
