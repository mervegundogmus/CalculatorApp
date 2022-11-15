package com.example;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.MatteBorder;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private double answer;
	private double number;
	int operation;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void addInput(String str) {
		input.setText(input.getText() + str);
	}
	
	public void calculate() {
		switch(operation) {
		case 1:
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 3:
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 4:
			answer = number / Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		case 5:
			answer = number % Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;	
		}
	}
	

	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 494, 527);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel screen = new JPanel();
		screen.setBackground(Color.WHITE);
		screen.setBounds(20, 10, 440, 179);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setEditable(false);
		input.setColumns(10);
		input.setBackground(Color.WHITE);
		input.setBounds(5, 99, 432, 74);
		screen.add(input);
		
		JLabel lbl = new JLabel("HESAP MAKİNESİ");
		lbl.setHorizontalAlignment(SwingConstants.CENTER);
		lbl.setForeground(Color.RED);
		lbl.setFont(new Font("Calibri", Font.BOLD, 40));
		lbl.setBounds(73, 22, 294, 67);
		screen.add(lbl);
		
		JPanel control = new JPanel();
		control.setBackground(Color.WHITE);
		control.setBounds(20, 211, 440, 261);
		contentPane.add(control);
		control.setLayout(new GridLayout(5, 4, 10, 10));
		
		JButton button_3 = new JButton("%");
		button_3.setBackground(Color.WHITE);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 5;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		
		JButton button_1 = new JButton("C");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		button_1.setBackground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_1);
		
		JButton btnX = new JButton("x²");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				int number, square;
				number = Integer.parseInt(input.getText());
					square = number*number;
				input.setText(Integer.toString(square));
			}
		});
		btnX.setBackground(Color.WHITE);
		btnX.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnX);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_3);
		
		JButton button_4 = new JButton("/");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_4.setBackground(Color.WHITE);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_4);
		
		JButton button_5 = new JButton("7");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_5.setBackground(Color.WHITE);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_5);
		
		JButton button_6 = new JButton("8");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_6.setBackground(Color.WHITE);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_6);
		
		JButton button_7 = new JButton("9");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_7.setBackground(Color.WHITE);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_7);
		
		JButton button_8 = new JButton("*");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_8.setBackground(Color.WHITE);
		button_8.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_8);
		
		JButton button_9 = new JButton("4");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_9.setBackground(Color.WHITE);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_9);
		
		JButton button_10 = new JButton("5");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_10.setBackground(Color.WHITE);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_10);
		
		JButton button_11 = new JButton("6");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_11.setBackground(Color.WHITE);
		button_11.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_11);
		
		JButton button_12 = new JButton("-");
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_12.setBackground(Color.WHITE);
		button_12.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_12);
		
		JButton button_13 = new JButton("1");
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_13.setBackground(Color.WHITE);
		button_13.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_13);
		
		JButton button_14 = new JButton("2");
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_14.setBackground(Color.WHITE);
		button_14.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_14);
		
		JButton button_15 = new JButton("3");
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_15.setBackground(Color.WHITE);
		button_15.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_15);
		
		JButton button_16 = new JButton("+");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		button_16.setBackground(Color.WHITE);
		button_16.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(button_16);
		
		JButton button17 = new JButton("!");
		button17.addActionListener(new ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent e) {
				int i, number;
				int fac = 1;
				number = Integer.parseInt(input.getText());
				for(i = number; i >= 1; i--) {
					fac *= i;
				}
				input.setText(Integer.toString(fac));
			}
			
		});
		button17.setFont(new Font("Tahoma", Font.BOLD, 23));
		button17.setBackground(Color.WHITE);
		control.add(button17);
		
		JButton button_18 = new JButton("0");
		button_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		button_18.setFont(new Font("Tahoma", Font.BOLD, 23));
		button_18.setBackground(Color.WHITE);
		control.add(button_18);
		
		JButton button_19 = new JButton(".");
		button_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(".");
			}
		});
		button_19.setFont(new Font("Tahoma", Font.BOLD, 23));
		button_19.setBackground(Color.WHITE);
		control.add(button_19);

		
		JButton button_20 = new JButton("=");
		button_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				lbl.setText("");
			}
		});
		button_20.setFont(new Font("Tahoma", Font.BOLD, 23));
		button_20.setBackground(Color.WHITE);
		control.add(button_20);
	}
}
