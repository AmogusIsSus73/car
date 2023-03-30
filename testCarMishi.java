package src;

public class testCarMishi {
    public static void main(String[] args) {
        BA3_Muxaula car = new BA3_Muxaula("ВАЗ 2101", 250, 5000, "Розовый");
        System.out.println("Модель машины Миши: " + car.getModel());
        System.out.println("Максимальная скорость машины Миши: " + car.getMaxSpeed() + " км/ч");
        System.out.println("Мощность (л.с.): " + car.getMaxPower() + " л.с.");
        System.out.println("Цвет авто Миши: " + car.getColor());
    }
}
