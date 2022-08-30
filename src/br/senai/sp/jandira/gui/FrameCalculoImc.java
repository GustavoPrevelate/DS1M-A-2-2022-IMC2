package br.senai.sp.jandira.gui;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Cliente;

import java.awt.*;

public class FrameCalculoImc {
	
	public String titulo;
	public int largura;
	public int altura;
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		// Obter a instâcia do painel de conteúdo(Container)
		Container painel = tela.getContentPane();
		painel.setBackground(Color.black);
		
		// Criar os componentes da tela e colocar no painel(Container)
		JLabel labelImc = new JLabel();
		labelImc.setText("IMC");
		labelImc.setFont(new Font ("Courier new", Font.BOLD,50));
		labelImc.setForeground(new Color(0, 250, 154));
		labelImc.setBounds(30, 30, 100, 50);
		
		JLabel labelNome = new JLabel();
		labelNome.setText("Nome:");
		labelNome.setBounds(30, 70, 100, 30);
		labelNome.setForeground(new Color(255, 0, 132));
		labelNome.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		JTextField textFieldNome = new JTextField();
		textFieldNome.setBounds(30, 100, 300, 30);
		textFieldNome.setForeground(Color.BLUE);
		
		JLabel labelPeso = new JLabel();
		labelPeso.setText("Peso:");
		labelPeso.setBounds(30, 130, 100, 30);
		labelPeso.setForeground(new Color(255, 0, 132));
		labelPeso.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		JTextField textFieldPeso = new JTextField();
		textFieldPeso.setBounds(30, 160, 300, 30);
		textFieldPeso.setForeground(Color.BLUE);
		
		JLabel labelAltura = new JLabel();
		labelAltura.setText("Altura:");
		labelAltura.setBounds(30, 190, 100, 30);
		labelAltura.setForeground(new Color(255, 0, 132));
		labelAltura.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		JTextField textFieldAltura = new JTextField();
		textFieldAltura.setBounds(30, 220, 300, 30);
		textFieldAltura.setForeground(Color.BLUE);
		
		JLabel labelDataNascimento = new JLabel();
		labelDataNascimento.setText("DataDeNascimento:");
		labelDataNascimento.setBounds(30, 250, 200, 30);
		labelDataNascimento.setForeground(new Color(255, 0, 132));
		labelDataNascimento.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		JTextField textFieldDataNascimento = new JTextField();
		textFieldDataNascimento.setBounds(30, 280, 300, 30);
		textFieldDataNascimento.setForeground(Color.BLUE);
		
		JLabel labelResultadoImc = new JLabel();
		labelResultadoImc.setText("Seu IMC é xxxx");
		labelResultadoImc.setBounds(30, 330, 400, 30);
		labelResultadoImc.setForeground(new Color(255, 0, 132));
		labelResultadoImc.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		JLabel labelStatusImc = new JLabel();
		labelStatusImc.setText("Seu Status IMC é xxxx");
		labelStatusImc.setBounds(30, 360, 400, 30);
		labelStatusImc.setForeground(new Color(255, 0, 132));
		labelStatusImc.setFont(new Font ("Cooper Black", Font.BOLD,18));
		
		// adicionar componentes ao painel (Container)
		JButton ButtonCalcular = new JButton();
		ButtonCalcular.setText("Calcular");
		ButtonCalcular.setBounds(370, 280, 150, 30);
		ButtonCalcular.setFont(new Font ("Cooper Black", Font.BOLD,18));
		ButtonCalcular.setForeground(new Color(255, 0, 132));
		
		//Eventos de click
		ButtonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Cliente cliente = new Cliente();
				cliente.nome = textFieldNome.getText();
				cliente.peso = Double.parseDouble(textFieldPeso.getText());
				cliente.altura = Double.parseDouble(textFieldAltura.getText());  
				
				labelResultadoImc.setText(cliente.nome + "Seu IMC é " + cliente.getImc());
				labelStatusImc.setText("STATUS:" + cliente.getStatus());
				
				
				
				
				
			}
		});
		
		textFieldNome.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		textFieldNome.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		//Adicionar o botão ao painel
		
		painel.add(labelImc);
		painel.add(ButtonCalcular);
		painel.add(labelNome);
		painel.add(textFieldNome);
		painel.add(labelPeso);
		painel.add(textFieldPeso);
		painel.add(labelAltura);
		painel.add(textFieldAltura);
		painel.add(labelDataNascimento);
		painel.add(textFieldDataNascimento);
		painel.add(labelResultadoImc);
		painel.add(labelStatusImc);
		
		tela.setVisible(true);
		
	}
	
}
