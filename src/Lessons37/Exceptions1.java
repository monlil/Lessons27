package Lessons37;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 { // Урок 37: Исключения (часть 1). Обработка исключений.
    public static void main(String[] args) {
        File file = new File("test");

        try {
            Scanner scanner = new Scanner(file);

            System.out.println("После Scanner. PROFESSIONAL");
        } catch (FileNotFoundException e) {
            System.out.println("FAIL!");
        }
        System.out.println("После блока try catch!");
    }
}
