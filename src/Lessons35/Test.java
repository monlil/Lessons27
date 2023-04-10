package Lessons35;

interface AbleToEaat { // Урок 35: Анонимные классы
    public void eat();
}

public class Test {
    public static void main(String[] args) {
        AbleToEaat ableToEaat = new AbleToEaat() { // создаётся анониманый клас для единичного использования.
            @Override
            public void eat() {
                System.out.println("ppspdsad");
            }
        };
        ableToEaat.eat();

    }
}
