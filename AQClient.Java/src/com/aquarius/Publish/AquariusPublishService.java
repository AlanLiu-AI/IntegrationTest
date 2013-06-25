
package com.aquarius.Publish;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6b21 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AquariusPublishService", targetNamespace = "http://tempuri.org/", wsdlLocation = "http://aq-demo-server/AQUARIUS/Publish/AquariusPublishService.svc?wsdl")
public class AquariusPublishService
    extends Service
{

    private final static URL AQUARIUSPUBLISHSERVICE_WSDL_LOCATION;
    private final static WebServiceException AQUARIUSPUBLISHSERVICE_EXCEPTION;
    private final static QName AQUARIUSPUBLISHSERVICE_QNAME = new QName("http://tempuri.org/", "AquariusPublishService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://aq-demo-server/AQUARIUS/Publish/AquariusPublishService.svc?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        AQUARIUSPUBLISHSERVICE_WSDL_LOCATION = url;
        AQUARIUSPUBLISHSERVICE_EXCEPTION = e;
    }

    public AquariusPublishService() {
        super(__getWsdlLocation(), AQUARIUSPUBLISHSERVICE_QNAME);
    }

    public AquariusPublishService(WebServiceFeature... features) {
        super(__getWsdlLocation(), AQUARIUSPUBLISHSERVICE_QNAME, features);
    }

    public AquariusPublishService(URL wsdlLocation) {
        super(wsdlLocation, AQUARIUSPUBLISHSERVICE_QNAME);
    }

    public AquariusPublishService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, AQUARIUSPUBLISHSERVICE_QNAME, features);
    }

    public AquariusPublishService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AquariusPublishService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAquariusPublishService
     */
    @WebEndpoint(name = "BasicHttpBinding_IAquariusPublishService")
    public IAquariusPublishService getBasicHttpBindingIAquariusPublishService() {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IAquariusPublishService"), IAquariusPublishService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAquariusPublishService
     */
    @WebEndpoint(name = "BasicHttpBinding_IAquariusPublishService")
    public IAquariusPublishService getBasicHttpBindingIAquariusPublishService(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "BasicHttpBinding_IAquariusPublishService"), IAquariusPublishService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (AQUARIUSPUBLISHSERVICE_EXCEPTION!= null) {
            throw AQUARIUSPUBLISHSERVICE_EXCEPTION;
        }
        return AQUARIUSPUBLISHSERVICE_WSDL_LOCATION;
    }

}
