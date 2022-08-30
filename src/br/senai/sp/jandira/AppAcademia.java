package br.senai.sp.jandira;

import java.time.LocalDate;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.gui.FrameCalculoImc;
import br.senai.sp.jandira.model.Cliente;

public class AppAcademia {

	public static void main(String[] args) {
		
		FrameCalculoImc tela = new FrameCalculoImc();
		tela.titulo = "Calculadora IMC";
		tela.altura = 600;
		tela.largura = 600;
		tela.criarTela();
		
//		Cliente ana = new Cliente();
//		Cliente pedro = new Cliente();
//		
//		System.out.println(ana);
//		System.out.println(pedro);
//		
//		ana.nome = "Ana Maria Brega";
//		ana.dataDeNascimento = LocalDate.of(1950, 6, 21);
//		ana.peso = 62;
//		ana.altura = 1.68;
//		double xx = ana.getImc();
//		System.out.println(xx);
//		String teste = ana.getStatus();
//		JOptionPane.showMessageDialog(null,  teste);
//		
//		pedro.nome = "Pedro Dias";
//		pedro.dataDeNascimento = LocalDate.of(2000, 2, 28);
		
	}

}
