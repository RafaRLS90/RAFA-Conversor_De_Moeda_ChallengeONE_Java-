package Conversor_De_Moedas;

import javax.swing.JOptionPane;

public class MaquinaDeConverter {
	public void transformaRealEmDolar (double valor) {
		double moedaDolar = valor / 5.24;//dolar hoe, se possível, usar api
		moedaDolar = (double)Math.ceil(moedaDolar);
		JOptionPane.showMessageDialog(null, moedaDolar, null, 0, null);
	}
	
}

