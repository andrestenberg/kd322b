import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.DefaultComboBoxModel;

import java.lang.Object;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JComponent;

import javax.swing.JTextArea;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JComboBox;


import java.awt.*;
import java.awt.event.*;
import java.awt.image.ImageObserver;
import java.io.Serializable;
import java.awt.Label;
/**
 * 
 * @author André
 * @param ht2013_antagning.xml
 * @return 
 */


public class Dom extends JFrame {
	
	private Document doc;
	private ArrayList<Program> programsList = new ArrayList<Program>();
	
	

	private JPanel contentPane;

	JComponent comp;
	JComboBox comboBox;
	
	private Document openXmlFile(String fileName) { 
		Document doc = null;
		try { 
			File fXmlFile = new File(fileName);  
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();  
			doc = dBuilder.parse(fXmlFile);   
			doc.getDocumentElement().normalize();
			} catch
			(Exception e) {
				e.printStackTrace();  
				} 
		return doc; }  
	
	
	
	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dom frame = new Dom();
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
	
	

	public Dom () {
		
		
		comboBox = new JComboBox(); 
		doc = openXmlFile("ht2013_antagning.xml");
		Element root = doc.getDocumentElement(); 
		NodeList nodes = root.getChildNodes();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(20, 50, 256, 23);
		contentPane.add(lblNewLabel);
		lblNewLabel.setText("Antal Program: " + loadAllPrograms().size());
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(20, 25, 185, 14);
		contentPane.add(lblNewLabel_1);
		lblNewLabel_1.setText("Första Elementet: " + root.getNodeName());
		
		programsList = loadAllPrograms();
		comboBox.setModel(new DefaultComboBoxModel(programsList.toArray()));
		comboBox.setBounds(30, 84, 326, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(30, 184, 362, 66);
		contentPane.add(lblNewLabel_2);
		
		
		
	
		
		
	}
	












	private ArrayList<Program> loadAllPrograms() {
	ArrayList<Program> output = new ArrayList<Program>();  
	  // Hämta alla program
	NodeList programs = doc.getElementsByTagName("Program");  
	for (int i = 0; i < programs.getLength(); i++) {  
	    // Gör om varje nod i listan till ett element
		Node node = programs.item(i); 
		Element elm = (Element) node;  
	    // Hämta data från elementet 
		String name = elm.getElementsByTagName("name").item(0).getTextContent();
		String code = elm.getElementsByTagName("code").item(0).getTextContent();
		int women = Integer.parseInt(elm.getElementsByTagName("women").item(0).getTextContent());
		int men = Integer.parseInt(elm.getElementsByTagName("men").item(0).getTextContent());
		
		// Gör detta för alla fyra olika data! (namn, kod, antal kvinnor, antal män) 
		// Skapa programmet och lägg till i listan  
		Program program = new Program (name, code, women, men); 
		output.add(program);   }  
	  return output; } 
}
