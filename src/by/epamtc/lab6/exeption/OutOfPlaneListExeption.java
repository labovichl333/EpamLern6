package by.epamtc.lab6.exeption;

public class OutOfPlaneListExeption extends Exception{
    public OutOfPlaneListExeption() {
        super();
    }

    public OutOfPlaneListExeption(String message) {
        super(message);
    }

    public OutOfPlaneListExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public OutOfPlaneListExeption(Throwable cause) {
        super(cause);
    }
}
