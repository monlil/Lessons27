package Lesons40;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions4 {
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) { // это называется Мульти кетч. Тоесть оьрабатывается сразу пару исключений в блоке.
            e.printStackTrace();
        }
    }

    public static void run () throws IOException, ParseException, IllegalArgumentException{

    }
}
