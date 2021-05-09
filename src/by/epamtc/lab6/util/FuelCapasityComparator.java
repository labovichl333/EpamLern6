package by.epamtc.lab6.util;

import by.epamtc.lab6.entity.plane.Plane;

import java.util.Comparator;

public class FuelCapasityComparator implements Comparator<Plane> {
    @Override
    public int compare(Plane o1, Plane o2) {
        return Double.compare(o1.getFuelCapasity(),o2.getFuelCapasity());
    }
}
