public class invalidNameException extends Exception{
    invalidNameException(String message){
        super(message);
    }
    invalidNameException(String message, Throwable cause){
        super(message,cause);
    }
}
