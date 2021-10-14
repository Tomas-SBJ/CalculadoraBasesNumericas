//Arthur Voltolini

import java.io.IOException;
import static java.lang.System.in;
import java.util.Scanner;

public class OperacoesBinarias {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {
            Operacoes operacao = new Operacoes();
            System.out.print("Digite o primeiro número Binário:  ");
            String bin1 = in.next();
            System.out.print("Digite o segundo número Binário: ");
            String bin2 = in.next();

            System.out.println("Soma:          " + operacao.SomaBinario(bin1, bin2));
            System.out.println("Subtração:     " + operacao.SubtracaoBinario(bin1, bin2));
            System.out.println("Multiplicação: " + operacao.MultiplicacaoBinario(bin1, bin2));
            System.out.println("Divisão:       " + operacao.DivisaoBinario(bin1, bin2));
        } catch(NumberFormatException e) {
            System.out.println("Você Digitou um Número não Binário.");
        } finally {
            in.close();
        }
    }
}