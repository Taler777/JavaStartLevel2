package Java2Lesson2;

public class MyArrayDataException extends Exception {
    private String reason;

    MyArrayDataException(String r) {
        this.reason = r;
    }

    @Override
    public String getMessage() {
        return reason;
    }
}
