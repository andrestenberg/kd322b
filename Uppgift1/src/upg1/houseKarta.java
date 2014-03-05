package upg1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class houseKarta extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					houseKarta frame = new houseKarta();
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
	public houseKarta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpnHouseyearintsizeint = new JTextPane();
		txtpnHouseyearintsizeint.setText("House\r\n-year:int\r\n-size:int\r\n-nbrOfHouses:int\r\n+MIN_SIZE:int\r\n\r\n+House(year:int, size:int)\r\n+getNumberOfHouses()\r\ngetSize():int\r\ngetYear():int");
		txtpnHouseyearintsizeint.setBounds(10, 11, 196, 239);
		contentPane.add(txtpnHouseyearintsizeint);
	}
}
