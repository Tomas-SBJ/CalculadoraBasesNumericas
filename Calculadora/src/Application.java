import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int opcao;
        int opcaoConverter;
        int opcaoCalcular;

        System.out.println("""
               Escolha uma opção: 
               1 - Converter
               2 - Calcular
               """);
        opcao = teclado.nextInt();

        switch (opcao)
        {
            case 1 ->
                    {
                        System.out.println("""
                               Escolha uma opção: 
                               1 - Decimal para Binario
                               2 - Decimal para Hexadecimal
                               3 - Binario para Decimal
                               4 - Hexadecimal para Decimal
                               """);
                        opcaoConverter = teclado.nextInt();

                        switch(opcaoConverter)
                        {
                            case 1 ->
                                    {
                                        System.out.print("Digite o número que gostaria de converter:");
                                        int numeroDecimal = teclado.nextInt();

                                        String numeroBinario = DecimalParaBinario.converter(numeroDecimal);

                                        System.out.print("Resultado da conversão é: " + numeroBinario);
                                    }
                            case 2 ->
                                    {
                                        System.out.print("Digite o número que gostaria de converter:");
                                        int numeroDecimal = teclado.nextInt();

                                        String numeroHexa = DecimalParaHexa.converter(numeroDecimal);

                                        System.out.print("Resultado da conversão é: " + numeroHexa);
                                    }
                            case 3 ->
                                    {
                                        System.out.print("Digite o número que gostaria de converter:");
                                        int numeroBinario = teclado.nextInt();

                                        long numeroDecimal = BinarioParaDecimal.converter(numeroBinario);

                                        System.out.print("Resultado da conversão é: " + numeroDecimal);
                                    }
                            case 4 ->
                                    {
                                        System.out.print("Digite o número que gostaria de converter:");
                                        String numeroHexa = teclado.next();

                                        long numeroDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                                        System.out.print("Resultado da conversão é: " + numeroDecimal);
                                    }
                        }
                    }
            case 2 ->
                    {

                    }

        }

    }
}