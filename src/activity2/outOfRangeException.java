package activity2;

public class outOfRangeException extends Exception{

    public outOfRangeException() {
        this("The value entered is not in the specified range of values");
    }

    public outOfRangeException(String msg) {
        super(msg);
    }

}
