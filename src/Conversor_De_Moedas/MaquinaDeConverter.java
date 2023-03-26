package Conversor_De_Moedas;

import javax.swing.JOptionPane;

public class MaquinaDeConverter {
	public void transformaRealEmDolar (double valor) {
		double moedaDolar = valor / 5.24;//dolar hoe, se possível, usar api
		moedaDolar = (double)Math.ceil(moedaDolar);
		JOptionPane.showMessageDialog(null, moedaDolar, null, 0, null);
	}
	
	public void transformaRealEmEuro (double valor) {
		double moedaEuro = valor / 7.00;//dolar hoe, se possível, usar api
		moedaEuro = (double)Math.ceil(moedaEuro);
		JOptionPane.showMessageDialog(null, moedaEuro, null, 0, null);
	}
	
	public void transformaRealEmLibras (double valor) {
		double moedaLibras = valor / 5.24;//dolar hoe, se possível, usar api
		moedaLibras = (double)Math.ceil(moedaLibras);
		JOptionPane.showMessageDialog(null, moedaLibras, null, 0, null);
	}
	
	public void transformaRealEmPesos (double valor) {
		double moedaPesosArgentinos = valor / 5.24;//dolar hoe, se possível, usar api
		moedaPesosArgentinos = (double)Math.ceil(moedaPesosArgentinos);
		JOptionPane.showMessageDialog(null, moedaPesosArgentinos, null, 0, null);
	}
	
	public void transformaRealEmPesosChlienos (double valor) {
		double moedaPesosChlilenos = valor / 5.24;//dolar hoe, se possível, usar api
		moedaPesosChlilenos = (double)Math.ceil(moedaPesosChlilenos);
		JOptionPane.showMessageDialog(null, moedaPesosChlilenos, null, 0, null);
	}
	
	
}

