/**
 * Classe que converte Hexadecimal Para Decimal.
 *
 * @author Anthony de Zutter
 */
public class HexadecimalParaDecimal
{

    public static long converter(String hex) {
        hex = hex.toUpperCase();
        String digitos = "0123456789ABCDEF";
        long decimal = 0;
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digitos.indexOf(c);
            decimal = 16 * decimal + d;
        }

        return decimal;
    }
}