package Models;

public class Nevera extends Electrodomestico{
    private String capacidad;

    public Nevera(String marca, double price, String capacidad) {
        super(marca, price);
        this.setCapacidad(capacidad);
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    @Override
    public void calcularPrecio() {
        System.out.println("El precio de la nevera es: $" + this.getPrice());
    }

    @Override
    public String toString() {
        return super.toString() + "Nevera{" + "capacidad=" + capacidad + '}';
    }
}
