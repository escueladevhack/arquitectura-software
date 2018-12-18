package email.sendgrid;

import com.sendgrid.Response;

interface APICallback {

    /**
     * Callback method in case of an error.
     * @param ex the error that was thrown.
     */
    public void error(Exception ex);

    /**
     * Callback method in case of a valid response.
     * @param response the valid response.
     */
    public void response(Response response);

}
