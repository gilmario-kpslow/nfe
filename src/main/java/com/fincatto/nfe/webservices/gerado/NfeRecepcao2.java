package com.fincatto.nfe.webservices.gerado;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.4-b01 Generated source version: 2.2
 */
@WebServiceClient(name = "NfeRecepcao2", targetNamespace = "http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", wsdlLocation = "https://homologacao.nfe.sefazvirtual.rs.gov.br/ws/nfeRecepcao/nfeRecepcao2.asmx?WSDL")
public class NfeRecepcao2 extends Service {

    private final static URL NFERECEPCAO2_WSDL_LOCATION;
    private final static WebServiceException NFERECEPCAO2_EXCEPTION;
    private final static QName NFERECEPCAO2_QNAME = new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", "NfeRecepcao2");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("https://homologacao.nfe.sefazvirtual.rs.gov.br/ws/nfeRecepcao/nfeRecepcao2.asmx?WSDL");
        } catch (final MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        NFERECEPCAO2_WSDL_LOCATION = url;
        NFERECEPCAO2_EXCEPTION = e;
    }

    public NfeRecepcao2() {
        super(NfeRecepcao2.__getWsdlLocation(), NfeRecepcao2.NFERECEPCAO2_QNAME);
    }

    public NfeRecepcao2(final WebServiceFeature... features) {
        super(NfeRecepcao2.__getWsdlLocation(), NfeRecepcao2.NFERECEPCAO2_QNAME, features);
    }

    public NfeRecepcao2(final URL wsdlLocation) {
        super(wsdlLocation, NfeRecepcao2.NFERECEPCAO2_QNAME);
    }

    public NfeRecepcao2(final URL wsdlLocation, final WebServiceFeature... features) {
        super(wsdlLocation, NfeRecepcao2.NFERECEPCAO2_QNAME, features);
    }

    public NfeRecepcao2(final URL wsdlLocation, final QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public NfeRecepcao2(final URL wsdlLocation, final QName serviceName, final WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * @return returns NfeRecepcao2Soap12
     */
    @WebEndpoint(name = "NfeRecepcao2Soap12")
    public NfeRecepcao2Soap12 getNfeRecepcao2Soap12() {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", "NfeRecepcao2Soap12"), NfeRecepcao2Soap12.class);
    }

    /**
     * @param features A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy. Supported features not in the <code>features</code> parameter will have their default values.
     * @return returns NfeRecepcao2Soap12
     */
    @WebEndpoint(name = "NfeRecepcao2Soap12")
    public NfeRecepcao2Soap12 getNfeRecepcao2Soap12(final WebServiceFeature... features) {
        return super.getPort(new QName("http://www.portalfiscal.inf.br/nfe/wsdl/NfeRecepcao2", "NfeRecepcao2Soap12"), NfeRecepcao2Soap12.class, features);
    }

    private static URL __getWsdlLocation() {
        if (NfeRecepcao2.NFERECEPCAO2_EXCEPTION != null) {
            throw NfeRecepcao2.NFERECEPCAO2_EXCEPTION;
        }
        return NfeRecepcao2.NFERECEPCAO2_WSDL_LOCATION;
    }

}
