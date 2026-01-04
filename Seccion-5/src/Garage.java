import vehicle.Vehicle;

import java.util.List;

public class Garage {
    private List<Vehicle> vehicles;
    private final int capacity;

    public Garage(List<Vehicle> vehicles, int capacity) {
        this.vehicles = vehicles;
        this.capacity = capacity;
    }

    public void addVehicle(Vehicle vehicle){
        if(vehicles.size() < capacity){
            vehicles.add(vehicle);
            System.out.println("Vehículo agregado al garaje.");
        } else {
            System.out.println("El garaje está lleno. No se puede agregar más vehículos.");
        }
    }

    public boolean removeVehicle(Vehicle vehicle){
        if(vehicles.remove(vehicle)){
            System.out.println("Vehículo removido del garaje.");
            return true;
        } else {
            System.out.println("El vehículo no se encontró en el garaje.");
            return false;
        }
    }

    public void listVehicles(){
        if(vehicles.isEmpty()){
            System.out.println("El garaje está vacío.");
        } else {
            System.out.println("Vehículos en el garaje:");
            for(Vehicle vehicle : vehicles){
                System.out.println(vehicle);
            }
        }
    }

    public void startAllVehicles(){
        for(Vehicle vehicle : vehicles){
            vehicle.start();
        }
    }

    public void chargeAllElectricVehicles(){
        for(Vehicle vehicle : vehicles){
            if(vehicle instanceof vehicle.Electric){
                ((vehicle.Electric) vehicle).chargeBattery();
            }
        }
    }
}
