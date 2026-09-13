import java.util.ArrayList;

public class ListaCompras {

    ArrayList<String> produtos = new ArrayList<>();

    public void adicionar(String produto){
        produtos.add(produto);
    }

    public void remover(String produto){
        produtos.remove(produto);
    }

    public void listar(){
        for (String p : produtos){
            System.out.println(p);
        }
    }

    public void marcar_comprado(String produto){
        for (int i = 0; i < produtos.size(); i++){
            if (produtos.get(i).equals(produto)){
                produtos.set(i,produto + " - comprado");
            }
        }
    }

    public int total(){
        return produtos.size();
    }
}
