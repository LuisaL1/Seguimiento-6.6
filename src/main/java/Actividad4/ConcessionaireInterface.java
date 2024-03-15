package Actividad4;

public interface ConcessionaireInterface {
    void agregarCarro(int cantidad);
    void eliminarCarro(int cantidad);
    boolean venderCarro(int cantidad);
    void mostrarCarros();
    String getInfo();
}