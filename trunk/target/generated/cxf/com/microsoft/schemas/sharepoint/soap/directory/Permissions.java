package com.microsoft.schemas.sharepoint.soap.directory;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:10.774+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "Permissions", 
                  wsdlLocation = "file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/permissions.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/") 
public class Permissions extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "Permissions");
    public final static QName PermissionsSoap = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "PermissionsSoap");
    public final static QName PermissionsSoap12 = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "PermissionsSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/permissions.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Permissions.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/home/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/permissions.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Permissions(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Permissions(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Permissions() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Permissions(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Permissions(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public Permissions(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns PermissionsSoap
     */
    @WebEndpoint(name = "PermissionsSoap")
    public PermissionsSoap getPermissionsSoap() {
        return super.getPort(PermissionsSoap, PermissionsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PermissionsSoap
     */
    @WebEndpoint(name = "PermissionsSoap")
    public PermissionsSoap getPermissionsSoap(WebServiceFeature... features) {
        return super.getPort(PermissionsSoap, PermissionsSoap.class, features);
    }
    /**
     *
     * @return
     *     returns PermissionsSoap
     */
    @WebEndpoint(name = "PermissionsSoap12")
    public PermissionsSoap getPermissionsSoap12() {
        return super.getPort(PermissionsSoap12, PermissionsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns PermissionsSoap
     */
    @WebEndpoint(name = "PermissionsSoap12")
    public PermissionsSoap getPermissionsSoap12(WebServiceFeature... features) {
        return super.getPort(PermissionsSoap12, PermissionsSoap.class, features);
    }

}