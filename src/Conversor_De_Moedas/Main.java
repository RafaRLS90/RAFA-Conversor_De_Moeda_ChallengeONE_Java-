package Conversor_De_Moedas;

import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Bem vindo, escolha uma opção", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moedas", "Conversor de temperatura"}, "Escolha").toString();
		
		String input = JOptionPane.showInputDialog("Insira um valor...");
		
		Funcao funcao = new Funcao();
		
		switch (opcoes) {
		case "Conversor de moedas":
		double valorRecebido = Double.parseDouble(input);
		
		
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

}
