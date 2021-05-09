package by.epamtc.lab6.service;


import by.epamtc.lab6.entity.airline.Airline;
import by.epamtc.lab6.entity.plane.Plane;
import by.epamtc.lab6.exeption.EmptyPlaneException;

import java.util.ArrayList;
import java.util.List;

public class AirlineSearchService {
    public static List<Plane> searchPlaneByFuelConsumption(Airline airline, double from, double to) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("The list of planes is empty");
        }

        List<Plane> planes = airline.getPlanes();
        List<Plane> result = new ArrayList<>();

        for (Plane plane : planes) {
            if (plane.getFuelConsumption() >= from && plane.getFuelConsumption() <= to) {
                result.add(plane);
            }
        }
        return result;
    }
}
