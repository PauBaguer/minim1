package pack;

import org.javatuples.Pair;
import java.util.List;

public class Pedido {
    private Usuario usuario;
    private List <Pair<Product, Integer>> products;

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Pair<Product, Integer>> getProducts() {
        return products;
    }
}
