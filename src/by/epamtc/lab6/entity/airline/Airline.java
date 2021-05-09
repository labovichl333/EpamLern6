package by.epamtc.lab6.entity.airline;

import by.epamtc.lab6.entity.plane.Plane;
import by.epamtc.lab6.exeption.OutOfPlaneListExeption;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Airline implements Serializable {
    private String CompanyName;
    protected List<Plane> planes;
    public Airline() {
    }

    public Airline(String companyName) {
        CompanyName = companyName;
        planes=new ArrayList<>();
    }

    public String getCompanyName() {
        return CompanyName;
    }

    public void setCompanyName(String companyName) {
        CompanyName = companyName;
    }

    public List<Plane> getPlanes() {
        return planes;
    }

    public void addPlane(Plane plane) {
        planes.add(plane);
    }
    public void addPlane(int index,Plane plane) throws OutOfPlaneListExeption {
        if(index>=planes.size()){
            throw new OutOfPlaneListExeption("Going outside the plane list");
        }
        planes.add(index,plane);
    }

    public void removePlane(Plane plane) {
        planes.remove(plane);
    }
    public void removePlane(int index) throws OutOfPlaneListExeption {
        if(index>=planes.size()){
            throw new OutOfPlaneListExeption("Going outside the plane list");
        }
        planes.remove(index);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airline airline = (Airline) o;

        return Objects.equals(CompanyName, airline.CompanyName) &&
                Objects.equals(planes, airline.planes);
    }

    @Override
    public int hashCode() {
        int result=0;
        for (int i = 0; i <planes.size(); i++) {
            result+=31*planes.get(i).hashCode()+31;
        }
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb=new StringBuilder();
        sb.append("Airline{ CompanyName=").append(CompanyName).append(", planes=[ ");
        for (int i = 0; i <planes.size(); i++) {
            sb.append(planes.get(i).toString()).append(", ");
        }
        sb.append("] }");
        return sb.toString();
    }
}
