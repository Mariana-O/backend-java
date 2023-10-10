package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndPoint;

import java.io.IOException;

public class ProductController

{
    static ResponseEndPoint res = new ResponseEndPoint();

    public static class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            //String response = products.pName + "" + products.pColor + "" + products.pPrice;
            String response = "";

            if ("GET".equals((exchange.getRequestMethod()))){
                response = "Essa é a rota produto - GET";
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())){
                response = "Essa é a rota produto - POST";
                res.enviarResponse(exchange, response);
            }else if ("PUT".equals(exchange.getRequestMethod())){
                response = "Essa é a rota produto  - PUT";
                res.enviarResponse(exchange, response);
            }else if ("DELETE".equals(exchange.getRequestMethod())){
                response = "Essa é a rota produto - DELETE";
                res.enviarResponse(exchange, response);
            }else {
                response = "Essa é a rota de produto - método não disponivel" +
                  "O método utilizado foi: " + exchange.getRequestMethod() ;
                res.enviarResponse(exchange, response);
            }
        }
    }
}
