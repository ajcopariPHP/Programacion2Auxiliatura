package Ejercicio11;
public class Pedido {

    private int idPedido;
    private String estado; 

    public Pedido(int idPedido, String estado) {
        this.idPedido = idPedido;
        this.estado = estado;
    }
    public int getIdPedido() {
        return idPedido;
    }
    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    // Destructor (simulado con finalize)
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Objeto Pedido eliminado de memoria.");
    }
    @Override
    public String toString() {
        return "Pedido #" + idPedido + " | Estado: " + estado;
    }
}