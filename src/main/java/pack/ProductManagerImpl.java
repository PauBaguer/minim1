package pack;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class ProductManagerImpl implements ProductManager{

    private ProductManagerImpl instance;
    private Queue<Pedido> colaPedidos;

    private ProductManagerImpl() {
        colaPedidos = new PriorityQueue<>();
    }

    //singleton
    public ProductManagerImpl getInstance(){
        if(instance==null) instance = new ProductManagerImpl();
        return instance;
    }

    @Override
    public <Product> sortByPrice() {

    }

    @Override
    public <Product>  sortBySells() {

    }

    @Override
    public void filterDone() {

    }

    @Override
    public void realizarPedido( Product) {

    }
}
