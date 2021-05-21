package by.epamtc.lab6.service;

import by.epamtc.lab6.entity.airline.Airline;
import by.epamtc.lab6.entity.plane.Plane;
import by.epamtc.lab6.exeption.serviseExeption.EmptyPlaneException;

import java.util.Comparator;
import java.util.List;

public class AirlineSortService {
    public static void sortPlanes(Airline airline, Comparator<Plane> comparator) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("The list of planes is empty");
        }
        List<Plane> planes = airline.getPlanes();
        planes.sort(comparator);
    }
}
