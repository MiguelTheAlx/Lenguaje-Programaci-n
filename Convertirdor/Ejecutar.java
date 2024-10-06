//importaciones
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class Ejecutar {
    //mapa de las unidades de velocidad
    private static final Map<Integer, String> unidadesVelocidad = Map.of(
        1, "km/h",
        2, "m/s",
        3, "mph",
        4, "ft/s",
        5, "kn"
    );


    //mapa de las unidades de datos
    private static final Map<Integer, String> unidadesDatos = Map.ofEntries(
        Map.entry(1, "bps"),
        Map.entry(2, "kbps"),
        Map.entry(3, "Mbps"),
        Map.entry(4, "Gbps"),
        Map.entry(5, "Tbps"),
        Map.entry(6, "Kibit/s"),
        Map.entry(7, "Mibit/s"),
        Map.entry(8, "Gibit/s"),
        Map.entry(9, "Tibit/s"),
        Map.entry(10, "kB/s"),
        Map.entry(11, "MB/s"),
        Map.entry(12, "GB/s"),
        Map.entry(13, "TB/s")
    );

    //mapa de seleccion de opciones de menu
    private static final Map<Integer, Consumer<Scanner>> opciones = new LinkedHashMap<>();

    static {//inicializacion de seleccion de menu
        opciones.put(1, Ejecutar::convertirVelocidad);
        opciones.put(2, Ejecutar::convertirDatos);
        opciones.put(3, scanner -> System.exit(0));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        mostrarMenu(scanner);
    }

    //metodo para mostrar menu principal
    private static void mostrarMenu(Scanner scanner) {
        System.out.println("Seleccione el tipo de conversión:");
        System.out.println("1. Velocidad");
        System.out.println("2. Tasa de Transmisión de Datos");
        System.out.println("3. Salir");
        int opcion = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        opciones.getOrDefault(opcion, s -> {
            System.out.println("Opción no válida");
            mostrarMenu(s);
        }).accept(scanner);
        mostrarMenu(scanner); // Llamada recursiva para continuar el menú
    }

    //metodo para conversion de velocidades
    private static void convertirVelocidad(Scanner scanner) {
        System.out.println("Ingrese el valor a convertir:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Seleccione la unidad de origen:");
        unidadesVelocidad.keySet().stream().sorted().forEach(key -> System.out.println(key + ". " + unidadesVelocidad.get(key)));
        int opcionOrigen = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        String unidadOrigen = unidadesVelocidad.get(opcionOrigen);
        System.out.println("Seleccione la unidad de destino:");
        unidadesVelocidad.keySet().stream().sorted().forEach(key -> System.out.println(key + ". " + unidadesVelocidad.get(key)));
        int opcionDestino = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        String unidadDestino = unidadesVelocidad.get(opcionDestino);
        Convertidor convertidor = new Velocidad(valor);
        System.out.println(valor + " " + unidadOrigen + " a " + unidadDestino + ": " + convertidor.convertir(unidadOrigen, unidadDestino));
    }

    //metodo para conversion de tasa de transmicion de datos
    private static void convertirDatos(Scanner scanner) {
        System.out.println("Ingrese el valor a convertir:");
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Consumir la nueva línea
        System.out.println("Seleccione la unidad de origen:");
        unidadesDatos.keySet().stream().sorted().forEach(key -> System.out.println(key + ". " + unidadesDatos.get(key)));
        int opcionOrigen = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        String unidadOrigen = unidadesDatos.get(opcionOrigen);
        System.out.println("Seleccione la unidad de destino:");
        unidadesDatos.keySet().stream().sorted().forEach(key -> System.out.println(key + ". " + unidadesDatos.get(key)));
        int opcionDestino = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea
        String unidadDestino = unidadesDatos.get(opcionDestino);
        Convertidor convertidor = new Datos(valor);
        System.out.println(valor + " " + unidadOrigen + " a " + unidadDestino + ": " + convertidor.convertir(unidadOrigen, unidadDestino));
    }
}

