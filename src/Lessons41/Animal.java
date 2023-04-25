package Lessons41;

public abstract class Animal {  // abstract  доёт понять java что это не сущность.Это концепция.
    // И создать обьект Animal мы не можем,но можем от него наследоваться
    //Это используется когда мы хотим создать иерархию классов ,но Класс родителя не является самостоятельным классом
    public void eat() {
        System.out.println("i am eating...");
    }

    public abstract void makeSound(); // Только в абстрактных классах можно создавать абстрактные методы.
}
