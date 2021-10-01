package pack;

import java.util.List;

public interface ProductManager {
    List<Product> sortByPrice();

    List<Product> sortBySells();

    void filterDone();

    void realizarPedido(Pedido);
}
