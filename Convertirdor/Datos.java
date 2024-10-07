// Unidades de transmisión de datos soportadas:
// - Bit por segundo (bps)
// - Kilobit por segundo (kbps)
// - Megabit por segundo (Mbps)
// - Gigabit por segundo (Gbps)
// - Terabit por segundo (Tbps)
// - Petabit por segundo (Pbps)
// - Exabit por segundo (Ebps)
// - Zettabit por segundo (Zbps)
// - Yottabit por segundo (Ybps)
// - Kibibit por segundo (Kibit/s)
// - Mebibit por segundo (Mibit/s)
// - Gibibit por segundo (Gibit/s)
// - Tebibit por segundo (Tibit/s)
// - Kilobyte por segundo (kB/s)
// - Megabyte por segundo (MB/s)
// - Gigabyte por segundo (GB/s)
// - Terabyte por segundo (TB/s)


//importaciones
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

// Convertidor de Tasas de Transmisión de Datos
class Datos extends Convertidor {
    private static final Map<String, BigDecimal> factores = new HashMap<>();
    private static final MathContext mc = new MathContext(30); // La precisión a 30 dígitos por si las moscas

    //bloque estatico para las unidades de tasa de datos
    static {
        // Factores de conversión relativos a bits por segundo (bps)
        factores.put("bps", BigDecimal.ONE);
        factores.put("kbps", BigDecimal.valueOf(1_000));
        factores.put("Mbps", BigDecimal.valueOf(1_000_000));
        factores.put("Gbps", BigDecimal.valueOf(1_000_000_000));
        factores.put("Tbps", BigDecimal.valueOf(1_000_000_000_000L));
        factores.put("Kibit/s", BigDecimal.valueOf(1_024));
        factores.put("Mibit/s", BigDecimal.valueOf(1_048_576));
        factores.put("Gibit/s", BigDecimal.valueOf(1_073_741_824));
        factores.put("Tibit/s", BigDecimal.valueOf(1_099_511_627_776L));
        factores.put("kB/s", BigDecimal.valueOf(8_000));
        factores.put("MB/s", BigDecimal.valueOf(8_000_000));
        factores.put("GB/s", BigDecimal.valueOf(8_000_000_000L));
        factores.put("TB/s", BigDecimal.valueOf(8_000_000_000_000L));
    }

    // Constructor
    public Datos(double valor) {
        super(valor);
    }

    @Override
    public String convertir(String unidadOrigen, String unidadDestino) {
        BigDecimal valorBD = BigDecimal.valueOf(valor);
        BigDecimal factorOrigen = factores.get(unidadOrigen);
        BigDecimal factorDestino = factores.get(unidadDestino);

        return (factorOrigen == null || factorDestino == null) 
            ? "Conversión no soportada" 
            : String.format("%." + mc.getPrecision() + "e %s", valorBD.multiply(factorOrigen, mc).divide(factorDestino, mc), unidadDestino);
    }
}
