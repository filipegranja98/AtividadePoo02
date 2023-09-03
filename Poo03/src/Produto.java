import java.util.Random;

public class Produto {
    int id;
    String nome;
    double preco;

    Produto(int id, String nome , double preco){
        this.id = id;
        this.nome = nome;
        this.preco = preco;

    }
    Produto(String nome , double preco){
        Random random = new Random();
        this.id = random.nextInt(100000);
        this.nome = nome;
        this.preco = preco;

    }
    void mostrarDetalhes(){
        System.out.println("Id: "+id);
        System.out.println("Nome: "+nome);
        System.out.println("Preço: R$"+preco);
        System.out.println(" ");
    }

}
