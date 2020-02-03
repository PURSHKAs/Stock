package frame;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import store.Controller;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Mainframe extends JFrame {

	private JPanel contentPane;
	private Controller TheController;
	
	public Mainframe(Controller c) {
		TheController = c;
		
		
		setBackground(Color.BLACK);
		setType(Type.UTILITY);
		setForeground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 724, 518);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BtnStore = new JButton("Store");
		BtnStore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				StoreFrame SF = new StoreFrame(c);
				SF.setVisible(true);
				setVisible(false);
			}
		});
		BtnStore.setForeground(Color.WHITE);
		BtnStore.setBackground(Color.BLACK);
		BtnStore.setFont(new Font("Dialog", Font.BOLD, 50));
		BtnStore.setBounds(29, 363, 200, 100);
		contentPane.add(BtnStore);
		
		JButton BtnOrder = new JButton("Order");
		BtnOrder.setBackground(Color.BLACK);
		BtnOrder.setForeground(Color.WHITE);
		BtnOrder.setFont(new Font("Dialog", Font.BOLD, 50));
		BtnOrder.setBounds(265, 363, 200, 100);
		contentPane.add(BtnOrder);
		
		JButton BtnSupplier = new JButton("Supplier");
		BtnSupplier.setForeground(Color.WHITE);
		BtnSupplier.setBackground(Color.BLACK);
		BtnSupplier.setFont(new Font("Dialog", Font.BOLD, 40));
		BtnSupplier.setBounds(492, 363, 200, 100);
		contentPane.add(BtnSupplier);
		
		JLabel Logo = new JLabel("PURSHKA's");
		Logo.setForeground(Color.WHITE);
		Logo.setBackground(Color.WHITE);
		Logo.setFont(new Font("Dialog", Font.BOLD, 99));
		Logo.setBounds(84, 12, 581, 226);
		contentPane.add(Logo);
	}
}
