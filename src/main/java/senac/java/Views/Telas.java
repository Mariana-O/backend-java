package senac.java.Views;
import java.util.Scanner;

import senac.java.Domain.SalesPerson;
import senac.java.Domain.Users;
import senac.java.Services.Decisoes;
import senac.java.Services.Roteamento;

public class Telas {

     static Scanner sc = new Scanner(System.in);

    public static void telaInicial() {
        int escolhaInput = 0;
        int novoInput= 0;
        Roteamento roteamento = new Roteamento();

        System.out.println("Bem-Vindo ao programa gerenciador de Cadastros");
        System.out.println();


        System.out.println("Selecione as opções desejadas");
        System.out.println("1.Cadastrar Vendedor");
        System.out.println("2.Cadastrar Cliente");
        System.out.println("3.Cadastrar Produto");
        System.out.println("4.Sair");
        escolhaInput = Integer.parseInt(sc.nextLine());

        Roteamento.rotas(escolhaInput);





    }
  public static void Imprimir(String telaOrigem ){
       Users user = new Users();
       SalesPerson salesperson = new SalesPerson();


        Decisoes decisao = new Decisoes();
        String userInput = "";
      userInput = sc.nextLine();

        if(telaOrigem.equals("Cliente")){
            System.out.println("Os dados de cliente digitados foram:");
            System.out.println();
            System.out.println("Nome: " + user.name);
            System.out.println("Sobrenome: " + user.lastName);
            System.out.println("Idade : " + user.age);
        }else if(telaOrigem.equals("Vendedor")){
            System.out.println("Os dados de vendedor digitados foram:");
            System.out.println();
            System.out.println("Nome: " + salesperson.name);
            System.out.println("Sobrenome: " + salesperson.lastName);
            System.out.println("Telefone : " + salesperson.phoneNumber);
        }

      System.out.println();
      System.out.println("Deseja realizar um novo cadastro?");
      System.out.println("S.Sim");
      System.out.println("N.Voltar a tela Inicial");
      System.out.println("O.Sair");

     userInput = sc.nextLine();
      decisao.escolhaUsuario(userInput, telaOrigem);
  }
}
