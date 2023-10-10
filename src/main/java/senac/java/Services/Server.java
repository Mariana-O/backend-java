package senac.java.Services;

        import com.sun.net.httpserver.HttpServer;

        import senac.java.Controllers.ProductController;
        import senac.java.Controllers.SalesPersonController;
        import senac.java.Controllers.UserControler;


        import java.io.IOException;
        import java.net.InetSocketAddress;


public class Server { //Classe
    public static void apiServer() throws IOException { //método
        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);
//      server.createContext("/api/user", Server::chamar);
        server.createContext("/api/usuarios", new UserControler.UserHandler());
        server.createContext("/api/produtos", new ProductController.ProductsHandler());
        server.createContext("/api/vendedor", new SalesPersonController.SPHandler());


        server.setExecutor(null);
        System.out.println("Servidor iniciado");
        server.start();
    }

}

