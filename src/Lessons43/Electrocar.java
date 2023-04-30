package Lessons43;

public class Electrocar { // Урок 43: Вложенные классы.
    private int id;

    private class Motor { //1.тип Вложенный не статический класс
        // Они нужны когда обьект класса сложный и его можно разделить на несколько подъобьектов.
        public void startMotor(){
            System.out.println("Motor" +id+ "is starting...");
        }
    }

    public static class Battery { // 2.тип Статический вложенный класс
        // Мы хотим как-то сгрупировать эти классы. Клас Battery и Electrocar почти ничего не связывает
        // Их связывает логика.
        //Статические классы нужны для использование из вне.Поэтому они используются с модификатором доступа public
        public void charge () {
            System.out.println("Battery is charging");
        }
    }

    public Electrocar (int id) {
        this.id = id;
    }

    public void start (){
        Motor motor = new Motor();
        motor.startMotor();

        final  int x = 1;

        class  SomeClass{                 //3.тип  Он имеет доступ к нестатическим полям класса и к переменным метода.
                              // но чтобы во был доступ к переменным нужно добавить final = чтобы они были константами
            public void SomeMethod(){
                System.out.println(x);
                System.out.println(id);

            }
        }

        System.out.println("Electrocar" + id + "This starting");
    }
}
