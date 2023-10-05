package senac.java.Services;

        import com.sun.net.httpserver.HttpServer;
        import com.sun.net.httpserver.HttpHandler;
        import com.sun.net.httpserver.HttpExchange;
        import senac.java.Domain.Users;

        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.InetSocketAddress;
        import java.net.http.HttpResponse;

public class Server{

    public void apiServer()throws IOException {
        Users user = new Users();


        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);

//        final URI urlPath;

//        HttpExchange ex;

//        urlPath = ex.getLocalAddress();

        System.out.println("a url q veio do nav foi");

        server.createContext("/api/user", (HttpExchange exchange) -> {
//          urlPath =  exchange.getRequestURI();
                    if ("GET".equals(exchange.getRequestMethod())) {
                        String response = user.name + " " + user.lastName + " " + user.age;
                        System.out.println("");
                        exchange.sendResponseHeaders(200, response.getBytes().length);


                        OutputStream os = exchange.getResponseBody();
                        os.write(response.getBytes());
                        os.close();
                    } else {
                        String response = "Método não implementado";
                        exchange.sendResponseHeaders(405, response.getBytes().length);

                        OutputStream os = exchange.getResponseBody();
                        os.write(response.getBytes());
                        os.close();
                    }

                }
        );
        server.setExecutor(null);
        System.out.println("Servidor iniciado");
        server.start();
    }
}
