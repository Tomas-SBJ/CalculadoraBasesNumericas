//Arthur Voltolini

public class Operacoes {

    public String SomaHexadecimal(String a, String b){
        int hex1 = Integer.parseInt(a, 16);
        int hex2 = Integer.parseInt(b, 16);
        int soma = hex1 + hex2;
        return Integer.toHexString(soma);
    }

    public String SubtracaoHexadecimal(String a, String b){
        int hex1 = Integer.parseInt(a, 16);
        int hex2 = Integer.parseInt(b, 16);
        int subtr = hex1 - hex2;
        return Integer.toHexString(subtr);
    }

    public String MultiplicacaoHexadecimal(String a, String b){
        int hex1 = Integer.parseInt(a, 16);
        int hex2 = Integer.parseInt(b, 16);
        int mult = hex1 * hex2;
        return Integer.toHexString(mult);
    }

    public String DivisaoHexadecimal(String a, String b){
        int hex1 = Integer.parseInt(a, 16);
        int hex2 = Integer.parseInt(b, 16);
        int div = hex1 / hex2;
        return Integer.toHexString(div);
    }
}

