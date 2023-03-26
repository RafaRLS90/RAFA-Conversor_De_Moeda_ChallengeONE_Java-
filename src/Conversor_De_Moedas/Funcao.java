package Conversor_De_Moedas;

import javax.swing.JOptionPane;



public class Funcao {
	
	MaquinaDeConverter moedas = new MaquinaDeConverter();

public void converterMoedas(double valorRecebido) {
	

	
	
		
	String opcao = (String) JOptionPane.showInputDialog(null, "Insira a moeda a qual deseja converter", "Moedas",
	JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De reais para dolar"," De reais para euros, De reais para libras", "De reais para pesos argentinos","De reais para pesos chilenos",
						"De dolar para reais"	,"De euros para reais","De libras para reais","De pesos argentinos para reais","De pesos chilenos para reais"}, 
    "Escolha"
	
	).toString();
		switch(opcao) {
		case "De reais para dolares":
		moedas.transformaRealEmDolar(valorRecebido);
		break;
		
		
       case "De reais para euros":
	   moedas.transformaRealEmEuro(valorRecebido);
	   break;
	   
       case "De reais para libras":
    	   moedas.transformaRealEmLibras(valorRecebido);
    	   break;
    	   
       case "De reais para pesos argentinos":
    	   moedas.transformaRealEmPesosArgentinos(valorRecebido);
    	   break;
    	   
       case "De reais para pesos chilenos":
    	   moedas.transformaRealEmPesosChlienos(valorRecebido);
    	   break;
	   }
		
		
		
}		
}
