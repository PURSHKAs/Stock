package frame;
import store.Controller;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JList;
import javax.swing.JTable;

public class StoreFrame extends JFrame {

	private JPanel contentPane;
	private Controller TheController;
	private JTable table;
	
	public StoreFrame(Controller c) {
		setType(Type.UTILITY);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 700);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		setLocationRelativeTo(null);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(106, 130, 806, 466);
		contentPane.add(table);
	}
}
