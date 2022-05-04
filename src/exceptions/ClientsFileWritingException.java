package exceptions;

public class ClientsFileWritingException extends Exception {

    public ClientsFileWritingException(String message) {
        super(message);
    }

    public ClientsFileWritingException(String message, Throwable cause) {
        super(message, cause);
    }
}
