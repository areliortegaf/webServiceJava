
package servweb;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
//Los import se usan con las anataciones de abajo.
@WebService
@SOAPBinding(style = Style.RPC)

public interface Mensaje {
    //para crear un metodo de un web service
    @WebMethod String metodoWeb(String cadenaDeCaracteres);
}
