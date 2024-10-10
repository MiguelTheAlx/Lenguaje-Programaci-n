package codigo;

public abstract class Convertidor{//Clase principal de convertidor para las otras clases
    //atributo valor ingresado
    protected double valor;

    //constructor
    public Convertidor(double valor) {
        this.valor = valor;
    }

    //clase abstracta
    public abstract String convertir(String unidadOrigen, String unidadDestino);
}