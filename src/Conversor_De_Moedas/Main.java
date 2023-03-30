package Conversor_De_Moedas;

import javax.swing.*;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Bem vindo, escolha uma opção", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moedas", "Conversor de temperatura"}, "Escolha").toString();
		
	
		String inputValid = JOptionPane.showInputDialog("Insira um valor...");
		ValorValido valorOK = new ValorValido();
		while (!valorOK.valorNumerico(inputValid) && inputValid != null ) {
			
			 inputValid = JOptionPane.showInputDialog(null, "Insira um valor válido....",0);
			if(inputValid == null) {
			break;
			}
		}

		
		Funcao funcao = new Funcao();
		
		switch (opcoes) {
		case "Conversor de moedas":
		double valorRecebido = Double.parseDouble(inputValid);

		funcao.converterMoedas(valorRecebido);
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (resposta == JOptionPane.OK_CANCEL_OPTION) {
			System.out.println("Programa finalizado!");
			JOptionPane.showMessageDialog(null, funcao, "Progama finalizado", resposta);
			
		}else if (resposta == JOptionPane.YES_OPTION) { 
			main(args);
		
		}else if (resposta == JOptionPane.NO_OPTION) {
			JOptionPane.showMessageDialog(null, "Programa finalizado");
			
		}
		break;
		}

		

	}

//	private static Object readJavaFormatString(String input) {
		// TODO Auto-generated method stub
	//	return null;
//	}

}
