package pack;

import org.javatuples.Pair;
import java.util.List;

public class Pedido {
    private Usuario usuario;
    private List <Pair<Product, Integer>> products;

    public Pedido(Usuario usuario, List<Pair<Product, Integer>> products) {
        this.usuario = usuario;
        this.products = products;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Pair<Product, Integer>> getProducts() {
        return products;
    }
}
