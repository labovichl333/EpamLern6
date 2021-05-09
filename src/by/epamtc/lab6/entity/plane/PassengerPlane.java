package by.epamtc.lab6.entity.plane;

public class PassengerPlane extends Plane {
    private int firstClassSeats;
    private int businessClassSeats;
    private int standartClassSeats;

    public PassengerPlane() {
    }

    public PassengerPlane(double fuelCapasity, double fuelConsumption, double maxSpeed, int id, int firstClassSeats, int businessClassSeats, int standartClassSeats) {
        super( fuelCapasity, fuelConsumption, maxSpeed, id);
        this.firstClassSeats = firstClassSeats;
        this.businessClassSeats = businessClassSeats;
        this.standartClassSeats = standartClassSeats;
    }

    public int getFirstClassSeats() {
        return firstClassSeats;
    }

    public void setFirstClassSeats(int firstClassSeats) {
        this.firstClassSeats = firstClassSeats;
    }

    public int getBusinessClassSeats() {
        return businessClassSeats;
    }

    public void setBusinessClassSeats(int businessClassSeats) {
        this.businessClassSeats = businessClassSeats;
    }

    public int getStandartClassSeats() {
        return standartClassSeats;
    }

    public void setStandartClassSeats(int standartClassSeats) {
        this.standartClassSeats = standartClassSeats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PassengerPlane that = (PassengerPlane) o;
        return firstClassSeats == that.firstClassSeats &&
                businessClassSeats == that.businessClassSeats &&
                standartClassSeats == that.standartClassSeats;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + standartClassSeats;
        result = 31 * result + businessClassSeats;
        result = 31 * result + firstClassSeats;
        return result;
    }

    @Override
    public String toString() {
        return "PassengerPlane{" +
                " fuelCapasity=" + super.getFuelCapasity() +
                ", fuelConsumption=" + super.getFuelConsumption() +
                ", maxSpeed=" + super.getMaxSpeed() +
                ", id=" + super.getId() +
                "firstClassSeats=" + firstClassSeats +
                ", businessClassSeats=" + businessClassSeats +
                ", standartClassSeats=" + standartClassSeats +
                '}';

    }
}
