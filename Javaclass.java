package com.pac;

import java.net.MalformedURLException;

public class Javaclass {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
java.net.URL end=new java.net.URL("http://localhost:8080/Hello/services/Web1");
org.apache.axis.client.Service ser=new org.apache.axis.client.Service();
Web1SoapBindingStub stub=new Web1SoapBindingStub(end, ser);
int a=stub.add(10, 20);
System.out.println("Resl"+a);
	}

}
