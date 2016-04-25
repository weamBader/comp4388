/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webService;
import ed.bzu.webservice.json.TestParsingWithJSON;
import ed.bzu.webservice.json.TestParsingWithJSON1;
import java.io.IOException;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import org.json.JSONException;

/**
 *
 * @author Weam
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param id
     * @return 
     * @throws org.json.JSONException
     * @throws java.io.IOException
     */
    @WebMethod(operationName = "Features")
    public String Features(@WebParam(name = "id") int id) throws JSONException, IOException {
        TestParsingWithJSON p = new TestParsingWithJSON();
        StringBuilder result = p.main(1);
        return result.toString();
    }

    /**
     * Web service operation
     * @param id
     * @return 
     * @throws org.json.JSONException 
     * @throws java.io.IOException 
     */
    //@WebMethod(operationName = "Template")
//    public String Template(@WebParam(name = "id") int id) throws JSONException, IOException {
//        //TODO write your implementation code here:
//        TestParsingWithJSON1 p1 = new TestParsingWithJSON1();
//        StringBuilder result1 = p1.main(2);
//        return result1.toString();
//    }
//}
    }