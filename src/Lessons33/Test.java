package Lessons33;// Введение в параметризацию. (Generics)

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // Java 5 //
        List animals = new ArrayList<>();
        Animal ourAnimal = new Animal();

        animals.add("Cat");
        animals.add("Dog");  // 1
        animals.add("Frog");
        animals.add(ourAnimal);


        String animal = (String) animals.get(3);
        System.out.println(animal);

        // С появлением дженериков //
        List<String> animals2 = new ArrayList<>();
        animals2.add("Cat");
        animals2.add("Dog");
        animals2.add("Frog");

        String animal2 = animals2.get(1);


        // Java 7//
        List<String> animals3 = new ArrayList<>();



    }
}
    class Animal{

    }

