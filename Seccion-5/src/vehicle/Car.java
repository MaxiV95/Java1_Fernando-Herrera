package vehicle;

public class Car extends Vehicle {
    private final CarType type;

    public Car(String brand, String model, int year, CarType type) {
        super(brand, model, year);
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println("El auto " + super.getModel() + " está encendido");
    }

    @Override
    public String toString() {
        return "Car{" +
                "type=" + type +
                '}' + super.toString();
    }
}
