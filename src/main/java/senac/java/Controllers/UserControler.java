package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONObject;
import senac.java.Services.ResponseEndPoint;

import java.io.IOException;

public class UserControler {

    static ResponseEndPoint res = new ResponseEndPoint();

    public static class UserHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
//            String response = user.name + "" + user.lastName + "" + user.age;


            String response = "";

            if ("GET".equals((exchange.getRequestMethod()))) {
                response = "Essa é a rota usuario - GET";
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota usuario - POST";
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota usuario - PUT";
                res.enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota usuario - DELETE";
                res.enviarResponse(exchange, response);
            }else {
                response = "Essa é a rota de usuario - método não disponivel" +
                        "O método utilizado foi: " + exchange.getRequestMethod() ;
                res.enviarResponse(exchange, response);
            }
        }
    }
}
