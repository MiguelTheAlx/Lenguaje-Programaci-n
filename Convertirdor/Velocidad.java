// Unidades de velocidad soportadas:
// - Metro por segundo (m/s)
// - Kilómetro por hora (km/h)
// - Milla por hora (mph)
// - Pie por segundo (ft/s)
// - Nudo (kn)

//importacions
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

// Convertidor de Velocidad
class Velocidad extends Convertidor {
    private static final Map<String, Function<BigDecimal, BigDecimal>> conversiones = new HashMap<>();
    private static final MathContext mc = new MathContext(30); // La precisión a 30 dígitos por si las moscas

    static {
        // Conversiones a m/s
        conversiones.put("km/h->m/s", valor -> valor.divide(BigDecimal.valueOf(3.6), mc)); // Kilómetro por hora a metro por segundo
        conversiones.put("mph->m/s", valor -> valor.multiply(BigDecimal.valueOf(0.44704), mc)); // Milla por hora a metro por segundo
        conversiones.put("ft/s->m/s", valor -> valor.multiply(BigDecimal.valueOf(0.3048), mc)); // Pie por segundo a metro por segundo
        conversiones.put("kn->m/s", valor -> valor.multiply(BigDecimal.valueOf(0.514444), mc)); // Nudo a metro por segundo

        // Conversiones de m/s a otras unidades
        conversiones.put("m/s->km/h", valor -> valor.multiply(BigDecimal.valueOf(3.6), mc)); // Metro por segundo a kilómetro por hora
        conversiones.put("m/s->mph", valor -> valor.divide(BigDecimal.valueOf(0.44704), mc)); // Metro por segundo a milla por hora
        conversiones.put("m/s->ft/s", valor -> valor.divide(BigDecimal.valueOf(0.3048), mc)); // Metro por segundo a pie por segundo
        conversiones.put("m/s->kn", valor -> valor.divide(BigDecimal.valueOf(0.514444), mc)); // Metro por segundo a nudo

        // Conversiones directas entre otras unidades
        conversiones.put("km/h->mph", valor -> valor.divide(BigDecimal.valueOf(1.60934), mc)); // Kilómetro por hora a milla por hora
        conversiones.put("km/h->ft/s", valor -> valor.divide(BigDecimal.valueOf(1.09728), mc)); // Kilómetro por hora a pie por segundo
        conversiones.put("km/h->kn", valor -> valor.divide(BigDecimal.valueOf(1.852), mc)); // Kilómetro por hora a nudo
        conversiones.put("mph->km/h", valor -> valor.multiply(BigDecimal.valueOf(1.60934), mc)); // Milla por hora a kilómetro por hora
        conversiones.put("mph->ft/s", valor -> valor.multiply(BigDecimal.valueOf(1.46667), mc)); // Milla por hora a pie por segundo
        conversiones.put("mph->kn", valor -> valor.divide(BigDecimal.valueOf(1.15078), mc)); // Milla por hora a nudo
        conversiones.put("ft/s->km/h", valor -> valor.multiply(BigDecimal.valueOf(1.09728), mc)); // Pie por segundo a kilómetro por hora
        conversiones.put("ft/s->mph", valor -> valor.divide(BigDecimal.valueOf(1.46667), mc)); // Pie por segundo a milla por hora
        conversiones.put("ft/s->kn", valor -> valor.divide(BigDecimal.valueOf(1.68781), mc)); // Pie por segundo a nudo
        conversiones.put("kn->km/h", valor -> valor.multiply(BigDecimal.valueOf(1.852), mc)); // Nudo a kilómetro por hora
        conversiones.put("kn->mph", valor -> valor.multiply(BigDecimal.valueOf(1.15078), mc)); // Nudo a milla por hora
        conversiones.put("kn->ft/s", valor -> valor.multiply(BigDecimal.valueOf(1.68781), mc)); // Nudo a pie por segundo
    }

    public Velocidad(double valor) {
        super(valor);
    }

    @Override
    public String convertir(String unidadOrigen, String unidadDestino) {
        String clave = unidadOrigen + "->" + unidadDestino;
        Function<BigDecimal, BigDecimal> conversion = conversiones.get(clave);
        BigDecimal valorBD = BigDecimal.valueOf(valor);
        return conversion != null ? String.format("%s %s", conversion.apply(valorBD).toEngineeringString(), unidadDestino) : "Conversión no soportada";
    }
}
