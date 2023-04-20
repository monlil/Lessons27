package lESONS38;

import java.util.Scanner;

public class Exceptions2 {
        public static void main(String[] args) throws ScannerException {
            Scanner scanner = new Scanner(System.in);
            while (true){
                int x = Integer.parseInt(scanner.nextLine());
                if (x != 0){
                    throw new ScannerException ("Хули так мало А? Ты должен быть касарь отдать.Хули тут так мало? ");
            }
        }
    }
}
