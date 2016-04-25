package javaapplication11;

import webservice.IOException_Exception;
import webservice.JSONException_Exception;

public class JavaApplication11 {
    public static void main(String[] args) throws IOException_Exception, JSONException_Exception {
        features(1);
        template(1);
    }

    private static String features(int id) throws IOException_Exception, JSONException_Exception {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.features(id);
    }

    private static String template(int tempId) {
        webservice.NewWebService_Service service = new webservice.NewWebService_Service();
        webservice.NewWebService port = service.getNewWebServicePort();
        return port.template(tempId);
    }
}
