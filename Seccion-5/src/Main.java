import vehicle.ElectricCar;
import vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new vehicle.Car("Toyota", "Corolla", 2020, vehicle.CarType.SEDAN);
        Vehicle myElectricCar = new vehicle.ElectricCar("Tesla", "Model S", 2021, vehicle.CarType.SPORTS, 80);

        myCar.start();
        myElectricCar.start();

        System.out.println(myCar);
        System.out.println(myElectricCar);

        Garage myGarage = new Garage(new java.util.ArrayList<>(), 2);

        myGarage.listVehicles();
        myGarage.addVehicle(myCar);
        myGarage.addVehicle(myElectricCar);
        myGarage.listVehicles();
        myGarage.startAllVehicles();
        myGarage.chargeAllElectricVehicles();
        myGarage.listVehicles();
        myGarage.addVehicle(myCar);
        myGarage.removeVehicle(myCar);
    }
}