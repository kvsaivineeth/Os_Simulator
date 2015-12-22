//package page;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Color;

public class pagereplacement {

	private JFrame frame;
	private JTextField text;
	private JTextField text2;
	private JTextField text3;

	/**
	 * Launch the application.
	 */
	public static void DS() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pagereplacement window = new pagereplacement();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pagereplacement() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 764, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Page Replacement Algorithms");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(227, 11, 313, 50);
		frame.getContentPane().add(lblNewLabel);
		
		text = new JTextField();
		text.setBounds(290, 278, 201, 44);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblInput = new JLabel("   INPUT :");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblInput.setBounds(160, 288, 68, 23);
		frame.getContentPane().add(lblInput);
		
		text2 = new JTextField();
		text2.setBounds(290, 346, 204, 44);
		frame.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel lblOutput = new JLabel("OUTPUT :");
		lblOutput.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblOutput.setBounds(160, 360, 68, 14);
		frame.getContentPane().add(lblOutput);
		
		text3 = new JTextField();
		text3.setBounds(293, 210, 100, 38);
		frame.getContentPane().add(text3);
		text3.setColumns(10);
		
		JLabel lblFrame = new JLabel("Frame  Size:");
		lblFrame.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblFrame.setBounds(135, 204, 123, 46);
		frame.getContentPane().add(lblFrame);
		
		JButton button = new JButton("FIFO");
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				 String Val,v="";
										Val = text.getText();
										convert z = new convert(Val);
										int[] L= z.method1();
										int h = Integer.parseInt(text3.getText());
										 FIFO a1= new FIFO(h,L);
										 int r = a1.method();
										 v=v+""+r;
										//a1.Get(L,L.length);
										 
										text2.setText(v);
					
			}
		});
		button.setBounds(61, 98, 119, 50);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("LRU");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				  String Val,v="";
										Val = text.getText();
										convert z = new convert(Val);
										int[] L= z.method1();
										int h = Integer.parseInt(text3.getText());
										 LRU a1= new LRU(h,L);
										 int r = a1.method();
										 v=v+""+r;
										//a1.Get(L,L.length);
										 
										text2.setText(v);
										 
			}
		});
		button_1.setBounds(238, 98, 100, 50);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("Optimal");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String Val,v="";
					Val = text.getText();
					convert z = new convert(Val);
					int[] L= z.method1();
					int h = Integer.parseInt(text3.getText());
					 OPT a1= new OPT(h,L);
					 int r = a1.method();
					 v=v+""+r;
					//a1.Get(L,L.length);
					 
					text2.setText(v);

			}
		});
		button_2.setBounds(401, 98, 100, 50);
		frame.getContentPane().add(button_2);
		
		Icon I23 = new ImageIcon("back.jpg");
		JButton btnBack = new JButton(I23);
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Home x=new Home();
				x.Method();
				frame.setVisible(false);
			}
		});
		btnBack.setBounds(32, 35, 101, 50);
		frame.getContentPane().add(btnBack);
	}
}
