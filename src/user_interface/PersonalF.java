package user_interface;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;

public class PersonalF extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PersonalF frame = new PersonalF();
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
	public PersonalF() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 942, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(47, 52, 836, 392);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Añadir Variable", null, panel, null);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Añadir Criterios", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Tabla C", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Tabla Llena", null, panel_3, null);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Matriz Cuadrada", null, panel_4, null);
	}
}
