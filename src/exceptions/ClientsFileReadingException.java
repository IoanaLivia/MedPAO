package exceptions;

public class ClientsFileReadingException extends Exception {

    public ClientsFileReadingException(String message) {
        super(message);
    }

    public ClientsFileReadingException(String message, Throwable cause) {
        super(message, cause);
    }
}

