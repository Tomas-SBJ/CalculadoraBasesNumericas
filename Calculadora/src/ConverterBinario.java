//Arthur Voltolini

public class ConverterBinario {

    public String binario(int decimal) {

        int numero = decimal;
        String binario = "";
        String binarioInverso = "";

        // Conversão
        while (numero != 0) {
            binario += "" + numero % 2;
            numero = numero / 2;
            System.out.println(numero);
        }

        for (int i = (binario.length()); i != 0; i--) {
            binarioInverso += "" + binario.charAt(i - 1);
        }
        return binarioInverso;
    }
}
