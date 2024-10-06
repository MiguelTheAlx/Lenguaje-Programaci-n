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
import java.util.function.Function;

// Convertidor de Tasas de Transmisión de Datos
class Datos extends Convertidor {
    private static final Map<String, Function<BigDecimal, BigDecimal>> conversiones = new HashMap<>();
    private static final MathContext mc = new MathContext(30); // La precisión a 30 dígitos por si las moscas

    static {
        // Conversiones a bits por segundo (bps)
        conversiones.put("kbps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000), mc)); // Kilobit por segundo a bit por segundo
        conversiones.put("Mbps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000_000), mc)); // Megabit por segundo a bit por segundo
        conversiones.put("Gbps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000_000_000), mc)); // Gigabit por segundo a bit por segundo
        conversiones.put("Tbps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000_000_000_000L), mc)); // Terabit por segundo a bit por segundo
        conversiones.put("Pbps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000_000_000_000_000L), mc)); // Petabit por segundo a bit por segundo
        conversiones.put("Ebps->bps", valor -> valor.multiply(BigDecimal.valueOf(1_000_000_000_000_000_000L), mc)); // Exabit por segundo a bit por segundo
        conversiones.put("Zbps->bps", valor -> valor.multiply(new BigDecimal("1000000000000000000000"), mc)); // Zettabit por segundo a bit por segundo
        conversiones.put("Ybps->bps", valor -> valor.multiply(new BigDecimal("1000000000000000000000000"), mc)); // Yottabit por segundo a bit por segundo
        conversiones.put("Kibit/s->bps", valor -> valor.multiply(BigDecimal.valueOf(1_024), mc)); // Kibibit por segundo a bit por segundo
        conversiones.put("Mibit/s->bps", valor -> valor.multiply(BigDecimal.valueOf(1_048_576), mc)); // Mebibit por segundo a bit por segundo
        conversiones.put("Gibit/s->bps", valor -> valor.multiply(BigDecimal.valueOf(1_073_741_824), mc)); // Gibibit por segundo a bit por segundo
        conversiones.put("Tibit/s->bps", valor -> valor.multiply(BigDecimal.valueOf(1_099_511_627_776L), mc)); // Tebibit por segundo a bit por segundo
        conversiones.put("kB/s->bps", valor -> valor.multiply(BigDecimal.valueOf(8_000), mc)); // Kilobyte por segundo a bit por segundo
        conversiones.put("MB/s->bps", valor -> valor.multiply(BigDecimal.valueOf(8_000_000), mc)); // Megabyte por segundo a bit por segundo
        conversiones.put("GB/s->bps", valor -> valor.multiply(BigDecimal.valueOf(8_000_000_000L), mc)); // Gigabyte por segundo a bit por segundo
        conversiones.put("TB/s->bps", valor -> valor.multiply(BigDecimal.valueOf(8_000_000_000_000L), mc)); // Terabyte por segundo a bit por segundo

        // Conversiones de bits por segundo (bps) a otras unidades
        conversiones.put("bps->kbps", valor -> valor.divide(BigDecimal.valueOf(1_000), mc)); // Bit por segundo a kilobit por segundo
        conversiones.put("bps->Mbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000), mc)); // Bit por segundo a megabit por segundo
        conversiones.put("bps->Gbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000_000), mc)); // Bit por segundo a gigabit por segundo
        conversiones.put("bps->Tbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000_000_000L), mc)); // Bit por segundo a terabit por segundo
        conversiones.put("bps->Pbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000_000_000_000L), mc)); // Bit por segundo a petabit por segundo
        conversiones.put("bps->Ebps", valor -> valor.divide(BigDecimal.valueOf(1_000_000_000_000_000_000L), mc)); // Bit por segundo a exabit por segundo
        conversiones.put("bps->Zbps", valor -> valor.divide(new BigDecimal("1000000000000000000000"), mc)); // Bit por segundo a zettabit por segundo
        conversiones.put("bps->Ybps", valor -> valor.divide(new BigDecimal("1000000000000000000000000"), mc)); // Bit por segundo a yottabit por segundo
        conversiones.put("bps->Kibit/s", valor -> valor.divide(BigDecimal.valueOf(1_024), mc)); // Bit por segundo a kibibit por segundo
        conversiones.put("bps->Mibit/s", valor -> valor.divide(BigDecimal.valueOf(1_048_576), mc)); // Bit por segundo a mebibit por segundo
        conversiones.put("bps->Gibit/s", valor -> valor.divide(BigDecimal.valueOf(1_073_741_824), mc)); // Bit por segundo a gibibit por segundo
        conversiones.put("bps->Tibit/s", valor -> valor.divide(BigDecimal.valueOf(1_099_511_627_776L), mc)); // Bit por segundo a tebibit por segundo
        conversiones.put("bps->kB/s", valor -> valor.divide(BigDecimal.valueOf(8_000), mc)); // Bit por segundo a kilobyte por segundo
        conversiones.put("bps->MB/s", valor -> valor.divide(BigDecimal.valueOf(8_000_000), mc)); // Bit por segundo a megabyte por segundo
        conversiones.put("bps->GB/s", valor -> valor.divide(BigDecimal.valueOf(8_000_000_000L), mc)); // Bit por segundo a gigabyte por segundo
        conversiones.put("bps->TB/s", valor -> valor.divide(BigDecimal.valueOf(8_000_000_000_000L), mc)); // Bit por segundo a terabyte por segundo

        // Conversiones directas entre unidades sin pasar por bps
        conversiones.put("kbps->Mbps", valor -> valor.divide(BigDecimal.valueOf(1_000), mc)); // Kilobit por segundo a megabit por segundo
        conversiones.put("kbps->Gbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000), mc)); // Kilobit por segundo a gigabit por segundo
        conversiones.put("kbps->Tbps", valor -> valor.divide(BigDecimal.valueOf(1_000_000_000), mc)); // Kilobit por segundo a terabit por segundo
        conversiones.put("Gbps->TB/s", valor -> valor.divide(BigDecimal.valueOf(8_000_000), mc)); // Gigabit por segundo a terabyte por segundo
        conversiones.put("TB/s->Gbps", valor -> valor.multiply(BigDecimal.valueOf(8_000_000), mc)); // Terabyte por segundo a gigabit por segundo
    }

    // Constructor
    public Datos(double valor) {
        super(valor);
    }

    @Override
    public String convertir(String unidadOrigen, String unidadDestino) {
        String clave = unidadOrigen + "->" + unidadDestino;
        Function<BigDecimal, BigDecimal> conversion = conversiones.get(clave);
        BigDecimal valorBD = new BigDecimal(valor);
        return conversion != null ? String.format("%.2f %s", conversion.apply(valorBD), unidadDestino) : "Conversión no soportada";
    }
}
