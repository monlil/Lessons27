package Lessonse48;

public enum Amimal {
    DOG("Собака"), CAT("Кот"), FROG("Лягушка");

    private String translation;
     Amimal(String translation){
        this.translation = translation;
    }
    public String getTranslationt() {
         return translation;
    }
    public String toString(){
         return "перевод на русский язык" +translation;
    }
}
