package Conversor_De_Moedas;

public class ValorValido {
	public boolean valorNumerico(String inputValid) {
		try {
			Double.parseDouble(inputValid);
			return true;
			}catch (Exception ex) {
				return false;
			}
	}
}
