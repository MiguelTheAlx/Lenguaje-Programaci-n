package codigo;

// Unidades de tamaño de datos soportadas: P(23, 2) = 253 combinaciones posibles
// - Bit (b)
// - Kilobit (Kb)
// - Megabit (Mb)
// - Gigabit (Gb)
// - Terabit (Tb)
// - Petabit (Pb)
// - Exabit (Eb)
// - Zettabit (Zb)
// - Yottabit (Yb)
// - Kibibit (Kib)
// - Mebibit (Mib)
// - Gibibit (Gib)
// - Tebibit (Tib)
// - Kilobyte (KB)
// - Megabyte (MB)
// - Gigabyte (GB)
// - Terabyte (TB)
// - Petabyte (PB)
// - Exabyte (EB)
// - Zettabyte (ZB)
// - Yottabyte (YB)
// - Pebibyte (PiB)



//importaciones
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.HashMap;
import java.util.Map;

// Convertidor de Tasas de Transmisión de Datos
public class Datos extends Convertidor {
    //atributs de datoos
    private static final Map<String, BigDecimal> factores = new HashMap<>();
    private static final MathContext mc = new MathContext(30); // La precisión a 30 dígitos por si las moscas

    
    
    // Constructor
    public Datos(double valor) {
        super(valor);
    }
    
    //metodos setters y getters
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public double getValor() {    
        return valor;
    }
    
    // Bloque estático para las unidades de tamaño de datos
    static {
        // Factores de conversión relativos a bits (b)
        factores.put("b", BigDecimal.ONE);
        factores.put("Kb", new BigDecimal("1000")); // 1 Kb = 1000 bits
        factores.put("Mb", new BigDecimal("1000000"));
        factores.put("Gb", new BigDecimal("1000000000"));
        factores.put("Tb", new BigDecimal("1000000000000"));
        factores.put("Pb", new BigDecimal("1000000000000000"));
        factores.put("Eb", new BigDecimal("1000000000000000000"));
        factores.put("Zb", new BigDecimal("1000000000000000000000"));
        factores.put("Yb", new BigDecimal("1000000000000000000000000"));
        factores.put("Kib", new BigDecimal("1024"));
        factores.put("Mib", new BigDecimal("1048576"));
        factores.put("Gib", new BigDecimal("1073741824"));
        factores.put("Tib", new BigDecimal("1099511627776"));
        factores.put("PiB", new BigDecimal("1125899906842624"));
        factores.put("KB", new BigDecimal("8000")); // 1 KB = 8000 bits
        factores.put("MB", new BigDecimal("8000000"));
        factores.put("GB", new BigDecimal("8000000000"));
        factores.put("TB", new BigDecimal("8000000000000"));
        factores.put("PB", new BigDecimal("8000000000000000"));
        factores.put("EB", new BigDecimal("8000000000000000000"));
        factores.put("ZB", new BigDecimal("8000000000000000000000"));
        factores.put("YB", new BigDecimal("8000000000000000000000000"));
    }

    
    @Override
    public String convertir(String unidadOrigen, String unidadDestino) {
        BigDecimal valorBD = BigDecimal.valueOf(valor);
        BigDecimal factorOrigen = factores.get(unidadOrigen);
        BigDecimal factorDestino = factores.get(unidadDestino);

        BigDecimal resultado = (factorOrigen == null || factorDestino == null) 
            ? null 
            : valorBD.multiply(factorOrigen).divide(factorDestino, mc);

        // Ajustar el formato para manejar valores muy pequeños y muy grandes
        return resultado == null 
            ? null 
            : (resultado.compareTo(BigDecimal.valueOf(1e-3)) < 0 || resultado.compareTo(BigDecimal.valueOf(1e3)) > 0) 
                ? String.format("%e %s", resultado, unidadDestino) 
                : String.format("%,.2f %s", resultado, unidadDestino);
    }

}
