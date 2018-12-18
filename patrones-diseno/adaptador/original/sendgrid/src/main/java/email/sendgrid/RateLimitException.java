package email.sendgrid;

import com.sendgrid.Request;

class RateLimitException extends Exception {

    private final Request request;
    private final int retryCount;

    /**
     * Construct a new exception.
     * @param request the originating request object.
     * @param retryCount the number of times a retry was attempted.
     */
    public RateLimitException(Request request, int retryCount) {
        this.request = request;
        this.retryCount = retryCount;
    }

    /**
     * Get the originating request object.
     * @return the request object.
     */
    public Request getRequest() {
        return this.request;
    }

    /**
     * Get the number of times the action was attemted.
     * @return the retry count.
     */
    public int getRetryCount() {
        return this.retryCount;
    }

}
