import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        int opcao;

        System.out.println("""
               Escolha uma opção: 
               1- Converter
               2- Calcular
               """);
        opcao = teclado.nextInt();

        switch (opcao)
        {
            case 1 ->
                    {
                        System.out.println("""
               Escolha uma opção: 
               1- Converter
               2- Calcular
               """);
                        opcao = teclado.nextInt();
                    }
            case 2 ->
                    {

                    }

        }

        System.out.println("Digite o 1º Numero hexadecimal:");
        String numero1 = teclado.nextLine();

        System.out.println("Digite o 2º Numero hexadecimal:");
        String numero2 = teclado.nextLine();

        long hexadecimal1 = HexadecimalParaDecimal.converter(numero1);
        long hexadecimal2 = HexadecimalParaDecimal.converter(numero2);

        System.out.println(hexadecimal1);
        System.out.println(hexadecimal2);
    }
}