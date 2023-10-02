package senac.java.Views;
import senac.java.Domain.Users;
import senac.java.Domain.Products;
import senac.java.Domain.SalesPerson;


import java.util.Scanner;

public class Cadastrar{

   static Scanner sc = new Scanner(System.in);
   static SalesPerson salesperson = new SalesPerson();
   static Users user = new Users();
   static Products product = new Products();


    public static int cadastrarVendedor() {
    System.out.println("Cadastro de Vendedores");
    System.out.println();

    System.out.println("Nome do vendedor:");
    salesperson.name = sc.nextLine();

    System.out.println("Sobrenome do vendedor:");
    salesperson.lastName = sc.nextLine();

    System.out.println("Idade do usuário:");
    salesperson.phoneNumber = sc.nextLine();

    System.out.println("Digite seu email:");
    salesperson.cpf = sc.nextLine();

    System.out.println("Digite sua senha:");
    salesperson.email = sc.nextLine();

        return 0;
    }

    public static void cadastrarCliente() {
        System.out.println("Cadastro de Usuários");
        System.out.println();

        System.out.println("nome do usuário:");
        user.name = sc.nextLine();

        System.out.println("Sobrenome do usuário:");
        user.lastName = sc.nextLine();

        System.out.println("Idade do usuário:");
        user.age = Integer.parseInt(sc.nextLine());

        System.out.println("Digite seu email:");
        user.email = sc.nextLine();

        System.out.println("Digite sua senha:");
        user.password = sc.nextLine();

    }

    public static void cadastrarProduto(){
        System.out.println("Cadastro de Produtos");
        System.out.println();

        System.out.println("nome do produto:");
        product.pName = sc.nextLine();

        System.out.println("preço do produto:");
        product.pPrice = sc.nextLine();

        System.out.println("cor do produto:");
        product.pColor = sc.nextLine();

        System.out.println("descrição do produto:");
        product.pDescription = sc.nextLine();

        System.out.println("quantidade do produto:");
        product.pQuantity = Integer.parseInt(sc.nextLine());

        System.out.println("imagem do produto:");
        product.pImg = sc.nextLine();

    }
}
