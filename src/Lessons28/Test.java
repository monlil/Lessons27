package Lessons28;

import Lessons28.Package1.Person;

class Test extends Person {

    public Test(){
        name = "Tom";
    }
}

// private (можно получить доступ только в пределах класса где это поле задекларированно) 1.самый строгий
// default (Всё что default доступно в пределах этого пакета.) 2.мение строгий
// protected (Доступны в пределах одного пакета, доступны всем подклассам даже если эти подклассы вне пакета) 3. Третий по строгости
// public (Можно получить доступ к нему в любом другом классе и пакете)Разрешает доступ везде. 4. не строгий,)
// это модификаторы доступа в Java