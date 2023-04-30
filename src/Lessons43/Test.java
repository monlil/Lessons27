package Lessons43;

public class Test {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battery battery = new Electrocar.Battery(); // Логически сгрупировав классы Electrocar и Battery
        // И теперь при создание обьекта класса Battery понятно что он лежит в классе Electrocar
        // Этот синтаксис создания обьектов в Java очень распрастранён
    }
}
