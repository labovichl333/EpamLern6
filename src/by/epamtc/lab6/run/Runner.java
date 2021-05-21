package by.epamtc.lab6.run;

import by.epamtc.lab6.entity.airline.Airline;
import by.epamtc.lab6.entity.plane.CargoPlane;
import by.epamtc.lab6.entity.plane.PassengerPlane;
import by.epamtc.lab6.exeption.serviseExeption.EmptyPlaneException;
import by.epamtc.lab6.service.AirlineCalculateService;
import by.epamtc.lab6.service.AirlineSearchService;
import by.epamtc.lab6.service.AirlineSortService;
import by.epamtc.lab6.util.MaxSpeedComparator;

public class Runner {
    public static void main(String[] args) throws EmptyPlaneException {



        PassengerPlane p1 = new PassengerPlane(100,200,300,1,10,20,30);
        PassengerPlane p2 = new PassengerPlane(200,100,300,2,10,120,5000);
        PassengerPlane p3 = new PassengerPlane(400,600,300,3,2,40,50);

        CargoPlane c1=new CargoPlane(500,800,900,0,5000);
        CargoPlane c2=new CargoPlane(600,8900,1000,8,70000);
        CargoPlane c3=new CargoPlane(900,8000,1500,9,12000);

        Airline airline = new Airline("Company 1");
        airline.addPlane(c1);
        airline.addPlane(c2);
        airline.addPlane(c3);

        airline.addPlane(p1);
        airline.addPlane(p2);
        airline.addPlane(p3);

        System.out.println(airline);


        System.out.println("Total Loading capacity");
        System.out.println(AirlineCalculateService.calculateTotalLoadCapacity(airline));

        System.out.println("Total  seats");
        System.out.println(AirlineCalculateService.calculateTotalNumberOfSeats(airline));

        AirlineSortService.sortPlanes(airline,new MaxSpeedComparator());
        System.out.println("Sort by MaxSpeed");
        System.out.println(airline);


        System.out.println("Result of search");
        System.out.println(AirlineSearchService.searchPlaneByFuelConsumption(airline,500,9000));
    }
}
