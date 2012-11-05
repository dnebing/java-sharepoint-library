package com.microsoft.schemas.sharepoint.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:10.636+01:00
 * Generated source version: 2.7.0
 * 
 */
@WebService(targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", name = "PeopleSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface PeopleSoap {

    @WebResult(name = "IsClaimsModeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "IsClaimsMode", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.IsClaimsMode")
    @WebMethod(operationName = "IsClaimsMode", action = "http://schemas.microsoft.com/sharepoint/soap/IsClaimsMode")
    @ResponseWrapper(localName = "IsClaimsModeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.IsClaimsModeResponse")
    public boolean isClaimsMode();

    @WebResult(name = "SearchPrincipalsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "SearchPrincipals", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.SearchPrincipals")
    @WebMethod(operationName = "SearchPrincipals", action = "http://schemas.microsoft.com/sharepoint/soap/SearchPrincipals")
    @ResponseWrapper(localName = "SearchPrincipalsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.SearchPrincipalsResponse")
    public com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo searchPrincipals(
        @WebParam(name = "searchText", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.lang.String searchText,
        @WebParam(name = "maxResults", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        int maxResults,
        @WebParam(name = "principalType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.util.List<java.lang.String> principalType
    );

    @WebResult(name = "ResolvePrincipalsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "ResolvePrincipals", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.ResolvePrincipals")
    @WebMethod(operationName = "ResolvePrincipals", action = "http://schemas.microsoft.com/sharepoint/soap/ResolvePrincipals")
    @ResponseWrapper(localName = "ResolvePrincipalsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.ResolvePrincipalsResponse")
    public com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo resolvePrincipals(
        @WebParam(name = "principalKeys", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        com.microsoft.schemas.sharepoint.soap.ArrayOfString principalKeys,
        @WebParam(name = "principalType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        java.util.List<java.lang.String> principalType,
        @WebParam(name = "addToUserInfoList", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        boolean addToUserInfoList
    );
}
