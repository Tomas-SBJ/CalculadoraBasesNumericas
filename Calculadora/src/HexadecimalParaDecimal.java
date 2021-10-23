public class HexadecimalParaDecimal {
    public static int converter(String hex) {
        hex = hex.toUpperCase();
        String digitos = "0123456789ABCDEF";
        int decimal = 0;

        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int d = digitos.indexOf(c);
            decimal = 16 * decimal + d;
        }

        return decimal;
    }
}