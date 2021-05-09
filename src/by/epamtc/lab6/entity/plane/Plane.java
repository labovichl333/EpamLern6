package by.epamtc.lab6.entity.plane;

import java.io.Serializable;


public abstract class Plane implements Serializable {
    private double fuelCapasity;
    private double fuelConsumption;
    private double maxSpeed;
    private int id;

    public Plane() {
    }

    public Plane( double fuelCapasity, double fuelConsumption, double maxSpeed, int id) {
        this.fuelCapasity = fuelCapasity;
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.id = id;
    }


    public double getFuelCapasity() {
        return fuelCapasity;
    }

    public void setFuelCapasity(double fuelCapasity) {
        this.fuelCapasity = fuelCapasity;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return  Double.compare(plane.fuelCapasity, fuelCapasity) == 0 &&
                Double.compare(plane.fuelConsumption, fuelConsumption) == 0 &&
                Double.compare(plane.maxSpeed, maxSpeed) == 0 &&
                id == plane.id;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (int) maxSpeed;
        result = 31 * result + (int)fuelCapasity;
        result = 31 * result + (int)fuelConsumption;
        return result;
    }

    @Override
    public String toString() {
        return "Plane{" +
                ", fuelCapasity=" + fuelCapasity +
                ", fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                ", id=" + id +
                '}';
    }


}
