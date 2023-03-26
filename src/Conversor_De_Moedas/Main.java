package Conversor_De_Moedas;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String opcoes = JOptionPane.showInputDialog(null, "Bem vindo, digite seu nome", "Menu Principal", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moedas", "Conversor de temperatura"}, "Escolha").toString();
		
		String input = JOptionPane.showInputDialog("Insira um valor...");
		
		Funcao funcao = new Funcao();
		
		switch (opcoes) {
		case "Conversor de moeda":
		double valorRecebido = Double.parseDouble(input);
		funcao.converterMoedas(valorRecebido);
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
		if (resposta == JOptionPane.OK_CANCEL_OPTION) {
			System.out.println("Escolha a opção afirmativa");
		} else {
			JOptionPane.showInternalMessageDialog(null, "Programa finalizado", input, resposta, null);;
		}
		
		}
		

	}

}
