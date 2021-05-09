package by.epamtc.lab6.service;

import by.epamtc.lab6.entity.airline.Airline;
import by.epamtc.lab6.entity.plane.CargoPlane;
import by.epamtc.lab6.entity.plane.PassengerPlane;
import by.epamtc.lab6.entity.plane.Plane;
import by.epamtc.lab6.exeption.EmptyPlaneException;


import java.util.List;

public class AirlineCalculateService {
    public static double calculateTotalLoadCapacity(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("The list of planes is empty");
        }
        double answer = 0;
        List<Plane> planes = airline.getPlanes();
        for (Plane plane : planes) {
            if (plane instanceof CargoPlane) {
                answer += ((CargoPlane) plane).getLoadCapacity();
            }
        }

        return answer;
    }

    public static double calculateTotalNumberOfSeats(Airline airline) throws EmptyPlaneException {
        if (airline.getPlanes().isEmpty()) {
            throw new EmptyPlaneException("The list of planes is empty");
        }
        double answer = 0;
        List<Plane> planes = airline.getPlanes();
        for (Plane plane : planes) {
            if (plane instanceof PassengerPlane) {
                PassengerPlane temp=(PassengerPlane) plane;
                answer += temp.getBusinessClassSeats();
                answer += temp.getFirstClassSeats();
                answer += temp.getStandartClassSeats();
            }
        }

        return answer;
    }


}
