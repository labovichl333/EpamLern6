package by.epamtc.lab6.exeption.serviseExeption;

public class EmptyPlaneException extends Exception {
    public EmptyPlaneException() {
        super();
    }

    public EmptyPlaneException(String message) {
        super(message);
    }

    public EmptyPlaneException(String message, Throwable cause) {
        super(message, cause);
    }

    public EmptyPlaneException(Throwable cause) {
        super(cause);
    }
}
