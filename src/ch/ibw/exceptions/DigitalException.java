package ch.ibw.exceptions;

/**
 * Created by Michele on 25.10.2016.
 */
public class DigitalException  extends RuntimeException {

    public DigitalException() {
        super("ungültige Zeichen");
    }
}
