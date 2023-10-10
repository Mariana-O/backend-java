package senac.java.Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import senac.java.Services.ResponseEndPoint;

import java.io.IOException;
import org.json.JSONObject;

public class SalesPersonController {
    static ResponseEndPoint res = new ResponseEndPoint();
   public static class SPHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
            //String response = products.pName + "" + products.pColor + "" + products.pPrice;
            String response = "";

          JSONObject resposta = new JSONObject();
//
         resposta.accumulate("key1","value");
         resposta.accumulate("key1", "value2");
//            System.out.println(resposta.toString(3));

            if ("GET".equals((exchange.getRequestMethod()))) {
//                response = "Essa é a rota vendedor - GET";
                res.enviarResponseJson(exchange, resposta);
                ;
            } else if ("POST".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota vendedor- POST";
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota vendedor - PUT";
                res.enviarResponse(exchange, response);
            } else if ("DELETE".equals(exchange.getRequestMethod())) {
                response = "Essa é a rota vendedor - DELETE";
                res.enviarResponse(exchange, response);
            } else {
                response = "Essa é a rota de vendedor - método não disponivel" +
                        "O método utilizado foi: " + exchange.getRequestMethod() ;
                res.enviarResponse(exchange, response);
            }
        }
    }
}
