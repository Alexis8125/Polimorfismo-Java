package Models;

public  abstract class Electrodomestico implements OperacionProducto {

    private String marca;
    private double price;


    public Electrodomestico(String marca, double price) {
        this.setMarca(marca);
        this.setPrice(price);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "marca='" + marca + '\'' +
                ", price=" + price +
                '}';
    }
}
