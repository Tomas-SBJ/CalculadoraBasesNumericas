public class DecimalParaHexa {
	public static String converter(int decimal) {
		int reminder;
		char[] hexa = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		String hexaValor = "";

		while (decimal > 0) {
			reminder = decimal % 16;
			hexaValor = hexa[reminder] + hexaValor;
			decimal = decimal / 16;
		}

		return hexaValor;
	}
}