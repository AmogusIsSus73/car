package src;

public class Car_Test {
    private int MaxSpeed;
    private int Power;
    private String Model;

    public Car_Test(String Model, int MaxSpeed, int Power){
        this.Model = Model;
        this.MaxSpeed = MaxSpeed;
        this.Power = Power;
    }
    public int getMaxSpeed(){
        return MaxSpeed;
    }
    public int getMaxPower(){
        return Power;
    }
    public String getModel(){
        return Model;
    }

}
