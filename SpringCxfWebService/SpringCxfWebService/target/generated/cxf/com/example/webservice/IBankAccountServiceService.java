package com.example.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2015-04-29T22:28:41.227-04:00
 * Generated source version: 3.0.2
 * 
 */
@WebServiceClient(name = "IBankAccountServiceService", 
                  wsdlLocation = "file:/C:/Users/Dell/Google%20Drive/workspace/SpringCxfWebService/src/main/resources/IBankAccountService.wsdl",
                  targetNamespace = "http://webservice.example.com/") 
public class IBankAccountServiceService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservice.example.com/", "IBankAccountServiceService");
    public final static QName IBankAccountServicePort = new QName("http://webservice.example.com/", "IBankAccountServicePort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Dell/Google%20Drive/workspace/SpringCxfWebService/src/main/resources/IBankAccountService.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(IBankAccountServiceService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Dell/Google%20Drive/workspace/SpringCxfWebService/src/main/resources/IBankAccountService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public IBankAccountServiceService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public IBankAccountServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public IBankAccountServiceService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IBankAccountServiceService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IBankAccountServiceService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public IBankAccountServiceService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns IBankAccountService
     */
    @WebEndpoint(name = "IBankAccountServicePort")
    public IBankAccountService getIBankAccountServicePort() {
        return super.getPort(IBankAccountServicePort, IBankAccountService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IBankAccountService
     */
    @WebEndpoint(name = "IBankAccountServicePort")
    public IBankAccountService getIBankAccountServicePort(WebServiceFeature... features) {
        return super.getPort(IBankAccountServicePort, IBankAccountService.class, features);
    }

}
