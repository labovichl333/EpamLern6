package by.epamtc.lab6.entity.plane;

import java.util.Objects;

public class CargoPlane extends Plane {
    private double loadCapacity;

    public CargoPlane() {
    }

    public CargoPlane(double fuelCapasity, double fuelConsumption, double maxSpeed, int id, double loadCapacity){
        super(fuelCapasity, fuelConsumption, maxSpeed, id);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CargoPlane that = (CargoPlane) o;
        return Double.compare(that.loadCapacity, loadCapacity) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int)loadCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                " fuelCapasity=" + super.getFuelCapasity() +
                ", fuelConsumption=" + super.getFuelConsumption() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", id=" + super.getId() +
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
