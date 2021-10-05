package pack;

import java.util.List;

public class Usuario {
    private String nombre;
    private List<Pedido> listaPedidos;

    public String getNombre() {
        return nombre;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}
