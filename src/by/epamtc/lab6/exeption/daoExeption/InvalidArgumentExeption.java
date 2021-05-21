package by.epamtc.lab6.exeption.daoExeption;

import by.epamtc.lab6.exeption.daoExeption.DaoException;

public class InvalidArgumentExeption extends DaoException {
    public InvalidArgumentExeption() {
        super();
    }

    public InvalidArgumentExeption(String message) {
        super(message);
    }

    public InvalidArgumentExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidArgumentExeption(Throwable cause) {
        super(cause);
    }
}
