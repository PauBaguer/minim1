package pack;

public class Product implements Comparable<Product>{
    private String nombre;
    private double precio;
    private int cantidadVendidos;


    public Product(String nombre, double precio, int cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getCantidadVendidos() {
        return cantidadVendidos;
    }



    public void comprar(int cantidad){
        this.cantidadVendidos += cantidad;
    }

    @Override
    public int compareTo(Product o) {
        return Double.compare(this.precio, o.precio);
    }


}
