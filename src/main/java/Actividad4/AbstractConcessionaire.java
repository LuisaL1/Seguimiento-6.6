package Actividad4;

public abstract class AbstractConcessionaire implements ConcessionaireInterface {
    protected String nombre;
    protected String direccion;
    protected int cantidadDeCarros;

    public AbstractConcessionaire(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadDeCarros = 0;
    }
}
