package lecture.mid.exception.ex2;

public class NetworkClientExceptionV2 extends Exception {
    private final String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
