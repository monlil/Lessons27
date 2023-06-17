package Lessonse48;

public enum Season {
    SUMMER(28), WINTER(-28), AUTUMN(18), SPRING(10);

    private int temperature;

    Season(int temperature){
        this.temperature = temperature;
    }

    public  int getTemperature(){
        return temperature;
    }
}
