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
 * 2012-11-10T16:48:47.986+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebServiceClient(name = "UserGroup", 
                  wsdlLocation = "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/usergroup.wsdl",
                  targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/") 
public class UserGroup extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroup");
    public final static QName UserGroupSoap = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap");
    public final static QName UserGroupSoap12 = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap12");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/usergroup.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(UserGroup.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/vkorecky/workspace/JavaSharepoint/java-sharepoint/src/main/resources/wsdl/usergroup.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public UserGroup(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public UserGroup(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserGroup() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserGroup(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserGroup(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public UserGroup(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     *
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap")
    public UserGroupSoap getUserGroupSoap() {
        return super.getPort(UserGroupSoap, UserGroupSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap")
    public UserGroupSoap getUserGroupSoap(WebServiceFeature... features) {
        return super.getPort(UserGroupSoap, UserGroupSoap.class, features);
    }
    /**
     *
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap12")
    public UserGroupSoap getUserGroupSoap12() {
        return super.getPort(UserGroupSoap12, UserGroupSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap12")
    public UserGroupSoap getUserGroupSoap12(WebServiceFeature... features) {
        return super.getPort(UserGroupSoap12, UserGroupSoap.class, features);
    }

}