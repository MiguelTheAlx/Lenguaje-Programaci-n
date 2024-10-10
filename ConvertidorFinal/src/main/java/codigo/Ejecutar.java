package codigo;

//importaciones
import Interfaz.Interfaz;

public class Ejecutar {
    

    public static void main(String[] args) {
         // Crear y mostrar la interfaz directamente
        java.awt.EventQueue.invokeLater(() -> {
            new Interfaz().setVisible(true);
        });
    }


}

