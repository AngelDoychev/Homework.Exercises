package JavaAdvance.RegularExam.automotiveRepairShop;

import java.util.ArrayList;
import java.util.List;

public class RepairShop {
    private int capacity;
    private List<Vehicle> vehicles;

    public RepairShop(int capacity) {
        this.capacity = capacity;
        this.vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle vehicle) {
        if (vehicles.size() < capacity) {
            vehicles.add(vehicle);
        }
    }

    public boolean removeVehicle(String VIN) {
        for (Vehicle current : vehicles) {
            if (current.getVIN().equals(VIN)) {
                vehicles.remove(current);
                return true;
            }
        }
        return false;
    }

    public int getCount() {
        return this.vehicles.size();
    }

    public Vehicle getLowestMileage() {
        Vehicle lowest = new Vehicle("temp", Integer.MAX_VALUE, "temp");
        for (Vehicle current : vehicles) {
            if (lowest.getMileage() > current.getMileage()) {
                lowest = current;
            }
        }
        return lowest;
    }

    public String report() {
        StringBuilder reportResult = new StringBuilder();
        reportResult.append("Vehicles in the preparatory:\n");
        for (Vehicle current : vehicles) {
            reportResult.append(current);
            reportResult.append("\n");
        }
        return reportResult.toString().trim();
    }
}
