package com.pac;

public class Web1Proxy implements com.pac.Web1 {
  private String _endpoint = null;
  private com.pac.Web1 web1 = null;
  
  public Web1Proxy() {
    _initWeb1Proxy();
  }
  
  public Web1Proxy(String endpoint) {
    _endpoint = endpoint;
    _initWeb1Proxy();
  }
  
  private void _initWeb1Proxy() {
    try {
      web1 = (new com.pac.Web1ServiceLocator()).getWeb1();
      if (web1 != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)web1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)web1)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (web1 != null)
      ((javax.xml.rpc.Stub)web1)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.pac.Web1 getWeb1() {
    if (web1 == null)
      _initWeb1Proxy();
    return web1;
  }
  
  public int add(int a, int b) throws java.rmi.RemoteException{
    if (web1 == null)
      _initWeb1Proxy();
    return web1.add(a, b);
  }
  
  public int sub(int a, int b) throws java.rmi.RemoteException{
    if (web1 == null)
      _initWeb1Proxy();
    return web1.sub(a, b);
  }
  
  
}