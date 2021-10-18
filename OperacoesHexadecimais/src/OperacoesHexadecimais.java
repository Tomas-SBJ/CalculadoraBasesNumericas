//Arthur Voltolini

import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.in;

public class OperacoesHexadecimais {
    public static void main(String[] args) throws IOException {
        try(Scanner in = new Scanner(System.in)) {

            Operacoes operacao = new Operacoes();

            System.out.print("Digite o primeiro número Hexadecimal:  ");
            String hex1 = in.next();

            System.out.print("Digite o segundo número Hexadecimal: ");
            String hex2 = in.next();

            System.out.println("Soma:          " + operacao.SomaHexadecimal(hex1, hex2).toUpperCase());

            System.out.println("Subtração:     " + operacao.SubtracaoHexadecimal(hex1, hex2).toUpperCase());

            System.out.println("Multiplicação: " + operacao.MultiplicacaoHexadecimal(hex1, hex2).toUpperCase());

            System.out.println("Divisão:       " + operacao.DivisaoHexadecimal(hex1, hex2).toUpperCase());

        } finally {
            in.close();
        }
    }
}