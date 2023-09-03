import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CadastroProdutos cp = new CadastroProdutos();
        ArrayList<Produto> produtos = new ArrayList<>();



        int o = 0;
        while(o!=5){

            menu();
            int op = s.nextInt();
            switch (op){
                case 1:
                    System.out.println("Digite o ID do produto: ");
                    int id = s.nextInt();

                    System.out.println("Digite o nome do Produto: ");
                    String nome = s.next();

                    System.out.println("Digite o preço do produto: ");
                    double preco = s.nextDouble();

                    Produto p = new Produto(id,nome,preco);
                    cp.produtos = produtos;
                    cp.adicionarProduto(p);

                break;
                case 2:
                    cp.listaProdutos();
                break;

                case 3:
                    System.out.println("Digite o ID do produto: ");
                    int identificacao = s.nextInt();
                    System.out.println("Id: "+cp.buscarProduto(identificacao).id);
                    System.out.println("nome: "+cp.buscarProduto(identificacao).nome);
                    System.out.println("preço: "+cp.buscarProduto(identificacao).preco);
                break;

                case 4:
                    System.out.println("Digite o ID do produto que deseja atualizar: ");
                    identificacao = s.nextInt();
                    System.out.println("Digite o nome: ");
                    nome = s.next();
                    System.out.println("Digite o preço: ");
                    preco = s.nextDouble();
                    cp.atualizarProduto(identificacao, nome, preco);
                break;

                case 5:
                    System.out.println("Finalizando Programa....");
                    o = 5;
                    System.out.println("Bye Bye :)....");
                    s.close();
                break;

                default:
                    System.out.println("Opção invaliada! (Tente Novamente)");
                break;

            }
        }
    }
  public static void menu(){
        System.out.println("1: Adicionar um produto");
        System.out.println("2: Listar Produtos");
        System.out.println("3: Buscar produto por ID");
        System.out.println("4: Atualizar produto");
        System.out.println("5: Sair");
    }
}