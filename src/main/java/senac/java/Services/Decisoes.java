package senac.java.Services;

import senac.java.Views.Telas;

public class Decisoes {
    public static void escolhaUsuario(String decisao, String tela){
        Telas telas = new Telas();
        Cadastrar cadastro = new Cadastrar();

        if(decisao.equals("S") || decisao.equals("s")){
            if(tela.equals("Vendedor")){
                cadastro.cadastrarVendedor();
            }else if (tela.equals("Cliente")){
                cadastro.cadastrarCliente();
            }
        }else if(decisao.equals("N") || decisao.equals("n")){
            telas.telaInicial();
        }else{
            System.out.println("cheguei no generico");
        }
    }
}
