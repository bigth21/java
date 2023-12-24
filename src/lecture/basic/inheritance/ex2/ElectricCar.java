package lecture.basic.inheritance.ex2;

public class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println("Move faster");
    }

    public void charge() {
        System.out.println("Charge");
    }
}
