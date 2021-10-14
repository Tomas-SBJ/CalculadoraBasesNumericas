import java.util.Scanner;

public class DecimalParaBinario {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = sc.nextInt();

        ConverterBinario converter = new ConverterBinario();

        System.out.println("Binário: " + converter.binario(numero));
    }

}
