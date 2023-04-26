package Lessons42;

public class test {
    public static void main(String[] args) { //  Урок 42: Метод equals() и String Pool.
        // animal1    -> (1)
        // animal2    -> (1)
        // несмотря на то что id у них разный. мы сраниваем не обьекты и их структру, а их указатели.
        // мы создали 2 разных обьекта  animal1 == animal2 и естественно они будут разные.
        // что делать если нужно сравнить обьекты структурно. а не указательно?
        // метод equals всегда нужно использовать если хочу сравнить оьект по их структуре. Тоесть как сущности.
        // если же нужно узнать указывают 2 ссылки на один и тот же обьект,
        // то достаточно animal1 == animal2)

       Animal animal1 = new Animal(1);
       Animal animal2 = new Animal(1);
       String string1 = "Hello";
       String string2 = "Hello";

        // Но если стравнивать стринг таким образом string1 == string2 то будет true
        // Потогму что при создании строки она ссылается на обьект "Hello" и при создании второй строки
        // вторая строка так же ссылается на уже созданный обьект "Hello" не зоздавая новый. Поэтому получается true
        // Получается animal1   ->  Hello1
        // string2 тоже ссылается на созданный обьект -> Hello1. Поэтому полшучается при сравнении true
        // таким образом java эканомит память
        // но если зодать обьект используя данный метод
        // String string1 =new String()
        // String string2 =new String()
        // В данном случае процесс сравнение выдаст False. Так-как ссылки не равны и имеют разные указатели


       System.out.println(animal1.equals (animal2));
    }
}
class Animal{
    private int id;
    public Animal (int id) {
        this.id = id;
    }
    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}
