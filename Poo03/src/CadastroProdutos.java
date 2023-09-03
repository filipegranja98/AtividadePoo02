import java.util.ArrayList;

public class CadastroProdutos {
    ArrayList<Produto> produtos;

    void adicionarProduto(Produto produto){
        produtos.add(produto);
        System.out.println("Produto Cadastrado com sucesso!");
    }

    void listaProdutos(){
        for(int i = 0; i<produtos.size();i++){
            produtos.get(i).mostrarDetalhes();
        }
    }

    public Produto buscarProduto(int identificador){
        for(int i = 0; i<produtos.size();i++){
            if(produtos.get(i).id == identificador){
                return this.produtos.get(i);
            }
        }
        return null;

    }
    public void atualizarProduto(int identificador, String novoNome,double novoPreco){
        Produto produtoPesquisado = this.buscarProduto(identificador);
        if(produtoPesquisado !=null){
            produtoPesquisado.nome = novoNome;
            produtoPesquisado.preco = novoPreco;
        }
    }
}
