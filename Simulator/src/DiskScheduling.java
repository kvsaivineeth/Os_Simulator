import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;

public class DiskScheduling {

	private JFrame frame;
	private JComboBox Box;
	private JTextField Text;
	private JTextField head;
	private JTextField Text2;
	private JTextField Text4;
	private JButton Gen;

	/**
	 * Launch the application.
	 */
	public static void DS() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiskScheduling window = new DiskScheduling();
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
	public DiskScheduling() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBounds(100, 100, 766, 507);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Gen = new JButton("Generate Graph");
		Gen.setFont(new Font("Times New Roman", Font.BOLD, 15));
		Gen.setBounds(266, 257, 148, 28);
		frame.getContentPane().add(Gen);
		
		
		Box = new JComboBox();
		Box.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
		///	String X=String.valueOf(Box.getSelectedItem());
			//	Text.setText(X);
        			
				System.out.println((String)Box.getSelectedItem());
				if((String)Box.getSelectedItem()=="FCFS")
				{   	
										/*head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});*/
						Gen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if((String)Box.getSelectedItem()=="FCFS")
								{
								String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 FCFS a1= new FCFS(h,L);
								 int[] r = a1.method();
								 int y = a1.method3();
								  v= v+""+y;
								 Graph G = new Graph(r,r.length);
								G.test(r,r.length,"FCFS");
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								} 
								}
						});
					//	Box.removeItem("FCFS");
						
				}

				else if((String)Box.getSelectedItem()=="SSTF")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Gen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
								if((String)Box.getSelectedItem()=="SSTF")
								{
									String Val,S="",v="";
								
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 SSTF a1= new SSTF(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								//a1.Get(L,L.length);
								 v=v+""+y;
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length,"SSTF");
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								} 
							}
						});

						//Box.setSelectedItem();
						
				}
				else if((String)Box.getSelectedItem()=="SCAN")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Gen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								if((String)Box.getSelectedItem()=="SCAN")
								{
								//System.out.println("sTSAUD");
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Scan a1= new Scan(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length,"SCAN");
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								}
							}
						});
				}
				else if((String)Box.getSelectedItem()=="CSCAN")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Gen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
								if((String)Box.getSelectedItem()=="CSCAN")
								{
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Cscan a1= new Cscan(h,L);
								 int[] r = a1.method();
								 int y =a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length,"CScan");
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								}
							}
						});
				}
				else if((String)Box.getSelectedItem()=="CLOOK")
				{   		
						head.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent arg0) {
								String h=head.getText();
							}
						});
						Gen.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								//System.out.println("sTSAUD");
								if((String)Box.getSelectedItem()=="CLOOK")
								{
							      String Val,S="",v="";
								Val = Text.getText();
								convert z = new convert(Val);
								int[] L= z.method1();
								int h = Integer.parseInt(head.getText());
								 Clook a1= new Clook(h,L);
								 int[] r = a1.method();
								 int y= a1.method3();
								 v=v+""+y;
								//a1.Get(L,L.length);
								 Graph G = new Graph(r,r.length);
								  G.test(r,r.length,"CLook");
								   for(int i=0;i<r.length;i++)
							    	{ 
							    	S = S + " " + r[i];
							    	//System.out.println(r[i]);
							    	}
							  Text2.setText(S);
							  Text4.setText(v);
								//Text2.setText(""+r.length);
								}
							}
						});
				}
				
			}
		});
		Box.setBounds(350, 79, 94, 28);
		frame.getContentPane().add(Box);
		Box.addItem(".....");
		Box.addItem("FCFS");
		Box.addItem("SSTF");
		Box.addItem("SCAN");
		Box.addItem("CSCAN");
		Box.addItem("CLOOK");
		JLabel lblDiskSchedulingAlgorithms = new JLabel("Disk Scheduling Algorithms");
		lblDiskSchedulingAlgorithms.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblDiskSchedulingAlgorithms.setBounds(260, 11, 251, 28);
		frame.getContentPane().add(lblDiskSchedulingAlgorithms);
		
		Text = new JTextField();
		
		Text.setBounds(350, 198, 202, 28);
		frame.getContentPane().add(Text);
		Text.setColumns(10);
		
		head = new JTextField();
		head.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		head.setColumns(10);
		head.setBounds(350, 144, 102, 28);
		frame.getContentPane().add(head);
		
		Text2 = new JTextField();
		Text2.setColumns(10);
		Text2.setBounds(350, 377, 202, 28);
		frame.getContentPane().add(Text2);
		
		JLabel lblHead = new JLabel("Head :");
		lblHead.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHead.setBounds(222, 149, 63, 14);
		frame.getContentPane().add(lblHead);
		
		JLabel lblInput = new JLabel("Input :");
		lblInput.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblInput.setBounds(222, 203, 63, 14);
		frame.getContentPane().add(lblInput);
		
		JLabel lblNewLabel = new JLabel("Output:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(225, 382, 77, 14);
		frame.getContentPane().add(lblNewLabel);
		
		Text4 = new JTextField();
		Text4.setBounds(350, 322, 94, 28);
		frame.getContentPane().add(Text4);
		Text4.setColumns(10);
		
		JLabel lblHeadMovement = new JLabel("Total Head Movements:");
		lblHeadMovement.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblHeadMovement.setBounds(112, 324, 202, 21);
		frame.getContentPane().add(lblHeadMovement);
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
		
		JLabel lblAlgorithm = new JLabel("Algorithm :");
		lblAlgorithm.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAlgorithm.setBounds(200, 80, 102, 23);
		frame.getContentPane().add(lblAlgorithm);
		
		
		

	}
}
