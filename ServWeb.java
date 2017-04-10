/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servweb;

import javax.jws.WebService;

//Implementacion del servicio
@WebService(endpointInterface = "servweb.Mensaje")
public class ServWeb implements Mensaje{
    //aqui implementa la interface
@Override
	public String metodoWeb(String cadenaDeCaracteres) {
		return "Mensaje: " + cadenaDeCaracteres;
	}

   
    
}
