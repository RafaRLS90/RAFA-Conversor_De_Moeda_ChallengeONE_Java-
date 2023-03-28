package Conversor_De_Moedas;

import javax.swing.*;

public class MaquinaDeConverter {
	
	public void transformaRealEmDolar (double valor) {
		double moedaDolar = valor / 5.25;
		moedaDolar = (double) Math.round(moedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null,"Você tem " + moedaDolar + " dolares", null, 0);
    }
	
	public void transformaRealEmEuro (double valor) {
		double moedaEuro = valor / 5.66;
		moedaEuro = (double )Math.round(moedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaEuro + " euros", null, 0);
	}
	
	public void transformaRealEmLibras (double valor) {
		double moedaLibras = valor / 0.17;
		moedaLibras = (double) Math.round(moedaLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaLibras + " libras", null, 0);
	}
	
	public void transformaRealEmPesosArgentinos (double valor) {
		double moedaPesosArgentinos = valor / 0.026;
		moedaPesosArgentinos = (double) Math.round(moedaPesosArgentinos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPesosArgentinos + " pesos argentinos", null, 0);
	}
	
	public void transformaRealEmPesosChilenos (double valor) {
		double moedaPesosChilenos = valor / 0.0066;
		moedaPesosChilenos = (double) Math.round(moedaPesosChilenos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Você tem " + moedaPesosChilenos + " pesos chlilenos", null, 0);
	}

	public void transformaDolarEmReal(double valorReal) {
		double moedaReal = valorReal * 5.25; 
	 	moedaReal = (double) Math.round(moedaReal);
	 	JOptionPane.showMessageDialog(null,"Você tem " + moedaReal + " reais", null, 0);
	}
	public void transformaEurosEmReal(double valorReal) {
		double moedaReal = valorReal * 5.66; 
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog(null,"Você tem " + moedaReal + " reais", null, 0);
	}	
    public void transformaLibrasEmReal(double valorReal) {
		double moedaReal = valorReal * 0.17; 
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog(null,"Você tem " + moedaReal + " reais", null, 0);
		}	
	public void transformaPesosArgentinosEmReal(double valorReal) {
		double moedaReal = valorReal * 0.026; 
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog(null,"Você tem " + moedaReal + " reais", null, 0);	
			}	
	public void transformaPesosChilenosEmReal(double valorReal) {
		double moedaReal = valorReal * 0.0066; 
		moedaReal = (double) Math.round(moedaReal);
		JOptionPane.showMessageDialog(null,"Você tem " + moedaReal + " reais", null, 0);			
				
				}
	
		
	}
	
	
	
	


