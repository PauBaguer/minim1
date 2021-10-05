package pack;

import java.util.*;

public class ProductManagerImpl implements ProductManager{

    private ProductManagerImpl instance;
    private Queue<Pedido> colaPedidos;
    private List<Product> listaProductos;
    private HashMap<String, Usuario> usuarioHashMap;

    private ProductManagerImpl() {
        colaPedidos = new LinkedList<>();
        listaProductos = new LinkedList<>();
        usuarioHashMap = new HashMap<>();
    }

    //singleton
    public ProductManagerImpl getInstance(){
        if(instance==null) instance = new ProductManagerImpl();
        return instance;
    }

    @Override
    public List<Product> sortByPrice() {
        List<Product> l = new LinkedList<>(listaProductos);
        l.sort(Product::compareTo);
        return l;
    }

    @Override
    public List<Product> sortBySells() {
        List<Product> l = new LinkedList<>(listaProductos);
        Comparator<Product> c = new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Integer.compare(o1.getCantidadVendidos(), o2.getCantidadVendidos());
            }
        };
        l.sort(c);
        return l;
    }


    @Override
    public void realizarPedido(Pedido p) {
        p.getProducts().forEach(productPair -> {
            productPair.getValue0().comprar(productPair.getValue1());
        });
        p.getUsuario().getListaPedidos().add(p);
        colaPedidos.add(p);
    }

    @Override
    public void servirPedido() {
        colaPedidos.poll();
    }

    @Override
    public List<Pedido> pedidosDeUsuario(Usuario u) {
        return u.getListaPedidos();
    }
}
