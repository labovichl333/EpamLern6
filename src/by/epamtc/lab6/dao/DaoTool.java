package by.epamtc.lab6.dao;

import by.epamtc.lab6.exeption.daoExeption.DaoException;
import by.epamtc.lab6.exeption.daoExeption.InvalidArgumentExeption;

import java.util.List;

public interface DaoTool<T> {
    List<T> getAllPlanes() throws DaoException;

    void saveAllPlanes(List<T> planes) throws DaoException;

}
