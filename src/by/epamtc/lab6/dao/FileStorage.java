package by.epamtc.lab6.dao;

import by.epamtc.lab6.entity.airline.Airline;
import by.epamtc.lab6.entity.plane.Plane;
import by.epamtc.lab6.exeption.daoExeption.DaoException;
import by.epamtc.lab6.exeption.daoExeption.InvalidArgumentExeption;

import java.io.*;

import java.util.List;


public class FileStorage implements DaoTool<Plane> {


    private String filePath;

    public FileStorage(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public List<Plane> getAllPlanes() throws DaoException {
        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            List<Plane> planes = (List<Plane>) ois.readObject();
            return planes;
        } catch (IOException e) {
            throw new DaoException("Can not read file.", e);
        } catch (ClassNotFoundException e) {
            throw new DaoException("File not find.", e);
        }
    }

    @Override
    public void saveAllPlanes(List<Plane> planes) throws DaoException {
        if(planes==null){
            throw new InvalidArgumentExeption("Uncorrect arguments");
        }
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(planes);
        } catch (IOException e) {
            throw new DaoException("Can not write to this file.", e);
        }
    }
}
