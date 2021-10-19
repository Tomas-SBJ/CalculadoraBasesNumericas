public class BinarioParaDecimal {

    //Gabriel Puziski Machado

    public static int converter(int binario)
    {
        int i = 1, decimal = 0, memoria = 0;
        while(binario!=0){
            memoria = binario % 10;
            decimal = decimal +memoria*i;
            i=i*2;
            binario = binario/10;

        }

        return decimal;
    }
}
