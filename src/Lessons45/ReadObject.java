package Lessons45; // 46 и 47 Сериализация (часть 3). Transient, serialVersionUID.

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("people.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            int personCount = ois.readInt();
            Person[] people = new Person[personCount];

            for (int i = 0; i < personCount; i++) {
                people[i] = (Person) ois.readObject();
            }
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


// Можно было сделать по другому Разница в том что в первом способе мы записали 3 отдельных лбьекта,а во втором
// способе у на 1 обьект и этот обьект у нас массив!
//  try {
//            FileInputStream fis = new FileInputStream("people.bin");
//            ObjectInputStream ois = new ObjectInputStream(fis);
//
//
//
//           Person[] people = (People[]) ois.readObject();
//
//
//
//            System.out.println(Arrays.toString(people));
//
//            ois.close();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
