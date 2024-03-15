package Actividad4;

public class Concessionaire extends AbstractConcessionaire {
    public Concessionaire(String nombre, String direccion) {
        super(nombre, direccion);
    }

    @Override
    public void agregarCarro(int cantidad) {
        cantidadDeCarros += cantidad;
    }

    @Override
    public void eliminarCarro(int cantidad) {
        cantidadDeCarros -= cantidad;
        if (cantidadDeCarros < 0) {
            cantidadDeCarros = 0;
        }
    }

    @Override
    public boolean venderCarro(int cantidad) {
        if (cantidadDeCarros >= cantidad) {
            cantidadDeCarros -= cantidad;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void mostrarCarros() {
        System.out.println("Cantidad de carros disponibles: " + cantidadDeCarros);
    }

    @Override
    public String getInfo() {
        return "Nombre: " + nombre + ", Dirección: " + direccion + ", Cantidad de carros: " + cantidadDeCarros;
    }
}
