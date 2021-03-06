
package webservices;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "WebServicesClient1", targetNamespace = "http://webservices/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface WebServicesClient1 {


    /**
     * 
     * @param activity
     */
    @WebMethod
    @RequestWrapper(localName = "addActivity", targetNamespace = "http://webservices/", className = "webservices.AddActivity")
    @ResponseWrapper(localName = "addActivityResponse", targetNamespace = "http://webservices/", className = "webservices.AddActivityResponse")
    @Action(input = "http://webservices/WebServicesClient1/addActivityRequest", output = "http://webservices/WebServicesClient1/addActivityResponse")
    public void addActivity(
        @WebParam(name = "Activity", targetNamespace = "")
        Activity activity);

}
