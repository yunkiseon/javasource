package lang;

public class NotExistIDException extends Exception {
    public NotExistIDException() {

    }

    public NotExistIDException(String messege) {
        super(messege);
    }
}
