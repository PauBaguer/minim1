package pack;

import java.util.LinkedList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<Pedido> listaPedidos;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.listaPedidos = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pedido> getListaPedidos() {
        return listaPedidos;
    }
}
