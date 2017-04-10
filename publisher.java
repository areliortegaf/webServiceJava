/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servweb;

import javax.xml.ws.Endpoint;
//importamos el servweb
import servweb.ServWeb;
//corre el web service
public class publisher {
    public static void main(String[] args) {
	   Endpoint.publish("http://localhost:9999/ws/mensaje", new ServWeb());
    }
    //probar con http://localhost:9999/ws/mensaje?wsdl
}
