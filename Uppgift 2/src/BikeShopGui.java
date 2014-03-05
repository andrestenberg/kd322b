import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;


public class BikeShopGui extends JFrame {
	
	/** deklarerar vardet for cyklarna*/	
	BikeStore myBikeStore = new BikeStore();

	private JPanel contentPane;
	private JTextField txtListOfBikes;
	private JTextField inputSize;
	private JTextField inputColor;
	private JTextField inputPrice;
	private JTextArea textArea;
	private JLabel lblSize;
	private JLabel lblColor;
	private JLabel lblPrice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BikeShopGui frame = new BikeShopGui();
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
	public BikeShopGui() {
		
			/** har laggs alla cyklar in*/
		myBikeStore.addBike("blue", 28, 3000);
		myBikeStore.addBike("green", 19, 12000);
	
		
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 350);
			contentPane = new JPanel();
			contentPane.setBackground(Color.WHITE);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			/** funktioner för knappen, add new*/
			textArea = new JTextArea();
			textArea.setEditable(false);
			textArea.setBackground(Color.LIGHT_GRAY);
			textArea.setBounds(28, 63, 208, 236);
			contentPane.add(textArea);
			textArea.setText(myBikeStore.getAllBikes());
			
			txtListOfBikes = new JTextField();
			txtListOfBikes.setFont(new Font("Tahoma", Font.PLAIN, 15));
			txtListOfBikes.setEditable(false);
			txtListOfBikes.setText("    Bike List");
			txtListOfBikes.setBounds(79, 23, 101, 28);
			contentPane.add(txtListOfBikes);
			txtListOfBikes.setColumns(10);
			
			inputSize = new JTextField();
			inputSize.setBackground(Color.WHITE);
			inputSize.setBounds(321, 23, 101, 28);
			contentPane.add(inputSize);
			inputSize.setColumns(10);
			
			inputColor = new JTextField();
			inputColor.setBounds(321, 57, 101, 28);
			contentPane.add(inputColor);
			inputColor.setColumns(10);
			
			inputPrice = new JTextField();
			inputPrice.setBounds(321, 94, 101, 28);
			contentPane.add(inputPrice);
			inputPrice.setColumns(10);
			
			lblSize = new JLabel("SIZE:");
			lblSize.setBounds(248, 29, 61, 16);
			contentPane.add(lblSize);
			
			lblColor = new JLabel("COLOR:");
			lblColor.setBounds(248, 63, 61, 16);
			contentPane.add(lblColor);
			
			lblPrice = new JLabel("PRICE:");
			lblPrice.setBounds(248, 100, 61, 16);
			contentPane.add(lblPrice);
			
			JButton btnNewButton = new JButton("Add Bike");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
						int storlek;
						int pris;
						try {
							storlek = Integer.parseInt(inputSize.getText());
							pris = Integer.parseInt(inputPrice.getText());
							myBikeStore.addBike(inputColor.getText(), storlek, pris);
							textArea.setText(myBikeStore.getAllBikes());
						}
						catch(NumberFormatException a){
							
						}
					
				}
			});
			btnNewButton.setBounds(262, 190, 119, 28);
			contentPane.add(btnNewButton);
		}
	}


