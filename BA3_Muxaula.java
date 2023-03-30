package src;

public class BA3_Muxaula extends Car_Test {
    private final String color;

    public BA3_Muxaula(String Model, int MaxSpeed, int Power, String color){
        super(Model, MaxSpeed, Power);
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
