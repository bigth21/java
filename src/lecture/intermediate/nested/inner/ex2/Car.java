package lecture.intermediate.nested.inner.ex2;

public class Car {
    private final String model;
    private final int chargeLevel;
    private final Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public void start() {
        engine.start();
        System.out.println("Start");
    }

    private class Engine {
        public void start() {
            System.out.println("car.getChargeLeve() = " + chargeLevel);
            System.out.println("car.getModel() = " + model);
        }
    }
}
