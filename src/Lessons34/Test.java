package Lessons34; // Wildcards (Generics)

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);


    }
    private static void test(List<? extends Animal> list) { //List<? позволяет использовать любые обьекты
        //extends Animal позволяет понять java что хочу поставлять листы Animal либо любого другого наследуемого класса.
        //supper Animal позволяет понять java что хочу поставлять листы классов выше Animal в иерархии наследования.
        //Тоесть всех родителей класса Animal
        for (Animal animal : list) {
           animal.eat();
        }
    }
}
