package Lessonse48;

import Lessons41.Animal;

public class Test { // Урок 48: Enum (Перечисления). Enum  испоьлзуется для перечисления обьектов.

    public static void main(String[] args) {

//        Amimal animal = Amimal.DOG;
//        System.out.println(animal);
//
//        switch (animal) {
//            case CAT:
//                System.out.println("It's a cat");
//              break;
//        case DOG:
//          System.out.println("It's a dog");
//        break;
//                  }

       Season season = Season.SUMMER;
        System.out.println(season.getTemperature()  );

//        System.out.println(season.getClass());

//        switch (season) {
//            case  SUMMER:
//                System.out.println("It's warm outside");
//                break;
//            case WINTER:
//                System.out.println("It's cold outside");
//                break;
//        }
    }
}
