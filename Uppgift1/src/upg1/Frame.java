package upg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import java.awt.Color;

public class Frame extends JFrame {

	
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
			
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 473);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		panel.setBounds(0, 0, 576, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(28, 39, 483, 274);
		panel.add(textArea);
		
		
		//Skapar 3 hus
		House HouseObject = new House(1968, 40);
		House HouseObject2 = new House(1896,120);
		House HouseObject3 = new House(1920,80);
		
		//Skapar en array till mina hus
		House [] houseAr = new House[10];
		
		houseAr [0] = HouseObject;
		houseAr [1] = HouseObject2;
		houseAr [2] = HouseObject3;
		
		
		//Går igenom arrayen
		for(int i = 0;i<houseAr.length;i++){
			//Skriver bara ut om de inte är null
			if(houseAr[i] != null){
				int a = i + 1;// räknar från 1 till 2 osv.
			textArea.append("Hus nummer " + a+ " är byggt " +houseAr[i].getYear() + " och är " +houseAr[i].getSize() + " Kvm\n");
		}
		}
		//Skriver ut antalet hus
		textArea.append("Antal objekt: " + House.getNbrHouses());	
	
		
	}
}
