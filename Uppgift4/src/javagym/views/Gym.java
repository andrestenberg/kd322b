package javagym.views;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.Color;

import javax.swing.border.LineBorder;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Gym extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Throwable e) {
			e.printStackTrace();
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gym frame = new Gym();
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
	public Gym() {
		setTitle("Gerras Gym");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 468);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		mnArkiv.setIcon(null);
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Gerras\r\nGym");
		lblNewLabel.setFont(new Font("Segoe Script", Font.PLAIN, 56));
		lblNewLabel.setIcon(new ImageIcon(Gym.class.getResource("/Image/header.jpg")));
		lblNewLabel.setBounds(10, 11, 663, 103);
		contentPane.add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(194, 125, 479, 272);
		contentPane.add(scrollPane);
		
		table_2 = new JTable(30,2);
		scrollPane.setViewportView(table_2);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"Erik", "Andersson"},
				{"Robin", "Alestam"},
				{"Anders", "Bergqvist"},
				{"Hulda", "Dallert"},
				{"Ylva", "Erneholm"},
				{"Gustav", "Friberg"},
				{"Karl", "Fransson"},
				{"Anna", "GymmarN"},
				{"Mahmud", "Ishtar"},
				{"Kit", "Kat"},
				{"B\u00F6rje", "Bus"},
				{"David", "Unter"},
				{"Sture", "Polis"},
				{"Mohammed", "Gishnash"},
				{"Jonas", "Karlsson"},
				{"Jon", "Frost"},
				{"Tok", "Lasse"
					},
			},
			new String[] {
				"F\u00F6rnamn", "Efternamn"
			}
		));
		table_2.getColumnModel().getColumn(1).setPreferredWidth(117);
		table_2.getColumnModel().getColumn(1).setMinWidth(22);
		
		JPanel panel = new JPanel();
		scrollPane.setRowHeaderView(panel);
		
		JButton btnOmGerras = new JButton("Om Gerras");
		btnOmGerras.setBounds(20, 128, 89, 23);
		contentPane.add(btnOmGerras);
		
		JButton btnTrning = new JButton("Tr\u00E4ning");
		btnTrning.setBounds(20, 173, 89, 23);
		contentPane.add(btnTrning);
		
		JButton btnKurser = new JButton("Kurser");
		btnKurser.setBounds(20, 216, 89, 23);
		contentPane.add(btnKurser);
		
		
		
		
	
		

		
	}
}
