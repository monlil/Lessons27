package Lessons32;

public class Test {
    public static void main(String[] args) {

        // - Upcasting - Восходящее преобразование.
        Animal animal = new Dog();

        // -Downcasting -Нисходящее преобразование.
        Dog dog = (Dog) animal;

        Animal a = new Animal();
        Dog dog1 = (Dog) a;
        dog1.bark();

    }
}
