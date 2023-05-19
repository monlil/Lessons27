package Lessons45; // 46 и 47 Сериализация (часть 3). Transient, serialVersionUID.

import java.io.*;
import java.util.Arrays;

public class WriteObject {
    public static void main(String[] args) throws IOException {
        Person[] people =
                {new Person(1, "Bob" ),new Person(2,"Mike"),new Person(3,"Chibo")};
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            // использован синтексис Трай вис ресорсис.Поэтому закрывать не надо.Поток акроется сам.
           oos.writeInt(people.length);
           for (Person person : people){
               oos.writeObject(person);
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
// Можно было сделать по другому/ Разница в том что в первом способе мы записали 3 отдельных лбьекта,а во втором
// способе у на 1 обьект и этот обьект у нас массив!
// public static void main(String[] args) throws IOException {
//        Person[] people =
//                {new Person(1, "Bob" ),new Person(2,"Mike"),new Person(3,"Chibo")};
//
//        try {
//            FileOutputStream fos = new FileOutputStream("people.bin");
//            ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//
//
//
//            oos.writeObject(people);
//            oos.close();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
