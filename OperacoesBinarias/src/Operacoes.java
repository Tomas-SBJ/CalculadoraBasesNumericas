//Arthur Voltolini

public class Operacoes {

    public String SomaBinario(String a, String b){
        int bin1 = Integer.parseInt(a, 2);
        int bin2 = Integer.parseInt(b, 2);
        int soma = bin1 + bin2;
        return Integer.toBinaryString(soma);
    }

    public String SubtracaoBinario(String a, String b){
        int bin1 = Integer.parseInt(a, 2);
        int bin2 = Integer.parseInt(b, 2);
        int subtr = bin1 - bin2;
        return Integer.toBinaryString(subtr);
    }

    public String MultiplicacaoBinario(String a, String b){
        int bin1 = Integer.parseInt(a, 2);
        int bin2 = Integer.parseInt(b, 2);
        int mult = bin1 * bin2;
        return Integer.toBinaryString(mult);
    }

    public String DivisaoBinario(String a, String b){
        int bin1 = Integer.parseInt(a, 2);
        int bin2 = Integer.parseInt(b, 2);
        int div = bin1 / bin2;
        return Integer.toBinaryString(div);
    }
}