package pro.sky.homework213.exception;

public class DividingByZero extends IllegalArgumentException {

    private final String message;

    public DividingByZero(String message) {
        this.message = message;

    }

    @Override
    public String toString() {
        return message;
    }

}
