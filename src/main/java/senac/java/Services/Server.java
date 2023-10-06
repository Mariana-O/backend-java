package senac.java.Services;

        import com.sun.net.httpserver.HttpServer;
        import com.sun.net.httpserver.HttpHandler;
        import com.sun.net.httpserver.HttpExchange; //Tratamento/Manipulação de dados
        import senac.java.Domain.Products;
        import senac.java.Domain.SalesPerson;
        import senac.java.Domain.Users;

        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.InetSocketAddress;
        import java.net.http.HttpResponse;

public class Server { //Classe
    HttpServer server;
    Users user = new Users();
    Products products = new Products();

    SalesPerson salesperson = new SalesPerson();

    public void apiServer() throws IOException { //método
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);
//      server.createContext("/api/user", Server::chamar);
        server.createContext("/api/usuarios", new UserHandler());
        server.createContext("/api/produtos", new ProductsHandler());
        server.createContext("/api/vendedor", new SalesPersonHandler());


        server.setExecutor(null);
        System.out.println("Servidor iniciado");
        server.start();
    }


    //    public static void chamar(HttpExchange exchange) throws IOException { //método
//
//        if ("GET".equals(exchange.getRequestMethod())) {
//            String response = "cheguei aqui";
//            System.out.println("");
//            exchange.sendResponseHeaders(200, response.getBytes().length);
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        } else {
//            String response = "Método não implementado";
//            exchange.sendResponseHeaders(405, response.getBytes().length);
//            OutputStream os = exchange.getResponseBody();
//            os.write(response.getBytes());
//            os.close();
//        }
//    }
    public static void enviarResponse(HttpExchange exchange, String response)
            throws IOException {
        if ("GET".equals(exchange.getRequestMethod())) {
            exchange.sendResponseHeaders(200, response.getBytes().length);

            OutputStream os = exchange.getResponseBody(); // criando um espaço em branco para trafego
            os.write(response.getBytes()); // esperando o conteudo da variavel "response" para escrever no espaço em branco
            os.close(); //fecha a porta
        }
    }

    class UserHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {
//            String response = user.name + "" + user.lastName + "" + user.age;
            String response = "Rota Usuario";
            enviarResponse(exchange, response);
        }
    }


    class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException{
            //String response = products.pName + "" + products.pColor + "" + products.pPrice;
            String response = "Rota Produtos";
            enviarResponse(exchange, response);
        }
    }

    class SalesPersonHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException{
           // String response = salesperson.name + "" + salesperson.lastName + "" + salesperson.email;
            String response = "Rota Vendedor";
              enviarResponse(exchange, response);
        }
    }
}
