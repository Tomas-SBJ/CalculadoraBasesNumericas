public class DecimalParaBinario {
    public static String converter(int decimal) {
        int numero = decimal;
        String binario = "";
        String binarioInverso = "";

        while (numero != 0) {
            binario += "" + numero % 2;
            numero = numero / 2;
        }

        for (int i = (binario.length()); i != 0; i--) {
            binarioInverso += "" + binario.charAt(i - 1);
        }

        return binarioInverso;
    }
}
