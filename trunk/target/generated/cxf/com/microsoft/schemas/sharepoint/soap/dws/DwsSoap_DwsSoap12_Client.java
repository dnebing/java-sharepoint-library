
package com.microsoft.schemas.sharepoint.soap.dws;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-05T11:03:09.137+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class DwsSoap_DwsSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.microsoft.com/sharepoint/soap/dws/", "Dws");

    private DwsSoap_DwsSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = Dws.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        Dws ss = new Dws(wsdlURL, SERVICE_NAME);
        DwsSoap port = ss.getDwsSoap12();  
        
        {
        System.out.println("Invoking updateDwsData...");
        java.lang.String _updateDwsData_updates = "";
        java.lang.String _updateDwsData_meetingInstance = "";
        java.lang.String _updateDwsData__return = port.updateDwsData(_updateDwsData_updates, _updateDwsData_meetingInstance);
        System.out.println("updateDwsData.result=" + _updateDwsData__return);


        }
        {
        System.out.println("Invoking getDwsData...");
        java.lang.String _getDwsData_document = "";
        java.lang.String _getDwsData_lastUpdate = "";
        java.lang.String _getDwsData__return = port.getDwsData(_getDwsData_document, _getDwsData_lastUpdate);
        System.out.println("getDwsData.result=" + _getDwsData__return);


        }
        {
        System.out.println("Invoking deleteDws...");
        java.lang.String _deleteDws__return = port.deleteDws();
        System.out.println("deleteDws.result=" + _deleteDws__return);


        }
        {
        System.out.println("Invoking findDwsDoc...");
        java.lang.String _findDwsDoc_id = "";
        java.lang.String _findDwsDoc__return = port.findDwsDoc(_findDwsDoc_id);
        System.out.println("findDwsDoc.result=" + _findDwsDoc__return);


        }
        {
        System.out.println("Invoking createFolder...");
        java.lang.String _createFolder_url = "";
        java.lang.String _createFolder__return = port.createFolder(_createFolder_url);
        System.out.println("createFolder.result=" + _createFolder__return);


        }
        {
        System.out.println("Invoking deleteFolder...");
        java.lang.String _deleteFolder_url = "";
        java.lang.String _deleteFolder__return = port.deleteFolder(_deleteFolder_url);
        System.out.println("deleteFolder.result=" + _deleteFolder__return);


        }
        {
        System.out.println("Invoking getDwsMetaData...");
        java.lang.String _getDwsMetaData_document = "";
        java.lang.String _getDwsMetaData_id = "";
        boolean _getDwsMetaData_minimal = false;
        java.lang.String _getDwsMetaData__return = port.getDwsMetaData(_getDwsMetaData_document, _getDwsMetaData_id, _getDwsMetaData_minimal);
        System.out.println("getDwsMetaData.result=" + _getDwsMetaData__return);


        }
        {
        System.out.println("Invoking canCreateDwsUrl...");
        java.lang.String _canCreateDwsUrl_url = "";
        java.lang.String _canCreateDwsUrl__return = port.canCreateDwsUrl(_canCreateDwsUrl_url);
        System.out.println("canCreateDwsUrl.result=" + _canCreateDwsUrl__return);


        }
        {
        System.out.println("Invoking removeDwsUser...");
        java.lang.String _removeDwsUser_id = "";
        java.lang.String _removeDwsUser__return = port.removeDwsUser(_removeDwsUser_id);
        System.out.println("removeDwsUser.result=" + _removeDwsUser__return);


        }
        {
        System.out.println("Invoking createDws...");
        java.lang.String _createDws_name = "";
        java.lang.String _createDws_users = "";
        java.lang.String _createDws_title = "";
        java.lang.String _createDws_documents = "";
        java.lang.String _createDws__return = port.createDws(_createDws_name, _createDws_users, _createDws_title, _createDws_documents);
        System.out.println("createDws.result=" + _createDws__return);


        }
        {
        System.out.println("Invoking renameDws...");
        java.lang.String _renameDws_title = "";
        java.lang.String _renameDws__return = port.renameDws(_renameDws_title);
        System.out.println("renameDws.result=" + _renameDws__return);


        }

        System.exit(0);
    }

}
