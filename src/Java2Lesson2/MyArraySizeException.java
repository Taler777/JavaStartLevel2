package Java2Lesson2;

public class MyArraySizeException extends Exception {
    private String reason;

    MyArraySizeException(String r) {
        this.reason = r;
    }

    @Override
    public String getMessage() {
        return reason;
    }
}
