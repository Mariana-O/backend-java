package senac.java.Services;
import java.util.Scanner;

public class Cadastrar{

   static Scanner sc = new Scanner(System.in);


    public static String cadastrarVendedor() {
    String cadastroVendedor = "";

    System.out.println("Nome do vendedor:");
    cadastroVendedor = sc.nextLine();

    return cadastroVendedor;
    }

    public static String cadastroCliente(){
        String cadastroCliente = "";

        System.out.println("nome do Cliente:");
        cadastroCliente = sc.nextLine();

        return cadastroCliente;

    }

    public static String cadastroProduto(){
        String cadastroProduto = "";

        System.out.println("nome do Produto:");
        cadastroProduto = sc.nextLine();

        return cadastroProduto;



    }
}
