package Lessons45; // 46 и 47 Сериализация (часть 3). Transient, serialVersionUID.

import java.io.Serializable;

public class Person implements Serializable {
    private transient int id;
    private  String name; // transient доёт понять java что мы не хотим это поле Serializовать

    // Есть ещё  serialVersionUID очень полезная штука и нужная .К примеру наш клас персон был записан и имел номер serialVersionUID 14
    // спустя время проект бил изменён  и класс Person поменялся и мел  serialVersionUID 17
    //Если я захочу записать в новый проект старые данные то выдаст ошибку так как был изменён serialVersionUID
    // если не включить эту настроку ,то записав старый клас в изменённыё можно сохдать кучу артифактов и конфликтов
    // P.S главное! КОГДА МЕНЯЕТСЯ ЧТО-ТО В ПРОЕКТЕ НУЖНО ВСЕГДА ПЕРЕГЕНЕРИРОВАТЬ serialVersionUID



    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return id + " : " + name;
    }
}
