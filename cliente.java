/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servweb;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
//importamos la interface
import servweb.Mensaje;
public class cliente {
    public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/mensaje?wsdl");

        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://servweb/", "ServWebService");

        Service service = Service.create(url, qname);

        Mensaje hello = service.getPort(Mensaje.class);

        System.out.println(hello.metodoWeb("Hecho!"));

    }
    
}
