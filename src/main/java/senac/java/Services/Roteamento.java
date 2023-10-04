package senac.java.Services;
import senac.java.Views.Telas;
import senac.java.Domain.Cadastros;

import static java.lang.System.exit;

public class Roteamento {
    static Cadastros cadastros = new Cadastros();
    static Telas telas = new Telas();
    static Cadastrar cadastrar = new Cadastrar();


    public static void rotas(int escolha) {

        switch (escolha) {
            case 1:
                cadastrar.cadastrarVendedor();
                break;
            case 2:
                cadastrar.cadastrarCliente();
                break;
            case 3:
                cadastrar.cadastrarProduto();
                break;
            case 4:
                exit(0);
                break;
            default:
                System.out.println("Por favor, digite um numero de 1 a 3");
                telas.telaInicial();
                break;
        }

    }
}
