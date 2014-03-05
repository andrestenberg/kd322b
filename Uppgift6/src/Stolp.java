import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.util.ArrayList;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


public class Stolp extends JFrame {
	
	private Document doc;
	private ArrayList<Program> programsList = new ArrayList<Program>();	
	private JPanel contentPane;
	private Bargraph2 bargraph = new Bargraph2();
	
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
					Stolp frame = new Stolp();
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
	public Stolp() {
		setBounds(100, 100, 450, 300);
		
		
		/*ActionListener actionListener = new ActionListener() {
		      public void actionPerformed(ActionEvent actionEvent) {
		    	 
		    	 int index = comboBox.getSelectedIndex();
		    	  Program prog = programsList.get(index);
		  		prog.getMan();
		  		prog.getWomen();
		        
		      }
		    };
		    */
		

		
		
		
		comboBox = new JComboBox(); 
		comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				 bargraph.updateValues(programsList.get(comboBox.getSelectedIndex()).getWomen(),programsList.get(comboBox.getSelectedIndex()).getMan());
			}
		});
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
		comboBox.setBounds(30, 84, 343, 30);
		contentPane.add(comboBox);
		
		    
		
		bargraph.setBounds(27, 125, 336, 125);
		contentPane.add(bargraph);
		System.out.println(bargraph.getHeight());
		bargraph.repaint();
		
		//bargraph.updateValues();
		
		
				
			
		
		
		
		
		
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
		
		// Skapa programmet och lägg till i listan  
		Program program = new Program (name, code, women, men); 
		output.add(program); 
		}  
	  return output; } 
	}



