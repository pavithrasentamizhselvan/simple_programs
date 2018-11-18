/**
 * Web1ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.pac;

public class Web1ServiceLocator extends org.apache.axis.client.Service implements com.pac.Web1Service {

    public Web1ServiceLocator() {
    }


    public Web1ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Web1ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for Web1
    private java.lang.String Web1_address = "http://localhost:8080/Hello/services/Web1";

    public java.lang.String getWeb1Address() {
        return Web1_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String Web1WSDDServiceName = "Web1";

    public java.lang.String getWeb1WSDDServiceName() {
        return Web1WSDDServiceName;
    }

    public void setWeb1WSDDServiceName(java.lang.String name) {
        Web1WSDDServiceName = name;
    }

    public com.pac.Web1 getWeb1() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(Web1_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getWeb1(endpoint);
    }

    public com.pac.Web1 getWeb1(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.pac.Web1SoapBindingStub _stub = new com.pac.Web1SoapBindingStub(portAddress, this);
            _stub.setPortName(getWeb1WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setWeb1EndpointAddress(java.lang.String address) {
        Web1_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.pac.Web1.class.isAssignableFrom(serviceEndpointInterface)) {
                com.pac.Web1SoapBindingStub _stub = new com.pac.Web1SoapBindingStub(new java.net.URL(Web1_address), this);
                _stub.setPortName(getWeb1WSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("Web1".equals(inputPortName)) {
            return getWeb1();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://pac.com", "Web1Service");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://pac.com", "Web1"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("Web1".equals(portName)) {
            setWeb1EndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
