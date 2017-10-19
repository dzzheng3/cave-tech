package cavetech.com.challenge.takehome.network;

/**
 * Generic exception thrown for network errors.
 */
public class NetworkError extends RuntimeException {

    private final String message;

    public NetworkError(String message) {
        this.message = message;
    }

    /**
     * @return String indicating the reason why the network request failed.
     */
    public String getMessage() {
        return message;
    }
}
