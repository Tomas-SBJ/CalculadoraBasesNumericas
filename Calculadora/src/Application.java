import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numeroHexa;
        String resultadoBinario;
        String resultadoHexadecimal;
        String loop;
        int opcao;
        int opcaoConverter;
        int opcaoCalcular;
        int opcaoNumero;
        int numeroDecimal;
        int numeroBinarioConvertidoParaDecimal;
        int numeroBinarioConvertidoParaDecimal2;
        int numeroHexadecimalConvertidoParaDecimal;
        int numeroHexadecimalConvertidoParaDecimal2;
        int resultadoDecimal;

        do {
            System.out.println("""
                    Escolha uma opção:
                    1 - Converter
                    2 - Calcular
                    """);
            opcao = teclado.nextInt();

            if (opcao != 1 && opcao != 2) {
                throw new IllegalArgumentException("Opção inserida é invalida.");
            }

            switch (opcao) {
            case 1 -> {
                System.out.println("""
                        Escolha uma opção:
                        1 - Decimal para Binario
                        2 - Decimal para Hexadecimal
                        3 - Binario para Decimal
                        4 - Hexadecimal para Decimal
                        """);
                opcaoConverter = teclado.nextInt();

                if (opcaoConverter < 1 || opcaoConverter > 4) {
                    throw new IllegalArgumentException("Opção de conversão inserida é invalida.");
                }

                switch (opcaoConverter) {
                case 1 -> {
                    System.out.print("Digite o número que gostaria de converter:");
                    numeroDecimal = teclado.nextInt();

                    String numeroBinario = DecimalParaBinario.converter(numeroDecimal);

                    System.out.print("Resultado da conversão é: " + numeroBinario);
                }
                case 2 -> {
                    System.out.print("Digite o número que gostaria de converter:");
                    numeroDecimal = teclado.nextInt();

                    numeroHexa = DecimalParaHexa.converter(numeroDecimal);

                    System.out.print("Resultado da conversão é: " + numeroHexa);
                }
                case 3 -> {
                    System.out.print("Digite o número que gostaria de converter:");
                    int numeroBinario = teclado.nextInt();

                    numeroDecimal = BinarioParaDecimal.converter(numeroBinario);

                    System.out.print("Resultado da conversão é: " + numeroDecimal);
                }
                case 4 -> {
                    System.out.print("Digite o número que gostaria de converter:");
                    numeroHexa = teclado.next();

                    numeroDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                    System.out.print("Resultado da conversão é: " + numeroDecimal);
                }
                }
            }
            case 2 -> {
                System.out.println("""
                        Escolha uma opção:
                        1 - Soma
                        2 - Subtração
                        3 - Multiplicação
                        4 - Divisão
                        """);
                opcaoCalcular = teclado.nextInt();

                if (opcaoCalcular < 1 || opcaoCalcular > 4) {
                    throw new IllegalArgumentException("Opção de conversão inserida é invalida.");
                }

                System.out.println("""
                        Escolha uma opção:
                        1 - Primeiro número Decimal, Segundo número Binario
                        2 - Primeiro número Decimal, Segundo número Hexadecimal
                        3 - Primeiro número Hexadecimal, Segundo número Binario
                        4 - Primeiro número Decimal, Segundo número Decimal
                        5 - Primeiro número Binario, Segundo número Binario
                        6 - Primeiro número Hexadecimal, Segundo número Hexadecimal
                        """);
                opcaoNumero = teclado.nextInt();

                if (opcaoNumero < 1 || opcaoNumero > 6) {
                    throw new IllegalArgumentException("Opção de ordem dos números inserido é invalida.");
                }

                switch (opcaoCalcular) {
                case 1 -> {
                    switch (opcaoNumero) {
                    case 1 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal + numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 2 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        numeroHexa = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal + numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 3 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal + numeroHexadecimalConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 4 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Decimal:");
                        int numeroDecimal2 = teclado.nextInt();

                        resultadoDecimal = numeroDecimal + numeroDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 5 -> {
                        System.out.print("Digite o primeiro número Binario:");
                        int numeroBinario1 = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario2 = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario1);
                        numeroBinarioConvertidoParaDecimal2 = BinarioParaDecimal.converter(numeroBinario2);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal + numeroBinarioConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 6 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        String numeroHexa2 = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroHexadecimalConvertidoParaDecimal2 = HexadecimalParaDecimal.converter(numeroHexa2);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal
                                + numeroHexadecimalConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    }
                }
                case 2 -> {
                    switch (opcaoNumero) {
                    case 1 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroDecimal - numeroBinarioConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 2 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        numeroHexa = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                        resultadoDecimal = numeroDecimal - numeroHexadecimalConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 3 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal - numeroBinarioConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 4 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Decimal:");
                        int numeroDecimal2 = teclado.nextInt();

                        resultadoDecimal = numeroDecimal - numeroDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 5 -> {
                        System.out.print("Digite o primeiro número Binario:");
                        int numeroBinario1 = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario2 = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario1);
                        numeroBinarioConvertidoParaDecimal2 = BinarioParaDecimal.converter(numeroBinario2);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal - numeroBinarioConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 6 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        String numeroHexa2 = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroHexadecimalConvertidoParaDecimal2 = HexadecimalParaDecimal.converter(numeroHexa2);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal
                                - numeroHexadecimalConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    }
                }
                case 3 -> {
                    switch (opcaoNumero) {
                    case 1 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal * numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 2 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        numeroHexa = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal * numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 3 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal * numeroHexadecimalConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 4 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Decimal:");
                        int numeroDecimal2 = teclado.nextInt();

                        resultadoDecimal = numeroDecimal * numeroDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 5 -> {
                        System.out.print("Digite o primeiro número Binario:");
                        int numeroBinario1 = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario2 = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario1);
                        numeroBinarioConvertidoParaDecimal2 = BinarioParaDecimal.converter(numeroBinario2);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal * numeroBinarioConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 6 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        String numeroHexa2 = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroHexadecimalConvertidoParaDecimal2 = HexadecimalParaDecimal.converter(numeroHexa2);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal
                                * numeroHexadecimalConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    }
                }
                case 4 -> {
                    switch (opcaoNumero) {
                    case 1 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal / numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 2 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        numeroHexa = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal / numeroDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 3 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario = teclado.nextInt();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal / numeroHexadecimalConvertidoParaDecimal;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 4 -> {
                        System.out.print("Digite o primeiro número Decimal:");
                        numeroDecimal = teclado.nextInt();

                        System.out.print("Digite o segundo número Decimal:");
                        int numeroDecimal2 = teclado.nextInt();

                        resultadoDecimal = numeroDecimal / numeroDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 5 -> {
                        System.out.print("Digite o primeiro número Binario:");
                        int numeroBinario1 = teclado.nextInt();

                        System.out.print("Digite o segundo número Binario:");
                        int numeroBinario2 = teclado.nextInt();

                        numeroBinarioConvertidoParaDecimal = BinarioParaDecimal.converter(numeroBinario1);
                        numeroBinarioConvertidoParaDecimal2 = BinarioParaDecimal.converter(numeroBinario2);

                        resultadoDecimal = numeroBinarioConvertidoParaDecimal / numeroBinarioConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    case 6 -> {
                        System.out.print("Digite o primeiro número Hexadecimal:");
                        numeroHexa = teclado.next();

                        System.out.print("Digite o segundo número Hexadecimal:");
                        String numeroHexa2 = teclado.next();

                        numeroHexadecimalConvertidoParaDecimal = HexadecimalParaDecimal.converter(numeroHexa);
                        numeroHexadecimalConvertidoParaDecimal2 = HexadecimalParaDecimal.converter(numeroHexa2);

                        resultadoDecimal = numeroHexadecimalConvertidoParaDecimal
                                / numeroHexadecimalConvertidoParaDecimal2;

                        resultadoBinario = DecimalParaBinario.converter(resultadoDecimal);
                        resultadoHexadecimal = DecimalParaHexa.converter(resultadoDecimal);

                        System.out.println("Resultado da soma nas seguintes formas:");
                        System.out.println("Decimal: " + resultadoDecimal);
                        System.out.println("Binario: " + resultadoBinario);
                        System.out.println("Hexadecimal: " + resultadoHexadecimal);
                    }
                    }
                }
                }
            }
            }
            System.out.print("Deseja realizar outra opção ? Sim/Nao");
            loop = teclado.next().toUpperCase();

        } while (loop.equals("SIM"));
    }
}