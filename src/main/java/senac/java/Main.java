package senac.java;
import senac.java.Services.Server;
import senac.java.Views.Telas;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Server servidor = new Server();
        Telas tela = new Telas();

        servidor.apiServer();
        //tela.telaInicial();

    }
}